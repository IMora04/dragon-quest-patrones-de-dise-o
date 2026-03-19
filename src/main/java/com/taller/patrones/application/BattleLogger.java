package com.taller.patrones.application;

import com.taller.patrones.domain.Battle;
import com.taller.patrones.domain.attacks.ParentAttack;
import com.taller.patrones.domain.Character;

public class BattleLogger implements ApplyDamageListener {

    @Override
    public void onApplyDamage(Battle battle, Character attacker, Character defender, int damage, ParentAttack attack) {
        battle.log(attacker.getName() + " usa " + attack.getName() + " y hace " + damage + " de daño a " + defender.getName());
    }
    
}
