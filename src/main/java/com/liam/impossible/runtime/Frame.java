package com.liam.impossible.runtime;

import net.minecraft.commands.CommandSourceStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.NumericTag;
import net.minecraft.nbt.FloatTag;
import net.minecraft.nbt.DoubleTag;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.regex.*;

/** A Java invocation's position, executor and typed macro arguments. */
public record Frame(CommandSourceStack source, CompoundTag arguments) {
    private static final Pattern MACRO=Pattern.compile("\\$\\(([^)]+)\\)");
    // Match Minecraft's numeric macro formatting; coordinate parsers reject exponent notation.
    private static final ThreadLocal<DecimalFormat> DECIMALS=ThreadLocal.withInitial(()->{
        var format=new DecimalFormat("#",DecimalFormatSymbols.getInstance(Locale.ROOT));
        format.setMaximumFractionDigits(15);return format;
    });
    public Frame(CommandSourceStack source) { this(source, new CompoundTag()); }
    public Frame with(CommandSourceStack next) { return new Frame(next, arguments); }
    public String expand(String value) {
        if (!value.contains("$(")) return value;
        Matcher m = MACRO.matcher(value);
        StringBuilder out = new StringBuilder();
        while (m.find()) {
            Tag tag = arguments.get(m.group(1));
            if (tag == null) throw new IllegalArgumentException("Missing macro argument: " + m.group(1));
            String replacement = tag instanceof StringTag s?s.value():
                tag instanceof FloatTag||tag instanceof DoubleTag?DECIMALS.get().format(((NumericTag)tag).doubleValue()):
                tag instanceof NumericTag n?Long.toString(n.longValue()):tag.toString();
            m.appendReplacement(out, Matcher.quoteReplacement(replacement));
        }
        return m.appendTail(out).toString();
    }
    public String[] expand(String[] values) {
        String[] result = new String[values.length];
        for (int i=0; i<values.length; i++) result[i]=expand(values[i]);
        return result;
    }
}
