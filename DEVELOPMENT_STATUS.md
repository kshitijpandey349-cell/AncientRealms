# Development Status

Last updated: 2026-11-11

## Repository
- GitHub: https://github.com/kshitijpandey349-cell/AncientRealms
- Visibility: Public
- Default branch: main

## Toolchain
- Minecraft 26.2
- Java 25
- Fabric Loader 0.20.1
- Fabric API 0.161.0+26.2
- Fabric Loom 1.19-SNAPSHOT
- Gradle 9.8.2

## Phase 1 — Foundation
Status: **Base scaffold present; build verification remains in progress.**
- [x] Gradle/Loom project, metadata, common/client entrypoints.
- [x] Wrapper JAR and wrapper distribution properties.
- [x] GitHub Actions workflow and project documentation.
- [ ] Generate wrapper launch scripts.
- [ ] Successful clean build and runtime launch verification.
- [ ] Config system and dedicated creative tab.
- [ ] Verify datagen task end-to-end.

## Phase 2 — Materials, world generation, and crafting
Status: **Implementation committed; compile and in-game verification pending.**

Added:
- [x] 17 material item registrations.
- [x] 15 ore block registrations.
- [x] 15 configured/placed ore feature JSON pairs and Overworld biome registration.
- [x] Ore smelting recipes and block loot tables.
- [x] Pickaxe and mining-level tags.
- [x] Material item tag.
- [x] Eight workstation blocks with server-opened vanilla 3×3 crafting menus.
- [x] Workstation crafting recipes.
- [x] Initial item/block models, client item definitions, blockstates, and translations.
- [x] Fabric datagen entrypoint and Gradle datagen task configuration.

Known limitations:
- Models reuse vanilla textures as placeholders.
- Workstations share the vanilla crafting recipe system; station-specific recipe types and persistent processing inventories remain future work.
- JSON resources are currently hand-authored; datagen provider classes are not yet generating them.
- Weapon and combat implementation is outside this project's supported scope.

## Verification log
- Earlier CI runs failed first because the Gradle configuration cache was enabled with an incompatible `processResources` closure, then because `modImplementation` was used instead of the official Fabric 26.2 example's `implementation` configuration.
- The build script has now been aligned with FabricMC's official 26.2 example project and configuration cache is disabled.
- The latest CI run must complete before this phase can be called build-verified.
- No client launch or in-game test has yet been observed.

## Next steps
1. Confirm GitHub Actions build succeeds; fix any compile or resource errors.
2. Run `runDatagen` and verify task completion.
3. Launch a client and test ore generation, station placement, menus, and crafting.
4. Replace placeholder textures with original pixel art.
5. Add station-specific recipe behavior and persistent processing where needed.
