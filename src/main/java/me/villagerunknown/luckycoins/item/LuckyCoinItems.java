package me.villagerunknown.luckycoins.item;

import me.villagerunknown.villagercoin.Villagercoin;
import me.villagerunknown.villagercoin.effect.StewEffects;
import me.villagerunknown.villagercoin.feature.*;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTables;

import java.util.List;
import java.util.Set;

public class LuckyCoinItems {
	
	public static final Item LUCKY_COPPER_CAT_COIN;
	public static final Item LUCKY_COPPER_CHICKEN_COIN;
	public static final Item LUCKY_COPPER_SHEEP_COIN;
	public static final Item LUCKY_COPPER_IRON_GOLEM_COIN;
	public static final Item LUCKY_COPPER_WOLF_COIN;
	public static final Item LUCKY_COPPER_ZOMBIE_COIN;
	public static final Item LUCKY_COPPER_DOLPHIN_COIN;
	public static final Item LUCKY_COPPER_HEART_COIN;
	
	public static final Item LUCKY_IRON_CAT_COIN;
	public static final Item LUCKY_IRON_CHICKEN_COIN;
	public static final Item LUCKY_IRON_GOLEM_COIN;
	public static final Item LUCKY_IRON_SHEEP_COIN;
	public static final Item LUCKY_IRON_VEX_COIN;
	
	public static final Item LUCKY_GOLD_BLAZE_COIN;
	public static final Item LUCKY_GOLD_PIGLIN_COIN;
	public static final Item LUCKY_GOLD_GHAST_COIN;
	public static final Item LUCKY_GOLD_MAGMA_CUBE_COIN;
	public static final Item LUCKY_GOLD_TURTLE_COIN;
	
	public static final Item LUCKY_EMERALD_CREEPER_COIN;
	public static final Item LUCKY_EMERALD_SLIME_COIN;
	public static final Item LUCKY_EMERALD_IRON_GOLEM_COIN;
	
	public static final Item LUCKY_NETHERITE_ENDER_DRAGON_COIN;
	
	public LuckyCoinItems() {}
	
	static {
		LUCKY_COPPER_CAT_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_copper_cat_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_PLAINS_CHEST,LootTables.VILLAGE_DESERT_HOUSE_CHEST,LootTables.VILLAGE_SAVANNA_HOUSE_CHEST,LootTables.VILLAGE_SNOWY_HOUSE_CHEST,LootTables.VILLAGE_TAIGA_HOUSE_CHEST,LootTables.FISHING_TREASURE_GAMEPLAY), Set.of(EntityType.CAT), List.of(StewEffects.SPEED) );
		LUCKY_COPPER_CHICKEN_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_copper_chicken_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_FLETCHER_CHEST), Set.of(EntityType.CHICKEN), List.of(StewEffects.SLOW_FALLING) );
		LUCKY_COPPER_SHEEP_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_copper_sheep_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_SHEPARD_CHEST), Set.of(EntityType.SHEEP), List.of(StewEffects.ABSORPTION) );
		LUCKY_COPPER_IRON_GOLEM_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_copper_iron_golem_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_ARMORER_CHEST,LootTables.PILLAGER_OUTPOST_CHEST), Set.of(EntityType.IRON_GOLEM), List.of(StewEffects.RESISTANCE) );
		LUCKY_COPPER_WOLF_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_copper_wolf_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.TRIAL_CHAMBERS_REWARD_RARE_CHEST), Set.of(EntityType.WOLF), List.of(StewEffects.STRENGTH,StewEffects.SPEED) );
		LUCKY_COPPER_ZOMBIE_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_copper_zombie_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.ANCIENT_CITY_CHEST), Set.of(EntityType.ZOMBIE), List.of(StewEffects.NIGHT_VISION) );
		LUCKY_COPPER_DOLPHIN_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_copper_dolphin_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.UNDERWATER_RUIN_BIG_CHEST,LootTables.FISHING_TREASURE_GAMEPLAY), Set.of(EntityType.DOLPHIN), List.of(StewEffects.DOLPHINS_GRACE) );
		LUCKY_COPPER_HEART_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_copper_heart_coin", CollectableCoinFeature.COPPER_VALUE, CoinFeature.COPPER_RARITY, CollectableCoinFeature.COPPER_DROP_CHANCE, 1, 1, 1, CoinFeature.COPPER_FLIP_CHANCE, CollectableCoinFeature.COPPER_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.HERO_OF_THE_VILLAGE_CLERIC_GIFT_GAMEPLAY,LootTables.HERO_OF_THE_VILLAGE_FARMER_GIFT_GAMEPLAY), Set.of(EntityType.PLAYER), List.of(StewEffects.REGENERATION) );
		
		LUCKY_IRON_CAT_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_iron_cat_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_PLAINS_CHEST,LootTables.VILLAGE_DESERT_HOUSE_CHEST,LootTables.VILLAGE_SAVANNA_HOUSE_CHEST,LootTables.VILLAGE_SNOWY_HOUSE_CHEST,LootTables.VILLAGE_TAIGA_HOUSE_CHEST,LootTables.FISHING_TREASURE_GAMEPLAY), Set.of(EntityType.CAT), List.of(StewEffects.SPEED,StewEffects.NIGHT_VISION) );
		LUCKY_IRON_CHICKEN_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_iron_chicken_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_FLETCHER_CHEST), Set.of(EntityType.CHICKEN), List.of(StewEffects.SLOW_FALLING) );
		LUCKY_IRON_GOLEM_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_iron_golem_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_ARMORER_CHEST,LootTables.PILLAGER_OUTPOST_CHEST), Set.of(EntityType.IRON_GOLEM), List.of(StewEffects.RESISTANCE,StewEffects.STRENGTH) );
		LUCKY_IRON_SHEEP_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_iron_sheep_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_SHEPARD_CHEST), Set.of(EntityType.SHEEP), List.of(StewEffects.ABSORPTION,StewEffects.SPEED) );
		LUCKY_IRON_VEX_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_iron_vex_coin", CollectableCoinFeature.IRON_VALUE, CoinFeature.IRON_RARITY, CollectableCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, CoinFeature.IRON_FLIP_CHANCE, CollectableCoinFeature.IRON_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.WOODLAND_MANSION_CHEST), Set.of(EntityType.VEX), List.of(StewEffects.LEVITATION) );
		
		LUCKY_GOLD_BLAZE_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_gold_blaze_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.NETHER_BRIDGE_CHEST), Set.of(EntityType.BLAZE), List.of(StewEffects.FIRE_RESISTANCE,StewEffects.STRENGTH,StewEffects.SLOW_FALLING) );
		LUCKY_GOLD_PIGLIN_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_gold_piglin_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.BASTION_TREASURE_CHEST), Set.of(EntityType.PIGLIN,EntityType.PIGLIN_BRUTE), List.of(StewEffects.STRENGTH,StewEffects.FIRE_RESISTANCE,StewEffects.RESISTANCE) );
		LUCKY_GOLD_GHAST_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_gold_ghast_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, Set.of(), Set.of(EntityType.GHAST), List.of(StewEffects.SLOW_FALLING,StewEffects.FIRE_RESISTANCE,StewEffects.ABSORPTION) );
		LUCKY_GOLD_MAGMA_CUBE_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_gold_magma_cube_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, Set.of(), Set.of(EntityType.MAGMA_CUBE), List.of(StewEffects.FIRE_RESISTANCE,StewEffects.ABSORPTION,StewEffects.JUMP_BOOST) );
		LUCKY_GOLD_TURTLE_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_gold_turtle_coin", CollectableCoinFeature.GOLD_VALUE, CoinFeature.GOLD_RARITY, CollectableCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, CoinFeature.GOLD_FLIP_CHANCE, CollectableCoinFeature.GOLD_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.UNDERWATER_RUIN_BIG_CHEST,LootTables.FISHING_TREASURE_GAMEPLAY), Set.of(EntityType.TURTLE), List.of(StewEffects.WATER_BREATHING,StewEffects.ABSORPTION,StewEffects.RESISTANCE) );
		
		LUCKY_EMERALD_CREEPER_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_emerald_creeper_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, 1, 1, 1, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.JUNGLE_TEMPLE_CHEST,LootTables.DESERT_PYRAMID_CHEST,LootTables.DESERT_PYRAMID_ARCHAEOLOGY,LootTables.DESERT_WELL_ARCHAEOLOGY), Set.of(EntityType.CREEPER), List.of(StewEffects.INVISIBILITY,StewEffects.SPEED,StewEffects.NIGHT_VISION) );
		LUCKY_EMERALD_SLIME_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_emerald_slime_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, 1, 1, 1, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION, Set.of(), Set.of(EntityType.SLIME), List.of(StewEffects.JUMP_BOOST,StewEffects.ABSORPTION,StewEffects.HEALTH_BOOST) );
		LUCKY_EMERALD_IRON_GOLEM_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_emerald_iron_golem_coin", CollectableCoinFeature.EMERALD_VALUE, CoinFeature.EMERALD_RARITY, CollectableCoinFeature.EMERALD_DROP_CHANCE, 1, 1, 1, CoinFeature.EMERALD_FLIP_CHANCE, CollectableCoinFeature.EMERALD_MAXIMUM_IN_CIRCULATION, Set.of(LootTables.VILLAGE_ARMORER_CHEST,LootTables.PILLAGER_OUTPOST_CHEST), Set.of(EntityType.IRON_GOLEM), List.of(StewEffects.RESISTANCE,StewEffects.STRENGTH,StewEffects.HERO_OF_THE_VILLAGE,StewEffects.HEALTH_BOOST) );
		
		LUCKY_NETHERITE_ENDER_DRAGON_COIN = InventoryEffectCoinFeature.registerCraftableInventoryEffectCoinItem( Villagercoin.MOD_ID, "lucky_netherite_ender_dragon_coin", CollectableCoinFeature.NETHERITE_VALUE, CoinFeature.NETHERITE_RARITY, CollectableCoinFeature.NETHERITE_DROP_CHANCE, 1, 1, 1, CoinFeature.NETHERITE_FLIP_CHANCE, CollectableCoinFeature.NETHERITE_MAXIMUM_IN_CIRCULATION, Set.of(), Set.of(EntityType.ENDER_DRAGON), List.of(StewEffects.FIRE_RESISTANCE,StewEffects.STRENGTH,StewEffects.HEALTH_BOOST,StewEffects.JUMP_BOOST) );
	}
	
}
