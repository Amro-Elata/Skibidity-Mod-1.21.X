package net.agmtagious.skibiditymod.item;

import net.agmtagious.skibiditymod.SkibidityMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.agmtagious.skibiditymod.block.ModBlocks;
import net.agmtagious.skibiditymod.entity.ModEntities;
import net.agmtagious.skibiditymod.item.custom.ChiselItem;
import net.agmtagious.skibiditymod.item.custom.HammerItem;
import net.agmtagious.skibiditymod.item.custom.ModArmorItem;
import net.agmtagious.skibiditymod.item.custom.TomahawkItem;
import net.agmtagious.skibiditymod.sound.ModSounds;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));
    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFLOWER)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.skibiditymod.cauliflower.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item STARLIGHT_ASHES = registerItem("starlight_ashes", new Item(new Item.Settings()));

    public static final Item PINK_GARNET_SWORD = registerItem("pink_garnet_sword",
            new SwordItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 3, -2.4f))));
    public static final Item PINK_GARNET_PICKAXE = registerItem("pink_garnet_pickaxe",
            new PickaxeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 1, -2.8f))));
    public static final Item PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel",
            new ShovelItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 1.5f, -3.0f))));
    public static final Item PINK_GARNET_AXE = registerItem("pink_garnet_axe",
            new AxeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 6, -3.2f))));
    public static final Item PINK_GARNET_HOE = registerItem("pink_garnet_hoe",
            new HoeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 0, -3f))));

    public static final Item PINK_GARNET_HAMMER = registerItem("pink_garnet_hammer",
            new HammerItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 7, -3.4f))));

    public static final Item PINK_GARNET_HELMET = registerItem("pink_garnet_helmet",
            new ModArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item PINK_GARNET_CHESTPLATE = registerItem("pink_garnet_chestplate",
            new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item PINK_GARNET_LEGGINGS = registerItem("pink_garnet_leggings",
            new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item PINK_GARNET_BOOTS = registerItem("pink_garnet_boots",
            new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item PINK_GARNET_HORSE_ARMOR = registerItem("pink_garnet_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));
    public static final Item KAUPEN_SMITHING_TEMPLATE = registerItem("kaupen_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(SkibidityMod.MOD_ID, "kaupen"), FeatureFlags.VANILLA));

    public static final Item KAUPEN_BOW = registerItem("kaupen_bow",
            new BowItem(new Item.Settings().maxDamage(500)));





        //sample disk
        public static final Item BAR_BRAWL_MUSIC_DISC = registerItem("bar_brawl_music_disc",
                new Item(new Item.Settings().jukeboxPlayable(ModSounds.BAR_BRAWL_KEY).maxCount(1)));



            //may it never falter discs
            public static final Item GLAIVE_FGAC_DISC = registerItem("glaive_fgac_music_disc",
                    new Item(new Item.Settings().jukeboxPlayable(ModSounds.GLAIVE_FGAC_KEY).maxCount(1)));

            public static final Item GLAIVE_ISK_DISC = registerItem("glaive_isk_music_disc",
                    new Item(new Item.Settings().jukeboxPlayable(ModSounds.GLAIVE_ISK_KEY).maxCount(1)));

            public static final Item GLAIVE_COUNT_IT_UP_DISC = registerItem("glaive_count_it_up_music_disc",
                    new Item(new Item.Settings().jukeboxPlayable(ModSounds.GLAIVE_COUNT_IT_UP_KEY).maxCount(1)));

            public static final Item GLAIVE_IK_DISC = registerItem("glaive_ik_music_disc",
                    new Item(new Item.Settings().jukeboxPlayable(ModSounds.GLAIVE_IK_KEY).maxCount(1)));

            public static final Item GLAIVE_JOEL_DISC = registerItem("glaive_joel_music_disc",
                    new Item(new Item.Settings().jukeboxPlayable(ModSounds.GLAIVE_JOEL_KEY).maxCount(1)));

            public static final Item GLAIVE_LND_DISC = registerItem("glaive_lnd_music_disc",
                    new Item(new Item.Settings().jukeboxPlayable(ModSounds.GLAIVE_LND_KEY).maxCount(1)));

            public static final Item GLAIVE_KRD_DISC = registerItem("glaive_kdr_music_disc",
                    new Item(new Item.Settings().jukeboxPlayable(ModSounds.GLAIVE_KRD_KEY).maxCount(1)));

            public static final Item GLAIVE_EHID_DISC = registerItem("glaive_ehid_music_disc",
                    new Item(new Item.Settings().jukeboxPlayable(ModSounds.GLAIVE_EHID_KEY).maxCount(1)));

            public static final Item GLAIVE_FREUDIAN_DISC = registerItem("glaive_freudian_music_disc",
                    new Item(new Item.Settings().jukeboxPlayable(ModSounds.GLAIVE_FREUDIAN_KEY).maxCount(1)));

            public static final Item GLAIVE_NFAMO_DISC = registerItem("glaive_nfamo_music_disc",
                    new Item(new Item.Settings().jukeboxPlayable(ModSounds.GLAIVE_NFAMO_KEY).maxCount(1)));

            public static final Item GLAIVE_BB_DISC = registerItem("glaive_bb_music_disc",
                    new Item(new Item.Settings().jukeboxPlayable(ModSounds.GLAIVE_BB_KEY).maxCount(1)));






    public static final Item CAULIFLOWER_SEEDS = registerItem("cauliflower_seeds",
            new AliasedBlockItem(ModBlocks.CAULIFLOWER_CROP, new Item.Settings()));

    public static final Item HONEY_BERRIES = registerItem("honey_berries",
            new AliasedBlockItem(ModBlocks.HONEY_BERRY_BUSH, new Item.Settings().food(ModFoodComponents.HONEY_BERRY)));

    public static final Item MANTIS_SPAWN_EGG = registerItem("mantis_spawn_egg",
            new SpawnEggItem(ModEntities.MANTIS, 0x9dc783, 0xbfaf5f, new Item.Settings()));

    public static final Item TOMAHAWK = registerItem("tomahawk",
            new TomahawkItem(new Item.Settings().maxCount(16)));

    public static final Item SPECTRE_STAFF = registerItem("spectre_staff",
            new Item(new Item.Settings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SkibidityMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SkibidityMod.LOGGER.info("Registering Mod Items for " + SkibidityMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
        });
    }
}