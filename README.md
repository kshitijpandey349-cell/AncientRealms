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

The repository contains the wrapper distribution configuration. Generate the platform wrapper scripts and wrapper JAR once with `gradle wrapper --gradle-version 9.8.2`, then use `gradlew.bat build` on Windows or `./gradlew build` on Linux/macOS.

## Data generation

Data generation is enabled in `build.gradle`. After generating the Gradle run configurations, use the `runDatagen` task. Generated files are written under `src/main/generated`.

## Project rules

Read [MASTER_PROMPT.md](MASTER_PROMPT.md) and [DEVELOPMENT_STATUS.md](DEVELOPMENT_STATUS.md) at the start of each work session. Build and test before claiming a phase works, update the status after every phase, and commit each working phase.

## Scope

The foundation focuses on the Fabric project setup, progression materials, world generation, dragon-themed exploration, configuration, data generation, and crafting-station infrastructure. Weapon/combat implementation is intentionally outside this starter scaffold.
