package com.taller.patrones.domain.damage;

import com.taller.patrones.domain.attacks.ParentAttack;
import com.taller.patrones.domain.Character;

public class BaseDamageStrategy implements DamageStrategy {
    
    @Override
    public double calculateDamage(Character attacker, Character defender, ParentAttack attack) {
        return 0;
    }
    
}
