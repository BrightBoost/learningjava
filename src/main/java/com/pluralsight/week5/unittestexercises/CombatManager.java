package com.pluralsight.week5.unittestexercises;

import java.util.*;

public class CombatManager {
    List<Fighter> fighters = new ArrayList<>();
    public CombatManager() {
    }

    public void addFighter(String name, int speed) {
        fighters.add(new Fighter(name, speed));
    }

    public String[] getTurnOrder() {
        boolean sorted = false;
        outer: while(!sorted) {
            for(int i = 0; i < getFighterCount() - 1; i++) {
                if(fighters.get(i).getSpeed() < fighters.get(i + 1).getSpeed()) {
                    Fighter temp = fighters.get(i);
                    fighters.set(i, fighters.get(i + 1));
                    fighters.set(i + 1, temp);
                    continue outer;
                }
            }
            sorted = true;
        }
        // maaike lost patience sorry - fighter list to string array
        return fighters.stream().map(f -> f.getName()).toList().toArray(new String[getFighterCount()]);
    }

    public int getFighterCount() {
        return fighters.size();
    }

}
