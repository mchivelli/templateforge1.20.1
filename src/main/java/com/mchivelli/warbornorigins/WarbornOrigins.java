package com.mchivelli.warbornorigins;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(WarbornOrigins.MODID)
public class WarbornOrigins {

    public static final String MODID = "warbornorigins";
    public static final Logger LOGGER = LogManager.getLogger();

    public WarbornOrigins() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        WarbornConfig.register();
        
        eventBus.addListener(this::setup);
        eventBus.addListener(this::setupClient);
        
        LOGGER.info("The Warborn Origins addon initialized! (Wood Elf, Moon Elf, High Elf, Goblin, Arachnae, Orc)");
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("The Warborn Origins: Common setup complete");
        LOGGER.info("Config loaded - Height Scale: {}, Max Flower Effects: {}", 
            WarbornConfig.COMMON.elvenHeightScale.get(),
            WarbornConfig.COMMON.maxFlowerEffectsStacking.get());
    }

    private void setupClient(final FMLClientSetupEvent event) {
        LOGGER.info("The Warborn Origins: Client setup complete");
    }
}
