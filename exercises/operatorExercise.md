### 🎲 Game-Themed Java Exercises (Operators & Data Types)

#### Easy (warm-ups)

1. **Counting Coins**
   A player collects 137 gold coins. Each bag can hold 20 coins.
   👉 How many full bags can the player fill, and how many coins are left over?

2. **Potion Mixing**
   A potion requires 3 red herbs and 2 blue herbs. The player has 17 red herbs and 11 blue herbs.
   👉 How many potions can they make?

3. **Dice Damage**
   Simulate rolling a 6-sided die (`int dieRoll = 4;`) and add it to the player’s base damage (10).
   👉 Print the total damage.

4. **Character Health**
   A monster hits the hero for 12 points of damage. The hero starts with 100 HP.
   👉 Print the hero’s HP after the attack.

5. **Mana Recharge**
   Mana starts at 45. Each turn it regenerates by 10.
   👉 Show the mana after 1, 2, and 3 turns (without loops, just calculation).

---

#### Medium (use modulo, increments, mixed operators)

6. **Ammo Reloading**
   A player has 53 bullets, and each magazine holds 7.
   👉 Print how many full magazines they have and how many bullets are left.

7. **Level Up XP**
   The player has 1180 XP. Each level requires 500 XP.
   👉 Print the current level and leftover XP.

8. **Critical Hit Counter**
   Start with `int critCount = 0;`.
   👉 Use `++` to simulate landing 3 critical hits in a row and print after each hit.

9. **Speed Boost**
   A car’s speed is 150 km/h. It picks up a boost of +20, then another +30.
   👉 Print the final speed, then reduce it by 50 when the boost runs out.

10. **Boss Weak Point**
    A boss takes 50% more damage from fire attacks.
    👉 Base attack = 40. Fire attack = base × 1.5. Print the result as an `int`.

---

#### Harder (combining operations, trickier calculations)

11. **Quest Rewards**
    A quest gives 1350 gold. The player splits it evenly among 4 friends.
    👉 How much gold does each friend get, and how much is left over?

12. **Lap Counter**
    A racetrack is 5 km. The player drives 47 km.
    👉 How many full laps did they complete, and how much distance on the next lap?

13. **Durability Check**
    A sword has durability 80/100. Each hit reduces durability by 7.
    👉 How many hits before the sword breaks? (integer division)

14. **Treasure Code**
    You find a treasure chest locked with a code. The code is `(key1++ + ++key2 * key3--)`.
    Start with `int key1 = 2, key2 = 3, key3 = 4;`.
    👉 Print the code.

15. **Stamina Drain**
    A player starts with 120 stamina. Every sprint drains 17.
    👉 How many full sprints before stamina reaches 0?

---

#### Advanced (string + numbers + trick operations)

16. **Player Profile**
    Store: name, health, level, gold, hasMagicSword (boolean).
    👉 Print a line like:
    `"Hero Aragon (Level 5) has 78 HP, 120 gold, and a magic sword: true"`

17. **Battle Outcome**
    Hero attack = 45, Monster defense = 30.
    👉 Net damage = hero attack – monster defense. If negative, damage = 0.

18. **Energy Orb**
    An orb recharges by doubling its energy each turn. Start with 2.
    👉 Show energy after 3 turns.

19. **Lucky Number Check**
    A player rolls a number. If the number modulo 7 = 0, it’s a “lucky roll.”
    👉 Write code to test with a given number.

20. **Final Boss Attack**
    `int a = 5, b = 3, c = 2;`
    Attack power is calculated as: `a++ * --b + c++ / b`.
    👉 Print the result and final values of a, b, c.

---

Absolutely—here are **10 short, game-flavored Java puzzles** like yours. Each prints something: students guess the output first, then check the answer key below.

---

### 🔮 Puzzles (guess the output)

```java
// 1) Coin Pouch
int a = 4, b = 6;
System.out.println(a++ + ++b); // ??
```

```java
// 2) Combo Attack
int x = 5, y = 3, z = 2;
System.out.println(x++ + ++y * z++); // ??
```

```java
// 3) Loot Bags
int eggs = 150, perBox = 12;
System.out.println(eggs / perBox + " " + eggs % perBox); // ??
```

```java
// 4) Mana Surge
int n = 10;
n += n++ + ++n;
System.out.println(n); // ??
```

```java
// 5) Triple Buff
int p = 7;
System.out.println(p++ + p++ + ++p); // ??
```

```java
// 6) Bow Shot
int u = 2, v = 5;
System.out.println(++u * v-- - u++); // ??
```

```java
// 7) Average Loot (gotcha: integer division stored in double)
int gold = 10, players = 3;
double avg = gold / players;
System.out.println(avg); // ??
```

```java
// 8) Arena Math
int m = 5, d = 3;
System.out.println(m / d * d + m % d); // ??
```

```java
// 9) Level Trick
int lvl = 1;
lvl = lvl++ + ++lvl + lvl;
System.out.println(lvl); // ??
```

```java
// 10) Final Boss Formula
int A = 5, B = 3, C = 2;
System.out.println(A++ * --B + C++ / B); // ??
```

---

### 🔮 Puzzles (guess the output)

```java
// 1) Coin Pouch
int a = 4, b = 6;
System.out.println(a++ + ++b); // ??
```

```java
// 2) Combo Attack
int x = 5, y = 3, z = 2;
System.out.println(x++ + ++y * z++); // ??
```

```java
// 3) Loot Bags
int eggs = 150, perBox = 12;
System.out.println(eggs / perBox + " " + eggs % perBox); // ??
```

```java
// 4) Mana Surge
int n = 10;
n += n++ + ++n;
System.out.println(n); // ??
```

```java
// 5) Triple Buff
int p = 7;
System.out.println(p++ + p++ + ++p); // ??
```

```java
// 6) Bow Shot
int u = 2, v = 5;
System.out.println(++u * v-- - u++); // ??
```

```java
// 7) Average Loot (gotcha: integer division stored in double)
int gold = 10, players = 3;
double avg = gold / players;
System.out.println(avg); // ??
```

```java
// 8) Arena Math
int m = 5, d = 3;
System.out.println(m / d * d + m % d); // ??
```

```java
// 9) Level Trick
int lvl = 1;
lvl = lvl++ + ++lvl + lvl;
System.out.println(lvl); // ??
```

```java
// 10) Final Boss Formula
int A = 5, B = 3, C = 2;
System.out.println(A++ * --B + C++ / B); // ??
```

---


