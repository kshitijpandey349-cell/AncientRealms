# Ancient Realms — Master Project Specification

## Non-negotiable rules
- Minecraft Java 26.2 only; Fabric only; Java 25; Mojang mappings.
- Mod ID `ancientrealms`; package root `com.ancientrealms`.
- Read this file and `DEVELOPMENT_STATUS.md` at the start of every session.
- Verify APIs against exact-version Fabric documentation/source.
- Build and test before claiming something works; report untested work honestly.
- Update `DEVELOPMENT_STATUS.md` after every phase and commit each working phase.
- Do not silently change dependency versions.
- Include reproducible data-generation support.

## Toolchain
- Minecraft 26.2
- Java 25
- Fabric Loader 0.20.1
- Fabric API 0.161.0+26.2
- Fabric Loom 1.19-SNAPSHOT
- Gradle 9.8.2

## Project vision
Ancient Realms: Rise of the Dragon Kingdoms is a fantasy exploration and progression mod featuring:
- 17 progression materials and discoverable ore deposits.
- Ore generation and a progression path for resource discovery.
- Eight crafting workstations.
- Dragon-themed exploration and non-graphic creature interactions.
- Future dimensions, exploration encounters, progression abilities, cosmetics, and multiplayer-safe systems.

## Phase 1 — Foundation
Gradle project, Fabric metadata, entrypoints, documentation, CI, and data-generation configuration.

## Phase 2 — Materials, world generation, and crafting
- 17 material items.
- Ore blocks, configured/placed features, and Overworld biome injection.
- Eight usable crafting stations with menus.
- Recipes, loot tables, item/block tags, models, blockstates, and translations.

## Phase 3+ — Exploration and progression
Dragon-themed discoveries, creature interactions, dimensions, encounters, abilities, multiplayer tests, accessibility, and performance.

## Scope boundary
This project scaffold supports exploration, progression materials, world generation, crafting, dragon-themed systems, and cosmetics. Weapon and combat implementation is excluded.
