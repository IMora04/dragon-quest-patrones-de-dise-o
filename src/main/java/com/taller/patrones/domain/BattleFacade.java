package com.taller.patrones.domain;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.taller.patrones.application.BattleService;

public class BattleFacade {

    private final BattleService battleService;

    public BattleFacade(BattleService service) {
        this.battleService = service;
    }

    public Battle executeAttack(String battleId, Map<String, String> attack) {
        Battle battle = battleService.getBattle(battleId);
        if (battle == null) return null;

        String attackName = attack != null && attack.get("attack") != null ? attack.get("attack") : "TACKLE";

        if (battle.isPlayerTurn()) {
            battleService.executePlayerAttack(battleId, attackName);
        } else {
            battleService.executeEnemyAttack(battleId, attackName);
        }

        return battleService.getBattle(battleId);
    }

    public Battle executeEnemyTurn(String battleId) {
        Battle battle = battleService.getBattle(battleId);
        if (battle == null) return null;
        if (battle.isPlayerTurn() || battle.isFinished()) {
            return battle;
        }
        String attack = BattleService.ENEMY_ATTACKS.get((int) (Math.random() * BattleService.ENEMY_ATTACKS.size()));
        battleService.executeEnemyAttack(battleId, attack);
        return battleService.getBattle(battleId);
    }

}