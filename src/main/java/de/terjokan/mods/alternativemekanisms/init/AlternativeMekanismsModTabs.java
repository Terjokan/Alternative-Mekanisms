
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.terjokan.mods.alternativemekanisms.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import de.terjokan.mods.alternativemekanisms.AlternativeMekanismsMod;

public class AlternativeMekanismsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlternativeMekanismsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ALTERNATIVE_MECKANISMS = REGISTRY.register("alternative_meckanisms",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alternative_mekanisms.alternative_meckanisms")).icon(() -> new ItemStack(AlternativeMekanismsModItems.COMBINATOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AlternativeMekanismsModItems.COMBINATOR.get());
				tabData.accept(AlternativeMekanismsModItems.COMBINATOR_TIER_2.get());
				tabData.accept(AlternativeMekanismsModItems.COMBINATOR_TIER_3.get());
				tabData.accept(AlternativeMekanismsModItems.COMBINATOR_TIER_4.get());
				tabData.accept(AlternativeMekanismsModItems.COMBINATOR_BASE.get());
				tabData.accept(AlternativeMekanismsModItems.COMBINATOR_BASE_TIER_2.get());
				tabData.accept(AlternativeMekanismsModItems.COMBINATOR_BASE_TIER_3.get());
				tabData.accept(AlternativeMekanismsModItems.COMBINATOR_BASE_TIER_4.get());
			}).build());
}
