package com.taller.patrones.domain.attacks;

import java.util.List;

public class Combo implements ParentAttack {

    private final String name;
    private final List<ParentAttack> attackList;

    public Combo(String name, List<ParentAttack> attacklist) {
        this.name = name;
        this.attackList = attacklist;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getBasePower() {
        return attackList.stream().mapToInt(a -> a.getBasePower()).sum();
    }

    @Override
    public AttackType getType() {
        // Not specified, combo = special assumed
        return AttackType.SPECIAL;
    }
    
}
