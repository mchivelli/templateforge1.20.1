package com.mchivelli.warbornorigins;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import org.apache.commons.lang3.tuple.Pair;

public class WarbornConfig {
    public static final Common COMMON;
    public static final ForgeConfigSpec COMMON_SPEC;

    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();
    }

    public static void register() {
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, COMMON_SPEC);
    }

    public static class Common {
        public final ForgeConfigSpec.DoubleValue elvenHeightScale;
        public final ForgeConfigSpec.IntValue nightVisionDurationTicks;
        public final ForgeConfigSpec.IntValue nightVisionCooldownTicks;
        public final ForgeConfigSpec.IntValue maxFlowerEffectsStacking;
        public final ForgeConfigSpec.IntValue flowerStackRequired;

        Common(ForgeConfigSpec.Builder builder) {
            builder.push("Elven Stature");
            elvenHeightScale = builder
                    .comment("Height scale multiplier for Wood Elves (default: 1.2)")
                    .defineInRange("elvenHeightScale", 1.2, 0.5, 3.0);
            builder.pop();

            builder.push("Nature's Veil");
            nightVisionDurationTicks = builder
                    .comment("Duration of night vision effect in ticks after leaving vegetation (20 ticks = 1 second, default: 40 = 2 seconds)")
                    .defineInRange("nightVisionDurationTicks", 40, 20, 200);
            nightVisionCooldownTicks = builder
                    .comment("Cooldown in ticks before night vision can be reapplied (20 ticks = 1 second, default: 60 = 3 seconds)")
                    .defineInRange("nightVisionCooldownTicks", 60, 0, 200);
            builder.pop();

            builder.push("Flower Affinity");
            builder.comment(
                    "Flower effects are defined in the power JSON file.",
                    "To add/remove flowers, edit: data/warbornorigins/powers/flower_affinity.json",
                    "Default flowers and effects:",
                    "  - Dandelion: Speed",
                    "  - Poppy: Strength",
                    "  - Blue Orchid: Water Breathing",
                    "  - Allium: Fire Resistance", 
                    "  - Azure Bluet: Luck",
                    "  - Cornflower: Jump Boost",
                    "  - Lily of the Valley: Regeneration"
            );
            maxFlowerEffectsStacking = builder
                    .comment("Maximum number of different flower effects that can be active at once (default: 2)")
                    .defineInRange("maxFlowerEffectsStacking", 2, 1, 10);
            flowerStackRequired = builder
                    .comment("Number of flowers required in inventory to activate the effect (default: 1)")
                    .defineInRange("flowerStackRequired", 1, 1, 64);
            builder.pop();
        }
    }
}
