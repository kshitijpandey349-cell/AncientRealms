# Ancient Realms — Master Project Specification

## Non-negotiable project rules
- Target Minecraft Java 26.2 only.
- Fabric only; do not use Forge or NeoForge.
- Java 25 and Mojang mappings.
- Mod ID: `ancientrealms`.
- Base package: `com.ancientrealms`.
- Read this file and `DEVELOPMENT_STATUS.md` at the start of every work session.
- Verify APIs against the exact target version and official documentation/source before using them.
- Build and test before reporting that something works. Clearly report anything not tested.
- Update `DEVELOPMENT_STATUS.md` after every phase.
- Commit each completed working phase.
- Keep dependencies explicit; do not silently change versions.
- Include data generation and keep generated resources reproducible.

## Current recommended 26.2 toolchain
The initial versions are taken from the FabricMC example project's 26.2 branch:
- Minecraft: 26.2
- Java: 25
- Fabric Loader: 0.20.1
- Fabric API: 0.161.0+26.2
- Fabric Loom: 1.19-SNAPSHOT
- Gradle wrapper distribution: 9.8.2

Re-check Fabric's version guidance before upgrading these values.

## Project vision
Build a polished fantasy exploration and progression mod called **Ancient Realms: Rise of the Dragon Kingdoms**. The intended long-term scope includes:
- A structured progression system with unlockable abilities.
- Ancient materials, ores, and resource discovery.
- Dragon-themed exploration, discoveries, and non-graphic creature interactions.
- Eight distinct crafting stations with functional menus, block entities, and recipes.
- Custom dimensions and boss-themed exploration encounters.
- Configurable gameplay systems and clear multiplayer-safe behavior.
- Generated assets, tags, recipes, loot tables, and world-generation data.

## Phase roadmap
### Phase 1 — Foundation
- Gradle/Loom project and metadata.
- Common and client entrypoints.
- Package layout and registration conventions.
- Configuration foundation.
- Creative tab and initial non-combat material content.
- Data-generation setup.
- README, status tracking, CI build workflow, and Git discipline.

### Phase 2 — Materials, world generation, and crafting
- 17 progression materials and their item/block resources.
- Ore placement and world-generation data.
- Eight crafting stations with functional menus, block entities, and recipes.
- Tags, loot tables, generated language/model/blockstate assets.
- Configuration and validation.

### Phase 3+ — Exploration and progression
- Dragon-themed discovery and creature systems.
- Dimensions, exploration encounters, progression abilities, and multiplayer testing.
- Cosmetics, accessibility, performance, and compatibility polish.

## Scope boundary
This scaffold is focused on exploration, progression materials, dragon-themed systems, world generation, crafting, configuration, and cosmetics. Weapon and combat implementation is not included.
