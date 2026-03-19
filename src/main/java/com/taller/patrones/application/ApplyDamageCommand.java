package com.taller.patrones.application;

import com.taller.patrones.domain.Battle;
import com.taller.patrones.domain.Character;

public class ApplyDamageCommand implements Command {

    private Battle battle;
    private Character defender;
    private int damage;

    public ApplyDamageCommand(Battle battle, Character defender, int damage) {
        this.battle = battle;
        this.defender = defender;
        this.damage = damage;
    }
    
    @Override
    public void execute() {
        defender.takeDamage(damage);
        String target = defender == battle.getPlayer() ? "player" : "enemy";
        battle.setLastDamage(damage, target);
        battle.switchTurn();
    }

    @Override
    public void undo() {
        battle.switchTurn();
        String target = defender == battle.getPlayer() ? "player" : "enemy";
        battle.setLastDamage(damage * (-1), target);
        defender.takeHealth(damage);
    }
    
}
