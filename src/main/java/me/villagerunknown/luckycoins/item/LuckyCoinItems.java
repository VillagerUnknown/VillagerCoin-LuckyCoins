package me.villagerunknown.luckycoins.item;

import me.villagerunknown.villagercoin.effect.StewEffects;
import me.villagerunknown.villagercoin.feature.*;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;

import java.util.List;

public class LuckyCoinItems {
	
	public static final Item LUCKY_COPPER_CAT_COIN;
	public static final Item LUCKY_COPPER_CHICKEN_COIN;
	public static final Item LUCKY_COPPER_SHEEP_COIN;
	public static final Item LUCKY_COPPER_IRON_GOLEM_COIN;
	public static final Item LUCKY_COPPER_WOLF_COIN;
	public static final Item LUCKY_COPPER_ZOMBIE_COIN;
	
	public static final Item LUCKY_IRON_CAT_COIN;
	public static final Item LUCKY_IRON_CHICKEN_COIN;
	public static final Item LUCKY_IRON_GOLEM_COIN;
	public static final Item LUCKY_IRON_SHEEP_COIN;
	public static final Item LUCKY_IRON_VEX_COIN;
	
	public static final Item LUCKY_GOLD_BLAZE_COIN;
	public static final Item LUCKY_GOLD_PIGLIN_COIN;
	public static final Item LUCKY_GOLD_GHAST_COIN;
	public static final Item LUCKY_GOLD_MAGMA_CUBE_COIN;
	
	public static final Item LUCKY_EMERALD_CREEPER_COIN;
	public static final Item LUCKY_EMERALD_SLIME_COIN;
	public static final Item LUCKY_EMERALD_IRON_GOLEM_COIN;
	
	public static final Item LUCKY_NETHERITE_ENDER_DRAGON_COIN;
	
	public LuckyCoinItems() {}
	
	static {
		LUCKY_COPPER_CAT_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_copper_cat_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.COMMON_LOOT_TABLES, MobsDropCoinsFeature.COMMON_MOB_DROPS, List.of(StewEffects.SPEED) );
		LUCKY_COPPER_CHICKEN_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_copper_chicken_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.COMMON_LOOT_TABLES, MobsDropCoinsFeature.COMMON_MOB_DROPS, List.of(StewEffects.SLOW_FALLING) );
		LUCKY_COPPER_SHEEP_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_copper_sheep_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.COMMON_LOOT_TABLES, MobsDropCoinsFeature.COMMON_MOB_DROPS, List.of(StewEffects.ABSORPTION) );
		LUCKY_COPPER_IRON_GOLEM_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_copper_iron_golem_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.COMMON_LOOT_TABLES, MobsDropCoinsFeature.COMMON_MOB_DROPS, List.of(StewEffects.RESISTANCE) );
		LUCKY_COPPER_WOLF_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_copper_wolf_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.COMMON_LOOT_TABLES, MobsDropCoinsFeature.COMMON_MOB_DROPS, List.of(StewEffects.STRENGTH) );
		LUCKY_COPPER_ZOMBIE_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_copper_zombie_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.COMMON_LOOT_TABLES, MobsDropCoinsFeature.COMMON_MOB_DROPS, List.of(StewEffects.NIGHT_VISION) );
		
		LUCKY_IRON_CAT_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_iron_cat_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.UNCOMMON_LOOT_TABLES, MobsDropCoinsFeature.COMMON_MOB_DROPS, List.of(StewEffects.SPEED,StewEffects.NIGHT_VISION) );
		LUCKY_IRON_CHICKEN_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_iron_chicken_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.UNCOMMON_LOOT_TABLES, MobsDropCoinsFeature.COMMON_MOB_DROPS, List.of(StewEffects.SLOW_FALLING) );
		LUCKY_IRON_GOLEM_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_iron_golem_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.UNCOMMON_LOOT_TABLES, MobsDropCoinsFeature.COMMON_MOB_DROPS, List.of(StewEffects.RESISTANCE,StewEffects.STRENGTH) );
		LUCKY_IRON_SHEEP_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_iron_sheep_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.UNCOMMON_LOOT_TABLES, MobsDropCoinsFeature.COMMON_MOB_DROPS, List.of(StewEffects.ABSORPTION,StewEffects.SPEED) );
		LUCKY_IRON_VEX_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_iron_vex_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.UNCOMMON_LOOT_TABLES, MobsDropCoinsFeature.COMMON_MOB_DROPS, List.of(StewEffects.LEVITATION) );
		
		LUCKY_GOLD_BLAZE_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_gold_blaze_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.RARE_LOOT_TABLES, MobsDropCoinsFeature.RARE_MOB_DROPS, List.of(StewEffects.FIRE_RESISTANCE,StewEffects.STRENGTH,StewEffects.SLOW_FALLING) );
		LUCKY_GOLD_PIGLIN_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_gold_piglin_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.RARE_LOOT_TABLES, MobsDropCoinsFeature.RARE_MOB_DROPS, List.of(StewEffects.STRENGTH,StewEffects.FIRE_RESISTANCE) );
		LUCKY_GOLD_GHAST_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_gold_ghast_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.RARE_LOOT_TABLES, MobsDropCoinsFeature.RARE_MOB_DROPS, List.of(StewEffects.SLOW_FALLING,StewEffects.FIRE_RESISTANCE) );
		LUCKY_GOLD_MAGMA_CUBE_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_gold_magma_cube_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.RARE_LOOT_TABLES, MobsDropCoinsFeature.RARE_MOB_DROPS, List.of(StewEffects.FIRE_RESISTANCE,StewEffects.ABSORPTION) );
		
		LUCKY_EMERALD_CREEPER_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_emerald_creeper_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.EPIC_LOOT_TABLES, MobsDropCoinsFeature.EPIC_MOB_DROPS, List.of(StewEffects.INVISIBILITY,StewEffects.SPEED) );
		LUCKY_EMERALD_SLIME_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_emerald_slime_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.EPIC_LOOT_TABLES, MobsDropCoinsFeature.EPIC_MOB_DROPS, List.of(StewEffects.JUMP_BOOST,StewEffects.ABSORPTION) );
		LUCKY_EMERALD_IRON_GOLEM_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_emerald_iron_golem_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.EPIC_LOOT_TABLES, MobsDropCoinsFeature.EPIC_MOB_DROPS, List.of(StewEffects.RESISTANCE,StewEffects.STRENGTH,StewEffects.HERO_OF_THE_VILLAGE,StewEffects.HEALTH_BOOST) );
		
		LUCKY_NETHERITE_ENDER_DRAGON_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( "lucky_netherite_ender_dragon_coin", CollectableCoinFeature.NETHERITE_VALUE, CoinFeature.NETHERITE_RARITY, CollectableCoinFeature.NETHERITE_DROP_CHANCE, CoinFeature.NETHERITE_FLIP_CHANCE, CollectableCoinFeature.NETHERITE_MAXIMUM_IN_CIRCULATION, StructuresIncludeCoinsFeature.EPIC_LOOT_TABLES, MobsDropCoinsFeature.EPIC_MOB_DROPS, List.of(StewEffects.FIRE_RESISTANCE,StewEffects.STRENGTH,StewEffects.HEALTH_BOOST,StewEffects.JUMP_BOOST,StewEffects.HUNGER) );
	}
	
}
