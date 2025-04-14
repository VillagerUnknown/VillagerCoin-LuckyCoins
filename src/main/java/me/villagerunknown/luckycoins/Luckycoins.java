package me.villagerunknown.luckycoins;

import me.villagerunknown.luckycoins.loader.InventoryEffectCoinFeatureLoader;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Luckycoins implements ModInitializer {
	
	public static PlatformMod<LuckycoinsConfigData> MOD = Platform.register("luckycoins", Luckycoins.class, LuckycoinsConfigData.class );
	public static String MOD_ID = MOD.getModId();
	public static Logger LOGGER = MOD.getLogger();
	public static LuckycoinsConfigData CONFIG = MOD.getConfig();
	
	@Override
	public void onInitialize() {
		// # Initialize Mod
		init();
	}
	
	private static void init() {
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "inventoryEffectCoinFeatureLoader", InventoryEffectCoinFeatureLoader::execute );
	}
	
}
