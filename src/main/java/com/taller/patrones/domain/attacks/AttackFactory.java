package com.taller.patrones.domain.attacks;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class AttackFactory {

    private static final Map<String, Supplier<Attack>> attacks = new HashMap<>();

    static {
        attacks.put("TACKLE", Tackle::new);
        attacks.put("SLASH", Slash::new);
        attacks.put("FIREBALL", Fireball::new);
        attacks.put("ICE_BEAM", IceBeam::new);
        attacks.put("POISON_STING", PoisonSting::new);
        attacks.put("THUNDER", Thunder::new);
        attacks.put("METEORO", Meteoro::new);
    }

    public static Attack create(String name) {
        Supplier<Attack> supplier = attacks.get(name.toUpperCase());
        if (supplier == null) {
            return new Tackle();
        }
        return supplier.get();
    }
}