package me.villagerunknown.luckycoins.loader;

import me.villagerunknown.luckycoins.item.LuckyCoinItems;
import me.villagerunknown.villagercoin.feature.InventoryEffectCoinFeature;

public class InventoryEffectCoinFeatureLoader {
	
	public static void execute() {
		InventoryEffectCoinFeature.execute();
		new LuckyCoinItems();
	}
	
}
