package vazkii.botania.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.material.Fluid;
import vazkii.botania.common.lib.BotaniaTags;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class FluidTagProvider extends IntrinsicHolderTagsProvider<Fluid> {

    public FluidTagProvider(PackOutput $$0, ResourceKey<? extends Registry<Fluid>> $$1, CompletableFuture<HolderLookup.Provider> $$2, Function<Fluid, ResourceKey<Fluid>> $$3) {
        super($$0, $$1, $$2, $$3);
    }

    @Override
	protected void addTags(HolderLookup.Provider provider) {
		this.tag(BotaniaTags.Fluids.HYDROANGEAS_FLUID).addTag(FluidTags.WATER);
		this.tag(BotaniaTags.Fluids.THERMALILY_FLUID).addTag(FluidTags.LAVA);
	}
}
