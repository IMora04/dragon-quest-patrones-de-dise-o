package com.taller.patrones.domain.attacks;

/**
 * Representa un ataque que puede ejecutar un personaje.
 */
public abstract class Attack implements ParentAttack {

    private final String name;
    private final int basePower;
    private final AttackType type;

    public Attack(String name, int basePower, AttackType type) {
        this.name = name;
        this.basePower = basePower;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getBasePower() {
        return basePower;
    }

    @Override
    public AttackType getType() {
        return type;
    }

}