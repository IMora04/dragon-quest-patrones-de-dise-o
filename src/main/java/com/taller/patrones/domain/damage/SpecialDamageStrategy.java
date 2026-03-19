package com.taller.patrones.domain.damage;

import com.taller.patrones.domain.attacks.ParentAttack;
import com.taller.patrones.domain.Character;

public class SpecialDamageStrategy implements DamageStrategy {
    
    @Override
    public double calculateDamage(Character attacker, Character defender, ParentAttack attack) {
        double raw = attacker.getAttack() * attack.getBasePower() / 100;
        int effectiveDef = defender.getDefense() / 2;
        return Math.max(1, raw - effectiveDef);
    }
    
}
