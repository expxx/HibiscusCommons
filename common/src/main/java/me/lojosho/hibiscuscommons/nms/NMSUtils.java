package me.lojosho.hibiscuscommons.nms;

import net.kyori.adventure.text.Component;
import org.bukkit.Color;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public interface NMSUtils {

    int getNextEntityId(World world);

    Entity getEntity(int entityId, World world);

    @Nullable
    Color getColor(ItemStack itemStack);

    ItemStack setColor(@NotNull ItemStack itemStack, Color color);

    default void handleChannelOpen(@NotNull Player player) {

    }

    void sendToastAdvancement(Player player, ItemStack icon, Component title, Component description);

}
