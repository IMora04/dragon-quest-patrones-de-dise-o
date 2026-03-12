package com.taller.patrones.domain.damage;

import com.taller.patrones.domain.attacks.Attack;
import com.taller.patrones.domain.Character;

public interface DamageStrategy {
    
    double calculateDamage(Character attacker, Character defender, Attack attack);

}
