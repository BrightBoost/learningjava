# JUnit Mini Exercises

**Please mind**: YOU DON'T NEED TO DO ALL OF THESE.

## General requirements:
1. Always use the AAA pattern: **Arrange**, **Act**, **Assert**
2. Use `@BeforeEach` to create fresh objects for each test where it makes sense
3. Give your tests descriptive names that explain what they're testing
4. Start with the easiest exercises and work your way up

---

## Exercise 1: Dice (Warm up: copy pasta)
**Theme**: Rolling a six-sided dice

**Task**: Create a `Dice` class with:
- A constructor that takes no parameters
- A method `getLastRoll()` that returns the last rolled number (initially 0)
- A method `roll()` that returns a random number between 1-6 and stores it

**Test Requirements**:
- Test that a new dice has `getLastRoll()` returning 0
- Test that after calling `roll()`, `getLastRoll()` returns a number between 1 and 6
- Use `assertTrue()` to verify the rolled number is within range

```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    private Dice dice;

    @BeforeEach
    void init() {
        dice = new Dice();
    }

    @Test
    void getLastRoll_newDice() {
        // arrange
        int expectedRoll = 0;

        // act
        int lastRoll = dice.getLastRoll();

        // assert
        assertEquals(expectedRoll, lastRoll);
    }

    @Test
    void roll_returnsValidNumber() {
        // arrange
        // (no arrangement needed)

        // act
        int rolled = dice.roll();

        // assert
        assertTrue(rolled >= 1 && rolled <= 6);
    }

    @Test
    void getLastRoll_afterRoll() {
        // arrange
        dice.roll();

        // act
        int lastRoll = dice.getLastRoll();

        // assert
        assertTrue(lastRoll >= 1 && lastRoll <= 6);
    }
}
```

---

## Exercise 2: Player Score (Easy)
**Theme**: Tracking a player's score

**Task**: Create a `Player` class with:
- A constructor that takes a `String name` and sets score to 0
- A method `getName()` that returns the player's name
- A method `getScore()` that returns the current score
- A method `addPoints(int points)` that adds points to the score

**Test Requirements**:
- Test that a new player has score 0
- Test that `getName()` returns the correct name
- Test that `addPoints()` correctly increases the score

---

## Exercise 3: Health Points (Easy)
**Theme**: Character health system

**Task**: Create a `Character` class with:
- A constructor that takes `String name` and `int maxHp`, sets current HP to max
- A method `getName()` that returns the character's name
- A method `getCurrentHp()` that returns current HP
- A method `getMaxHp()` that returns maximum HP
- A method `isAlive()` that returns true if HP > 0

**Test Requirements**:
- Test that a new character has full HP
- Test that `isAlive()` returns true for a new character
- Test that `getName()` returns the correct name

---

## Exercise 4: Coin Flip (Easy)
**Theme**: Flipping a coin

**Task**: Create a `Coin` class with:
- A constructor that takes no parameters
- A method `flip()` that returns either "HEADS" or "TAILS" randomly
- A method `getLastFlip()` that returns the last flip result (initially null)

**Test Requirements**:
- Test that a new coin has `getLastFlip()` returning null
- Test that after flipping, `getLastFlip()` is either "HEADS" or "TAILS"
- Test using `assertTrue()` with OR condition

---

## Exercise 5: Inventory System (Easy)
**Theme**: Managing game items

**Task**: Create an `Inventory` class with:
- A constructor that takes `int capacity`
- A method `getCapacity()` that returns the max capacity
- A method `getCurrentSize()` that returns number of items
- A method `addItem(String itemName)` that returns true if item added successfully, false if inventory full
- A method `isEmpty()` that returns true if no items

**Test Requirements**:
- Test that new inventory is empty
- Test that adding items increases current size
- Test that adding items beyond capacity returns false
- Test that `isEmpty()` returns false after adding an item

---

## Exercise 6: Damage Calculator (Easy-Medium)
**Theme**: Calculating attack damage

**Task**: Create a `DamageCalculator` class with:
- A constructor that takes no parameters
- A method `calculateDamage(int attackPower, int defense)` that returns `attackPower - defense` (minimum 0)
- A method `calculateCriticalDamage(int attackPower, int defense)` that returns damage * 2 (minimum 0)

**Test Requirements**:
- Test normal damage calculation
- Test that damage never goes below 0
- Test critical damage is double normal damage
- Test with defense higher than attack power

---

## Exercise 7: Quest Completion (Medium)
**Theme**: Tracking quest progress

**Task**: Create a `Quest` class with:
- A constructor that takes `String name`, `int requiredProgress`
- A method `getName()` that returns quest name
- A method `getCurrentProgress()` that returns current progress (initially 0)
- A method `addProgress(int amount)` that increases progress
- A method `isCompleted()` that returns true if progress >= required
- A method `getCompletionPercentage()` that returns progress as percentage (0-100)

**Test Requirements**:
- Test that new quest is not completed
- Test progress increases correctly
- Test quest becomes completed when reaching required progress
- Test completion percentage calculation

---

## Exercise 8: Skill Cooldown (Medium)
**Theme**: Managing ability cooldowns

**Task**: Create a `Skill` class with:
- A constructor that takes `String name`, `int cooldownTurns`
- A method `getName()` that returns skill name
- A method `isReady()` that returns true if skill can be used
- A method `use()` that uses the skill and puts it on cooldown, returns true if successful
- A method `reduceCooldown()` that reduces remaining cooldown by 1 turn

**Test Requirements**:
- Test that new skill is ready
- Test that using skill puts it on cooldown
- Test that skill is not ready while on cooldown
- Test that reducing cooldown eventually makes skill ready again

---

## Exercise 9: Loot Drop (Medium)
**Theme**: Random loot generation

**Task**: Create a `LootBox` class with:
- A constructor that takes `int commonChance`, `int rareChance` (percentages that sum <= 100)
- A method `open()` that returns "COMMON", "RARE", or "LEGENDARY"
- A method `getTotalOpened()` that returns number of boxes opened
- The chances should work as: commonChance% for COMMON, rareChance% for RARE, rest for LEGENDARY

**Test Requirements**:
- Test that opening a box increments total opened
- Test that returned value is one of the three valid strings
- Test using `assertNotEquals()` to verify result is not null or empty

---

## Exercise 10: Team Formation (Medium)
**Theme**: Managing a party of players

**Task**: Create a `Team` class with:
- A constructor that takes `int maxSize`
- A method `addMember(String name)` that returns true if added successfully
- A method `removeMember(String name)` that returns true if removed successfully
- A method `getMemberCount()` that returns current member count
- A method `isFull()` that returns true if team is at max capacity
- A method `hasMember(String name)` that returns true if member exists

**Test Requirements**:
- Test adding members increases count
- Test cannot add beyond max size
- Test removing members decreases count
- Test `hasMember()` works correctly
- Test `isFull()` returns true at capacity

---

## Exercise 11: Combat Turn Order (Medium-Hard)
**Theme**: Determining turn order by speed

**Task**: Create a `CombatManager` class with:
- A constructor that takes no parameters
- A method `addFighter(String name, int speed)` that adds a fighter
- A method `getTurnOrder()` that returns a `String[]` of fighter names sorted by speed (highest first)
- A method `getFighterCount()` that returns number of fighters

**Test Requirements**:
- Test turn order is sorted correctly by speed
- Test fighters with same speed maintain their addition order
- Test empty turn order returns empty array
- Use `assertArrayEquals()` to verify order

---

## Exercise 12: Resource Gathering (Medium-Hard)
**Theme**: Collecting and managing resources

**Task**: Create a `ResourceManager` class with:
- A constructor that takes no parameters
- A method `addResource(String type, int amount)` that adds resources
- A method `getResource(String type)` that returns amount of that resource (0 if none)
- A method `spendResource(String type, int amount)` that returns true if enough resources and deducts them
- A method `hasEnoughResources(String type, int amount)` that returns true if enough available

**Test Requirements**:
- Test adding resources increases the amount
- Test getting non-existent resource returns 0
- Test spending resources deducts correctly
- Test cannot spend more than available
- Test `hasEnoughResources()` works correctly

---

## Exercise 13: Buff/Debuff System (Hard)
**Theme**: Temporary stat modifications

**Task**: Create a `StatusEffect` class with:
- A constructor that takes `String name`, `int durationTurns`, `int statModifier`
- A method `getName()` that returns effect name
- A method `getDuration()` that returns remaining turns
- A method `getModifier()` that returns stat modifier
- A method `decreaseDuration()` that reduces duration by 1
- A method `isActive()` that returns true if duration > 0

**Test Requirements**:
- Test new effect has correct duration
- Test decreasing duration works correctly
- Test effect becomes inactive at 0 duration
- Test that duration cannot go below 0
- Test stat modifier remains constant

---

## Exercise 14: Achievement System (Hard)
**Theme**: Unlocking achievements with multiple criteria

**Task**: Create an `Achievement` class with:
- A constructor that takes `String name`, `int requiredKills`, `int requiredLevel`, `int requiredGold`
- A method `checkUnlock(int kills, int level, int gold)` that returns true if all requirements met
- A method `isUnlocked()` that returns true if achievement was unlocked
- A method `getProgress(int kills, int level, int gold)` that returns `int[]` with [killProgress%, levelProgress%, goldProgress%]

**Test Requirements**:
- Test achievement starts locked
- Test achievement unlocks only when ALL criteria met
- Test achievement stays unlocked after first unlock
- Test progress calculation for each criterion
- Use `assertArrayEquals()` for progress array

---

## Exercise 15: Battle Simulator (Hard)
**Theme**: Complete turn-based combat

**Task**: Create a `Battle` class with:
- A constructor that takes `String attacker`, `int attackerHp`, `String defender`, `int defenderHp`
- A method `performAttack(int damage)` that deals damage to defender
- A method `performCounterAttack(int damage)` that deals damage to attacker
- A method `getAttackerHp()` and `getDefenderHp()` that return current HP
- A method `isBattleOver()` that returns true if either HP <= 0
- A method `getWinner()` that returns winner's name or null if battle not over

**Test Requirements**:
- Test battle starts with correct HP values
- Test attacks reduce HP correctly
- Test HP cannot go below 0
- Test battle ends when either reaches 0 HP
- Test winner is determined correctly
- Test `getWinner()` returns null while battle ongoing
- Use `assertNotEquals()` and `assertFalse()` appropriately




