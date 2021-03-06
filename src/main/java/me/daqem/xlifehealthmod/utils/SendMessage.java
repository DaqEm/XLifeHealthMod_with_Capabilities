package me.daqem.xlifehealthmod.utils;

import net.minecraft.command.CommandSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.KeybindTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class SendMessage {
    
    public static void sendMessage(PlayerEntity player, String message) {
        player.sendMessage(new KeybindTextComponent(message));
    }

    public static void sendFeedback(CommandSource source, String message) {
        source.sendFeedback(new TranslationTextComponent(message), true);
    }
}
