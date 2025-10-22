package com.pluralsight.week5.unittestexercises;

public class Battle {
    private String attacker;
    private int attackerHp;
    private String defender;
    private int defenderHp;

    public Battle(String attacker, int attackerHp, String defender, int defenderHp) {
        this.attacker = attacker;
        this.attackerHp = attackerHp;
        this.defender = defender;
        this.defenderHp = defenderHp;
    }

    public int getAttackerHp() {
        return attackerHp;
    }

    public int getDefenderHp() {
        return defenderHp;
    }

    public void performAttack(int damage) {
        defenderHp -= damage;
        if(defenderHp < 0) {
            defenderHp = 0;
        }
    }

    public void performCounterAttack(int damage) {
        attackerHp -= damage;
        if(attackerHp < 0) {
            attackerHp = 0;
        }
    }

    public boolean isBattleOver() {
        return defenderHp <= 0 || attackerHp <= 0;
    }

    public String getWinner() {
        if(isBattleOver()) {
            return defenderHp <= 0 ? attacker : defender;
        }
        return null;
    }


}
