package dev.geco.gsit.mcv.v1_20_5.object;

import dev.geco.gsit.service.PlayerSitService;
import net.minecraft.world.entity.AreaEffectCloud;
import org.bukkit.Location;
import org.bukkit.craftbukkit.CraftWorld;

public class PlayerSeatEntity extends AreaEffectCloud {

    public PlayerSeatEntity(Location location) {
        super(((CraftWorld) location.getWorld()).getHandle(), location.getX(), location.getY(), location.getZ());
        persist = false;
        setRadius(0);
        setDuration(Integer.MAX_VALUE);
        setNoGravity(true);
        setInvulnerable(true);
        addTag(PlayerSitService.PLAYERSIT_ENTITY_TAG);
    }

    @Override
    public void tick() { }

    @Override
    public boolean canChangeDimensions() { return false; }

    @Override
    public boolean dismountsUnderwater() { return false; }

}