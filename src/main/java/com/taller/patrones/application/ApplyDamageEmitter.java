package com.taller.patrones.application;

import java.util.ArrayList;
import java.util.List;

import com.taller.patrones.domain.Battle;
import com.taller.patrones.domain.attacks.Attack;
import com.taller.patrones.domain.Character;

public class ApplyDamageEmitter {

    private final List<ApplyDamageListener> listeners = new ArrayList<>();

    public void emitDamageApplied(Battle battle, Character attacker, Character defender, int damage, Attack attack) {
        listeners.forEach(l -> l.onApplyDamage(battle, attacker, defender, damage, attack));
    }

    public void addListener(ApplyDamageListener listener) {
        listeners.add(listener);
    }
    
}
