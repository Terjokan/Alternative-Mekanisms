
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.terjokan.mods.alternativemekanisms.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import de.terjokan.mods.alternativemekanisms.item.CombinatorTier4Item;
import de.terjokan.mods.alternativemekanisms.item.CombinatorTier3Item;
import de.terjokan.mods.alternativemekanisms.item.CombinatorTier2Item;
import de.terjokan.mods.alternativemekanisms.item.CombinatorItem;
import de.terjokan.mods.alternativemekanisms.item.CombinatorBaseTier4Item;
import de.terjokan.mods.alternativemekanisms.item.CombinatorBaseTier3Item;
import de.terjokan.mods.alternativemekanisms.item.CombinatorBaseTier1Item;
import de.terjokan.mods.alternativemekanisms.item.CombinatorBaseItem;
import de.terjokan.mods.alternativemekanisms.AlternativeMekanismsMod;

public class AlternativeMekanismsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AlternativeMekanismsMod.MODID);
	public static final DeferredItem<Item> COMBINATOR = REGISTRY.register("combinator", CombinatorItem::new);
	public static final DeferredItem<Item> COMBINATOR_TIER_2 = REGISTRY.register("combinator_tier_2", CombinatorTier2Item::new);
	public static final DeferredItem<Item> COMBINATOR_TIER_3 = REGISTRY.register("combinator_tier_3", CombinatorTier3Item::new);
	public static final DeferredItem<Item> COMBINATOR_TIER_4 = REGISTRY.register("combinator_tier_4", CombinatorTier4Item::new);
	public static final DeferredItem<Item> COMBINATOR_BASE = REGISTRY.register("combinator_base", CombinatorBaseItem::new);
	public static final DeferredItem<Item> COMBINATOR_BASE_TIER_2 = REGISTRY.register("combinator_base_tier_2", CombinatorBaseTier1Item::new);
	public static final DeferredItem<Item> COMBINATOR_BASE_TIER_3 = REGISTRY.register("combinator_base_tier_3", CombinatorBaseTier3Item::new);
	public static final DeferredItem<Item> COMBINATOR_BASE_TIER_4 = REGISTRY.register("combinator_base_tier_4", CombinatorBaseTier4Item::new);
	// Start of user code block custom items
	// End of user code block custom items
}
