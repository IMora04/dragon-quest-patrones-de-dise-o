package com.taller.patrones.interfaces;

import java.util.Map;

public abstract class ExternalCombatDataAdapter {

    protected final Map<String, Object> externalCombatData;

    public ExternalCombatDataAdapter(Map<String, Object> externalCombatData) {
        this.externalCombatData = externalCombatData;
    }

    public abstract CombatData adapt();
}