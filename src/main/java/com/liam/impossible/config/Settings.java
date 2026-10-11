package com.liam.impossible.config;

/** The original gameplay options. Flash effects are opt-in, as in the source. */
public record Settings(int difficulty, int dragonDifficulty, boolean armorSlowdown,
                       boolean endermen, boolean chests, boolean flashbang) {
    public static final Settings DEFAULT = new Settings(2,2,true,true,true,false);
    public boolean valid() { return difficulty>=1 && difficulty<=3 && dragonDifficulty>=1 && dragonDifficulty<=3; }
    public Settings with(int index, int value) {
        return switch(index) {
            case 0 -> new Settings(value,dragonDifficulty,armorSlowdown,endermen,chests,flashbang);
            case 1 -> new Settings(difficulty,value,armorSlowdown,endermen,chests,flashbang);
            case 2 -> new Settings(difficulty,dragonDifficulty,value!=0,endermen,chests,flashbang);
            case 3 -> new Settings(difficulty,dragonDifficulty,armorSlowdown,value!=0,chests,flashbang);
            case 4 -> new Settings(difficulty,dragonDifficulty,armorSlowdown,endermen,value!=0,flashbang);
            case 5 -> new Settings(difficulty,dragonDifficulty,armorSlowdown,endermen,chests,value!=0);
            default -> throw new IllegalArgumentException("Setting index "+index);
        };
    }
    public int value(int index) {
        return switch(index) { case 0->difficulty; case 1->dragonDifficulty; case 2->armorSlowdown?1:0;
            case 3->endermen?1:0; case 4->chests?1:0; case 5->flashbang?1:0; default->throw new IllegalArgumentException(); };
    }
}
