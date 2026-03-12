package com.taller.patrones.domain.damage;

import com.taller.patrones.domain.attacks.Attack;
import com.taller.patrones.domain.Character;

public class NormalDamageStrategy implements DamageStrategy {
    
    @Override
    public double calculateDamage(Character attacker, Character defender, Attack attack) {
        double raw = attacker.getAttack() * attack.getBasePower() / 100;
        return Math.max(1, raw - defender.getDefense());
    }
    
}
