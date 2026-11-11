# Ancient Realms

A Fabric mod project for Minecraft Java 26.2, built with Java 25 and Mojang mappings.

> Project status: foundation scaffold. See [DEVELOPMENT_STATUS.md](DEVELOPMENT_STATUS.md) before starting work.

## Requirements

- Minecraft Java 26.2
- Java Development Kit 25
- Fabric Loader 0.20.1
- Fabric API 0.161.0+26.2
- Fabric Loom 1.19-SNAPSHOT
- Gradle 9.8.2 (wrapper configuration)

## Build

On Windows, install JDK 25 and Gradle 9.8.2, then run:

```powershell
gradle build
```

On Linux/macOS:

```bash
gradle build
```

The repository includes the Gradle wrapper JAR and distribution configuration. The launch scripts (`gradlew` and `gradlew.bat`) still need to be generated once with `gradle wrapper --gradle-version 9.8.2`. After that, use `gradlew.bat build` on Windows or `./gradlew build` on Linux/macOS.

## Data generation

Data generation is part of the Phase 1 implementation plan but is not wired up yet. The `runDatagen` task will be documented here once its entrypoint and providers are implemented.

## Project rules

Read [MASTER_PROMPT.md](MASTER_PROMPT.md) and [DEVELOPMENT_STATUS.md](DEVELOPMENT_STATUS.md) at the start of each work session. Build and test before claiming a phase works, update the status after every phase, and commit each working phase.

## Scope

The foundation focuses on the Fabric project setup, progression materials, world generation, dragon-themed exploration, configuration, data generation, and crafting-station infrastructure. Weapon/combat implementation is intentionally outside this starter scaffold.
