package com.ancientrealms.content.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public final class AncientWorkbenchBlock extends Block {
    public AncientWorkbenchBlock(Properties properties) { super(properties); }
    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        if (!level.isClientSide()) {
            player.openMenu(new SimpleMenuProvider((containerId, inventory, user) ->
                    new WorkbenchMenu(containerId, inventory, ContainerLevelAccess.create(level,pos), this), getName()));
        }
        return InteractionResult.SUCCESS;
    }
    private static final class WorkbenchMenu extends CraftingMenu {
        private final ContainerLevelAccess access;
        private final Block station;
        private WorkbenchMenu(int id,net.minecraft.world.entity.player.Inventory inventory,ContainerLevelAccess access,Block station) {
            super(id,inventory,access); this.access=access; this.station=station;
        }
        @Override public boolean stillValid(Player player) { return stillValid(access,player,station); }
    }
}
