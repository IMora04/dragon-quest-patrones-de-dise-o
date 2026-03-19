package com.taller.patrones.domain.attacks;

import com.taller.patrones.domain.damage.BaseDamageStrategy;
import com.taller.patrones.domain.damage.DamageStrategy;
import com.taller.patrones.domain.damage.NormalDamageStrategy;
import com.taller.patrones.domain.damage.SpecialDamageStrategy;

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
