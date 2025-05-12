package me.villagerunknown.luckycoins.feature;

import me.villagerunknown.luckycoins.item.LuckyCoinItems;
import me.villagerunknown.villagercoin.feature.InventoryEffectCoinFeature;

public class LuckyCoinItemsFeature {
	
	public static void execute() {
		InventoryEffectCoinFeature.execute();
		new LuckyCoinItems();
	}
	
}
