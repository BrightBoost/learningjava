## 🎮 Code Quest – Return of the Methods

Your job as Junior Game Mage is to create helper methods with return values for Code Quest’s logic engine!

---

### **1. public static String getPlayerTitle(String name)**
> Return a string like:  
`"Lord " + name` or `"Princess " + name"`  
→ Call it in `main()` and print the result.

---

### **2. public static int doubleXP(int xp)**
> Given an XP amount, return **double** that amount.  
→ Print the original and doubled XP.

---

### **3. public static boolean hasLeveledUp(int currentXP, int threshold)**
> Return `true` if `currentXP` is greater than or equal to `threshold`, otherwise `false`.

🧠 Add an `if` in `main()` to print:
- `"You leveled up!"` or  
- `"Keep grinding..."`

---

### **4. public static int rollDice()**
> Return a random number from 1 to 6 using `Math.random()` (simulate a dice roll).  
→ Call it 3 times and print each roll.

---

### **5. public static int calculateDamage(int strength, int enemyDefense)**
> Return the result of:
```java
(strength * 2) - enemyDefense
```
→ If result is less than 0, return 0.  
→ Print the damage dealt.

---

### **6. public static boolean canOpenChest(boolean hasKey, boolean lockIsBroken)**
> Return `true` if the player has a key **or** the lock is broken.  
→ Test all 4 possible combinations in `main()`.

---

### **7. public static String getPlayerClass(int choice)**
> Based on an `int` input, return a class name:
```
1 → "Warrior"
2 → "Mage"
3 → "Rogue"
default → "Peasant"
```
→ Ask the user for input using `Scanner`, then print their class.

---

### **8. public static int addGold(int currentGold, int goldFound)**
> Return the new total gold after looting.  
→ Bonus: if `goldFound` is over 100, add a **10% tax** (deduct it before adding).  
→ Print the final amount of gold.

---

### **9. public static boolean isQuestComplete(int tasksDone, int totalTasks)**
> Return `true` if `tasksDone == totalTasks`.  
→ Add a message in `main()`:
- ✅ `"Quest complete!"`  
- ⏳ `"You still have work to do."`

---

### **10. public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion)**
> If `bossHP <= 0`, return `true`.  
> Else if `playerHP <= 0` **and** potion wasn’t used → return `false`.  
> Else if potion was used, restore 50 HP and return `playerHP + 50 > bossHP`.

→ Try calling this with different values and print whether the boss is defeated.

---

## 🧙 Bonus Challenge

> Wrap it all in a **text-based story** in `main()` that uses multiple of your methods to simulate a mini game round.

