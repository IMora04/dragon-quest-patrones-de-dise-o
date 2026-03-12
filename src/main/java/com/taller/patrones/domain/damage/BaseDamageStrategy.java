package com.taller.patrones.domain.damage;

import com.taller.patrones.domain.attacks.Attack;
import com.taller.patrones.domain.Character;

public class BaseDamageStrategy implements DamageStrategy {
    
    @Override
    public double calculateDamage(Character attacker, Character defender, Attack attack) {
        return 0;
    }
    
}
