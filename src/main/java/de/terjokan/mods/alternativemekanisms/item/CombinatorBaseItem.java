
package de.terjokan.mods.alternativemekanisms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CombinatorBaseItem extends Item {
	public CombinatorBaseItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
