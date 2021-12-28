package net.morphocraft.spigot.disablevillagertrading.listener;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class ValligerEventListener implements Listener {
    @EventHandler
    public void OnPlayerInteractEntityEvent(PlayerInteractEntityEvent event) {
        EntityType et= event.getRightClicked().getType();
        if (et.equals(EntityType.VILLAGER)||et.equals(EntityType.WANDERING_TRADER)) {
            event.setCancelled(true);
        }
    }
}
