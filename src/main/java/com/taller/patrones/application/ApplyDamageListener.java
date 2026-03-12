package com.taller.patrones.application;

import com.taller.patrones.domain.Battle;
import com.taller.patrones.domain.attacks.Attack;
import com.taller.patrones.domain.Character;

public interface ApplyDamageListener {

    void onApplyDamage(Battle battle, Character attacker, Character defender, int damage, Attack attack);
    
}
