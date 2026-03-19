package com.taller.patrones.domain.damage;

import com.taller.patrones.domain.attacks.ParentAttack;
import com.taller.patrones.domain.Character;

public interface DamageStrategy {
    
    double calculateDamage(Character attacker, Character defender, ParentAttack attack);

}
