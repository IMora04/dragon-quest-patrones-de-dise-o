package com.taller.patrones.domain.attacks;

import com.taller.patrones.domain.damage.BaseDamageStrategy;
import com.taller.patrones.domain.damage.DamageStrategy;
import com.taller.patrones.domain.damage.NormalDamageStrategy;
import com.taller.patrones.domain.damage.SpecialDamageStrategy;

/**
 * Representa un ataque que puede ejecutar un personaje.
 */
public abstract class Attack {

    private final String name;
    private final int basePower;
    private final AttackType type;

    public Attack(String name, int basePower, AttackType type) {
        this.name = name;
        this.basePower = basePower;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getBasePower() {
        return basePower;
    }

    public AttackType getType() {
        return type;
    }

    public enum AttackType {

        NORMAL(new NormalDamageStrategy()),
        SPECIAL(new SpecialDamageStrategy()),
        STATUS(new BaseDamageStrategy());

        private final DamageStrategy strategy;

        AttackType(DamageStrategy strategy) {
            this.strategy = strategy;
        }

        public DamageStrategy getStrategy() {
            return strategy;
        }
    }
}