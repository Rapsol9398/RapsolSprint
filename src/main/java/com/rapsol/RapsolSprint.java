package com.rapsol;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RapsolSprint implements ClientModInitializer {
    MinecraftClient mc = MinecraftClient.getInstance();
    /* "Just because the code is simple, it doesnt haveto mean Im not a real ccoder :3" - Muni__´s Grandma  */
    /*  Please dont steal that complicated code or atlease ask me before (https://discord.gg/zk7BKYAhhb)    */
    /*  Thank you for using my mod fellas, I love yall <3                                                   */

    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            assert mc.player != null;
            if (mc.options.forwardKey.isPressed()) {
                mc.player.setSprinting(true);
            }
        });
    }
}