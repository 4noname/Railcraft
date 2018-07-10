package mods.railcraft.common.plugins.buildcraft.actions;

import buildcraft.api.statements.*;
import mods.railcraft.common.plugins.buildcraft.triggers.IHasCart;
import mods.railcraft.common.plugins.buildcraft.triggers.IHasWork;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;

import org.jetbrains.annotations.NotNull;
import java.util.Collection;

/**
 * @author CovertJaguar <http://www.railcraft.info>
 */
public class ActionProvider implements IActionProvider {

    public ActionProvider() {
        Actions.init();
    }

    @Override
    public void addInternalActions(Collection<IActionInternal> actions, IStatementContainer container) {

    }

    @Override
    public void addInternalSidedActions(Collection<IActionInternalSided> actions, IStatementContainer container, @NotNull EnumFacing side) {

    }

    @Override
    public void addExternalActions(Collection<IActionExternal> actions, EnumFacing side, TileEntity tile) {
        if (tile instanceof IHasWork)
            actions.add(Actions.PAUSE);
        if (tile instanceof IHasCart)
            actions.add(Actions.SEND_CART);
    }

}
