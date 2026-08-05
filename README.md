# CBC Military Supplement Fix

A small compatibility fix for **CBC Military Supplement 2.1.0 for Minecraft 1.21.1**.

It prevents a startup crash on newer NeoForge versions caused by duplicate
registration of the `cbcmoreshells:sonar_pulse` sound event:

```text
java.lang.IllegalStateException: Adding duplicate key 'ResourceKey[minecraft:sound_event / cbcmoreshells:sonar_pulse]'
```

Install this fix alongside the original CBC Military Supplement mod.

Once the original mod author fixes this issue, this project will be archived.
