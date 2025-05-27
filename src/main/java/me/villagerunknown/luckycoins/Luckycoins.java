package me.villagerunknown.luckycoins;

import me.villagerunknown.luckycoins.feature.LuckyCoinItemsFeature;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import me.villagerunknown.villagercoin.Villagercoin;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Luckycoins implements ModInitializer {
	
	public static PlatformMod<LuckycoinsConfigData> MOD = Platform.register("luckycoins", Luckycoins.class );
	public static String MOD_ID = MOD.getModId();
	public static Logger LOGGER = MOD.getLogger();
	
	@Override
	public void onInitialize() {
		// # Load Villager Coin
		Villagercoin.load();
		
		// # Initialize addon mod with Platform
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "lucky-coin-items", LuckyCoinItemsFeature::execute );
		
		// # Load Features
		featureManager.loadFeatures();
	}
	
}
