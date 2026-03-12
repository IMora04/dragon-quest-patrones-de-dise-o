package com.taller.patrones.domain;

public class CharacterBuilder {

    private String name;
    private Integer maxHp;
    private Integer attack;
    private Integer defense;
    private Integer speed;

    public CharacterBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CharacterBuilder maxHp(Integer maxHp) {
        this.maxHp = maxHp;
        return this;
    }

    public CharacterBuilder attack(Integer attack) {
        this.attack = attack;
        return this;
    }

    public CharacterBuilder defense(Integer defense) {
        this.defense = defense;
        return this;
    }

    public CharacterBuilder speed(Integer speed) {
        this.speed = speed;
        return this;
    }

    public Character build() {
        return new Character(name, maxHp, attack, defense, speed);
    }
}