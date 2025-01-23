package net.agmtagious.skibiditymod.sound;

import net.agmtagious.skibiditymod.SkibidityMod;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent CHISEL_USE = registerSoundEvent("chisel_use");

    public static final SoundEvent MAGIC_BLOCK_BREAK = registerSoundEvent("magic_block_break");
    public static final SoundEvent MAGIC_BLOCK_STEP = registerSoundEvent("magic_block_step");
    public static final SoundEvent MAGIC_BLOCK_PLACE = registerSoundEvent("magic_block_place");
    public static final SoundEvent MAGIC_BLOCK_HIT = registerSoundEvent("magic_block_hit");
    public static final SoundEvent MAGIC_BLOCK_FALL = registerSoundEvent("magic_block_fall");

    public static final BlockSoundGroup MAGIC_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            MAGIC_BLOCK_BREAK, MAGIC_BLOCK_STEP, MAGIC_BLOCK_PLACE, MAGIC_BLOCK_HIT, MAGIC_BLOCK_FALL);


        //EXAMPLE song
        public static final SoundEvent BAR_BRAWL = registerSoundEvent("bar_brawl");
        public static final RegistryKey<JukeboxSong> BAR_BRAWL_KEY =
                RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SkibidityMod.MOD_ID, "bar_brawl"));

            //MAY IT NEVER FALTER GLAIVE songs
            public static final SoundEvent GLAIVE_FGAC = registerSoundEvent("glaive_fgac");
            public static final RegistryKey<JukeboxSong> GLAIVE_FGAC_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SkibidityMod.MOD_ID, "glaive_fgac"));

            public static final SoundEvent GLAIVE_ISK = registerSoundEvent("glaive_isk");
            public static final RegistryKey<JukeboxSong> GLAIVE_ISK_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SkibidityMod.MOD_ID, "glaive_isk"));

            public static final SoundEvent GLAIVE_COUNT_IT_UP = registerSoundEvent("glaive_count_it_up");
            public static final RegistryKey<JukeboxSong> GLAIVE_COUNT_IT_UP_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SkibidityMod.MOD_ID, "glaive_count_it_up"));

            public static final SoundEvent GLAIVE_IK = registerSoundEvent("glaive_ik");
            public static final RegistryKey<JukeboxSong> GLAIVE_IK_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SkibidityMod.MOD_ID, "glaive_ik"));

            public static final SoundEvent GLAIVE_JOEL = registerSoundEvent("glaive_joel");
            public static final RegistryKey<JukeboxSong> GLAIVE_JOEL_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SkibidityMod.MOD_ID, "glaive_joel"));

            public static final SoundEvent GLAIVE_LND = registerSoundEvent("glaive_lnd");
            public static final RegistryKey<JukeboxSong> GLAIVE_LND_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SkibidityMod.MOD_ID, "glaive_lnd"));

            public static final SoundEvent GLAIVE_KRD = registerSoundEvent("glaive_kdr");
            public static final RegistryKey<JukeboxSong> GLAIVE_KRD_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SkibidityMod.MOD_ID, "glaive_kdr"));

            public static final SoundEvent GLAIVE_EHID = registerSoundEvent("glaive_ehid");
            public static final RegistryKey<JukeboxSong> GLAIVE_EHID_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SkibidityMod.MOD_ID, "glaive_ehid"));

            public static final SoundEvent GLAIVE_FREUDIAN = registerSoundEvent("glaive_freudian");
            public static final RegistryKey<JukeboxSong> GLAIVE_FREUDIAN_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SkibidityMod.MOD_ID, "glaive_freudian"));

            public static final SoundEvent GLAIVE_NFAMO = registerSoundEvent("glaive_nfamo");
            public static final RegistryKey<JukeboxSong> GLAIVE_NFAMO_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SkibidityMod.MOD_ID, "glaive_nfamo"));

            public static final SoundEvent GLAIVE_bb = registerSoundEvent("glaive_bb");
            public static final RegistryKey<JukeboxSong> GLAIVE_BB_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SkibidityMod.MOD_ID, "glaive_bb"));







    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(SkibidityMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        SkibidityMod.LOGGER.info("Registering Mod Sounds for " + SkibidityMod.MOD_ID);
    }
}
