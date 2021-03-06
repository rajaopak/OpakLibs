package dev.rajaopak.opaklibs.libs;

import dev.rajaopak.opaklibs.OpakLibs;

public class Debug {

    private static boolean ENABLED = false;

    public static void enable(){
        ENABLED = true;
    }

    public static void disable(){
        ENABLED = false;
    }

    public static void send(String... messages) {
        if (!ENABLED) {
            return;
        }
        for (String message : messages) {
            OpakLibs.INSTANCE.getLogger().info(Common.color(message));
        }
    }

}
