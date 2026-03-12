package com.taller.patrones.infrastructure.combat;

import com.taller.patrones.domain.Character;
import com.taller.patrones.domain.attacks.Attack;
import com.taller.patrones.domain.attacks.AttackFactory;
import com.taller.patrones.domain.damage.BaseDamageStrategy;
import com.taller.patrones.domain.damage.CriticalDamageStrategy;
import com.taller.patrones.domain.damage.DamageStrategy;

/**
 * Motor de combate. Calcula daño y crea ataques.
 * <p>
 * Nota: Esta clase crece cada vez que añadimos un ataque nuevo o un tipo de daño distinto.
 */
public class CombatEngine {

    /**
     * Crea un ataque a partir de su nombre.
     * Cada ataque nuevo requiere modificar este método.
     */
    public Attack createAttack(String name) {
        String n = name != null ? name.toUpperCase() : "";
        return AttackFactory.create(n);
    }

    /**
     * Calcula el daño según el tipo de ataque.
     * Cada fórmula nueva (ej. crítico, veneno con tiempo) requiere modificar este switch.
     */
    public int calculateDamage(Character attacker, Character defender, Attack attack) {
        DamageStrategy strategy = attack.getType().getStrategy();
        if (Math.random() < 0.2) {
            strategy = new CriticalDamageStrategy();
        }
        return (int) (strategy != null ? strategy : new BaseDamageStrategy())
            .calculateDamage(attacker, defender, attack);
    }
}
