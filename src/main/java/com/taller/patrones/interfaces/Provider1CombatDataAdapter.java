package com.taller.patrones.interfaces;

import java.util.Map;

public class Provider1CombatDataAdapter extends ExternalCombatDataAdapter {

    public Provider1CombatDataAdapter(Map<String, Object> externalCombatData) {
        super(externalCombatData);
    }

    @Override
    public CombatData adapt() {
        return new CombatData(
            (String) externalCombatData.getOrDefault("fighter1_name", "Héroe"),
            ((Number) externalCombatData.getOrDefault("fighter1_hp", 150)).intValue(),
            ((Number) externalCombatData.getOrDefault("fighter1_atk", 25)).intValue(),
            (String) externalCombatData.getOrDefault("fighter2_name", "Dragón"),
            ((Number) externalCombatData.getOrDefault("fighter2_hp", 120)).intValue(),
            ((Number) externalCombatData.getOrDefault("fighter2_atk", 30)).intValue()
        );
    }
}