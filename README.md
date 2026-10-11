<div align="center">

# ☠️ LM-ImpossibleDifficulty

**Привычный Minecraft. Непривычно опасное выживание.**

![Minecraft](https://img.shields.io/badge/Minecraft-1.21.11-62B47A?style=flat-square)
![Fabric](https://img.shields.io/badge/Loader-Fabric-DBBFA0?style=flat-square)
![Java](https://img.shields.io/badge/Java-21%2B-E89135?style=flat-square)
[![Release](https://img.shields.io/github/v/release/L1amqq/LM-ImpossibleDifficulty?style=flat-square&label=Скачать)](https://github.com/L1amqq/LM-ImpossibleDifficulty/releases/latest)

</div>

Мод Fabric превращает выживание в испытание: знакомые мобы, блоки и предметы получают неожиданные опасные механики. Основан на Impossible Difficulty Datapack; игровые механики реализованы на Java.

- **48 событий:** необычные враги, ловушки, взрывающийся уголь и лучи светокамня в аду.
- **Кристаллохребет:** особый дракон с анимациями, фазами боя и собственным босбаром.
- **Настраиваемая сложность**, русское руководство и интерфейс настроек через Mod Menu.

## Установка

Нужны **Minecraft Java 1.21.11**, **Fabric Loader 0.18.4+**, **Fabric API** для этой версии и **Java 21+**. Mod Menu — по желанию, для экрана настроек.

Скачайте JAR из [последнего релиза](https://github.com/L1amqq/LM-ImpossibleDifficulty/releases/latest) и поместите в папку `mods`. Для совместной игры установите мод и Fabric API на сервер и клиенты.

## Сборка

Требуется JDK 21 или новее. Gradle Wrapper включён в репозиторий.

```powershell
# Windows
.\gradlew.bat build
```

```sh
# Linux / macOS
./gradlew build
```

Готовый JAR появится в `build/libs/`. Серверную проверку механик можно запустить командой `gradlew.bat runSmoke` (Linux / macOS: `./gradlew runSmoke`).

---

**LIAM** · [YouTube](https://www.youtube.com/@liamkkd) · [Лицензия CC BY-NC-ND 4.0](license.txt)
