# Ancient Realms

A Fabric mod for Minecraft Java 26.2, built with Java 25 and Mojang mappings.

## Phase 2 content added

- 17 progression material items.
- 15 ore blocks with Overworld configured and placed feature data.
- Ore smelting recipes, block loot tables, mining tags, and a material item tag.
- Eight crafting workstations. Each opens a server-side 3×3 crafting menu using the vanilla crafting recipe system.
- Workstation crafting recipes.
- Initial item/block models, client item definitions, blockstates, and English translations.
- Fabric data-generation entrypoint and Gradle datagen task configuration.

**Art note:** the first-pass models reuse vanilla textures as placeholders. Original Ancient Realms pixel-art textures remain a polish task.

**Workstation note:** all eight stations currently share the vanilla 3×3 crafting interface and recipe system. Dedicated station-specific recipes and persistent processing inventories are not yet implemented.

## Requirements

- Minecraft Java 26.2
- Java Development Kit 25
- Fabric Loader 0.20.1
- Fabric API 0.161.0+26.2
- Fabric Loom 1.19-SNAPSHOT
- Gradle 9.8.2

## Build on Windows

Install JDK 25 and Gradle 9.8.2, then from the repository folder run:

```powershell
gradle build
gradle runDatagen
```

The wrapper JAR and distribution properties are committed. Generate the platform launch scripts once with `gradle wrapper --gradle-version 9.8.2`, then use `.\gradlew.bat build`.

## Project rules

Read [MASTER_PROMPT.md](MASTER_PROMPT.md) and [DEVELOPMENT_STATUS.md](DEVELOPMENT_STATUS.md) at the start of every work session. Build and test before claiming a phase works, update the status after every phase, and commit each working phase.

## Scope

The project focuses on exploration, progression materials, world generation, crafting, dragon-themed systems, configuration, and cosmetics. Weapon and combat implementation is not included.
