package vazkii.botania.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import vazkii.botania.common.lib.BotaniaTags;

import java.util.concurrent.CompletableFuture;

public class FluidTagProvider extends TagsProvider<Fluid> {

	public FluidTagProvider(PackOutput $$0, CompletableFuture<HolderLookup.Provider> $$2) {
		super($$0, Registries.FLUID, $$2);
	}

	@Override
	protected void addTags(HolderLookup.Provider provider) {
		this.tag(BotaniaTags.Fluids.HYDROANGEAS_FLUID).addTag(FluidTags.WATER);
		this.tag(BotaniaTags.Fluids.THERMALILY_FLUID).addTag(FluidTags.LAVA);
	}
}
