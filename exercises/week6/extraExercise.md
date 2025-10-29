# 🏰 The Battle for Hogwarts: A Complete OOP Adventure

## 📖 Story Overview

Dark forces are threatening Hogwarts! The Ministry of Magic has commissioned you to build a magical combat system to prepare students and professors for the upcoming battle. You'll create a complete object-oriented system that tracks magical beings, their abilities, spells, and battle outcomes.

---

## 🎯 Project Requirements

You will build a multi-class system with inheritance, composition, polymorphism, and abstraction. The project is divided into phases that build upon each other.

---

## 📋 Phase 1: The Foundation - Abstract Magical Beings

### Story Context
Before we can have wizards and creatures, we need to define what it means to be a magical being in this world.

### Tasks

**1.1 Create an Abstract Class: `MagicalBeing`**

Properties:
- `name` (String)
- `health` (int) - starts at 100
- `magicalPower` (int) - represents overall magical strength
- `isAlive` (boolean) - true if health > 0

Abstract Methods:
- `attack(MagicalBeing target)` - each type attacks differently
- `getType()` - returns a String describing what type of being this is

Concrete Methods:
- `takeDamage(int damage)` - reduces health, sets isAlive to false if health <= 0
- `heal(int amount)` - increases health (max 100)
- `introduce()` - prints name and type
- Constructor that takes name and magicalPower

**Test Your Code:**
- Try to instantiate `MagicalBeing` directly (it should fail - it's abstract!)
- This confirms your abstract class is set up correctly

---

## 🧙‍♂️ Phase 2: The Wizarding Classes

### Story Context
Now we'll create the different types of magical beings that will fight in the battle. Each has unique abilities and fighting styles.

### Tasks

**2.1 Create `Wizard` Class (extends MagicalBeing)**

Additional Properties:
- `house` (String) - Gryffindor, Slytherin, Hufflepuff, or Ravenclaw
- `yearOfStudy` (int) - 1 through 7
- `wand` (Wand) - composition! Each wizard has a wand

Constructor:
- Takes name, magicalPower, house, and yearOfStudy
- Creates a default wand for now (we'll improve this later)

Methods:
- Implement `attack(MagicalBeing target)` - deals damage based on magicalPower and yearOfStudy
    - Damage formula: `(magicalPower / 10) + yearOfStudy`
    - Print: "[name] from [house] casts a spell at [target]!"
- Implement `getType()` - returns "Student Wizard"
- `study()` - increases yearOfStudy by 1 (max 7) and magicalPower by 5

**2.2 Create `Professor` Class (extends Wizard)**

Additional Properties:
- `subject` (String) - Defense Against Dark Arts, Potions, Transfiguration, etc.
- `yearsTeaching` (int)

Constructor:
- Takes name, magicalPower, house, subject
- Sets yearOfStudy to 7 automatically (professors are fully trained!)
- Sets yearsTeaching to 0

Methods:
- Override `attack(MagicalBeing target)` - professors are more powerful!
    - Damage formula: `(magicalPower / 10) + yearOfStudy + yearsTeaching`
    - Print: "Professor [name] casts a powerful [subject] spell at [target]!"
- Override `getType()` - returns "Professor of [subject]"
- `teachStudent(Wizard student)` - calls the student's study() method
    - Print: "Professor [name] teaches [student] advanced [subject]"

**2.3 Create `DarkWizard` Class (extends Wizard)**

Additional Properties:
- `darkArtsLevel` (int) - how powerful their dark magic is (1-10)
- `cursesKnown` (ArrayList<String>) - list of dark curses they know

Constructor:
- Takes name, magicalPower, darkArtsLevel
- Sets house to "None" (they've abandoned their houses)
- Sets yearOfStudy to 7
- Initializes cursesKnown list with at least 3 dark curses

Methods:
- Override `attack(MagicalBeing target)` - dark wizards are ruthless!
    - Damage formula: `(magicalPower / 10) + yearOfStudy + (darkArtsLevel * 2)`
    - Print: "💀 [name] casts [random curse from list] at [target]!"
- Override `getType()` - returns "Dark Wizard"
- `learnDarkCurse(String curse)` - adds a new curse to their list

---

## 🪄 Phase 3: The Wand System (Composition)

### Story Context
"The wand chooses the wizard, Harry." Every wizard needs a proper wand, and different wands grant different abilities.

### Tasks

**3.1 Create `Wand` Class**

Properties:
- `wood` (String) - Holly, Elder, Willow, etc.
- `core` (String) - Phoenix feather, Dragon heartstring, Unicorn hair
- `length` (double) - in inches
- `powerBonus` (int) - how much extra power this wand provides

Constructor:
- Takes wood, core, and length
- Calculates powerBonus based on the combination:
    - Phoenix feather core: +10
    - Dragon heartstring core: +8
    - Unicorn hair core: +6
    - Elder wood: +5 additional
    - Other combinations: base value only

Methods:
- `getDescription()` - returns a formatted string: "[length]\" [wood] wand with [core] core"
- `isElderWand()` - returns true if wood is "Elder" and core is "Phoenix feather"

**3.2 Create `WandShop` Class (Static Methods)**

This class uses static methods because there's only one Ollivanders shop!

Static Methods:
- `createCustomWand(String wood, String core, double length)` - creates and returns a new Wand
- `createRandomWand()` - creates a wand with random properties
    - Arrays of wood types, cores to choose from randomly
- `repairWand(Wand wand)` - prints "Wand repaired by Ollivander!" (for now)

**3.3 Update Wizard Class**

- Modify constructor to accept a Wand parameter
- Add `getWand()` and `setWand(Wand wand)` methods
- Modify `attack()` method to include wand's powerBonus in damage calculation

---

## 🧪 Phase 4: The Spell System

### Story Context
Wizards need more than just basic attacks - they need a proper arsenal of spells!

### Tasks

**4.1 Create `Spell` Class**

Properties:
- `name` (String)
- `damageAmount` (int)
- `spellType` (String) - "Offensive", "Defensive", "Healing"
- `requiredPowerLevel` (int) - minimum magicalPower needed to cast

Constructor:
- Takes all properties

Methods:
- `cast(MagicalBeing caster, MagicalBeing target)` - executes the spell
    - Check if caster has enough magicalPower
    - If offensive: call target.takeDamage(damageAmount)
    - If healing: call target.heal(damageAmount)
    - If defensive: print protective message (we'll enhance this later)
    - Print: "[caster] casts [spell name]!"

**4.2 Create `SpellBook` Class**

Properties:
- `owner` (Wizard) - who owns this spellbook
- `knownSpells` (ArrayList<Spell>)

Constructor:
- Takes owner
- Initializes empty spell list

Methods:
- `learnSpell(Spell spell)` - adds spell to list if wizard's power is sufficient
- `castSpell(String spellName, MagicalBeing target)` - finds and casts the spell
- `listSpells()` - prints all known spells
- `getStrongestSpell()` - returns the spell with highest damage

**4.3 Update Wizard Class**

- Add `spellBook` (SpellBook) property
- Initialize in constructor
- Add method `learnNewSpell(Spell spell)` - delegates to spellBook

**4.4 Create `SpellLibrary` Class (Static)**

Static ArrayList:
- `availableSpells` - a library of all spells in the world

Static Methods:
- `initializeSpells()` - creates famous spells and adds to library:
    - Expelliarmus (Offensive, 15 damage, requires 30 power)
    - Stupefy (Offensive, 20 damage, requires 40 power)
    - Protego (Defensive, 0 damage, requires 25 power)
    - Episkey (Healing, 25 heal, requires 35 power)
    - Avada Kedavra (Offensive, 100 damage, requires 95 power)
    - Add at least 5 more of your own creation!
- `getAllSpells()` - returns the list
- `getSpellByName(String name)` - searches and returns specific spell
- `getSpellsForPowerLevel(int powerLevel)` - returns spells wizard can learn

Call `initializeSpells()` in a static block so it runs when class loads!

---

## 🐉 Phase 5: Magical Creatures

### Story Context
Dark wizards have recruited dangerous magical creatures to their side!

### Tasks

**5.1 Create `MagicalCreature` Class (extends MagicalBeing)**

Properties:
- `species` (String) - Dragon, Basilisk, Dementor, etc.
- `dangerLevel` (int) - 1 to 10

Constructor:
- Takes name, magicalPower, species, dangerLevel

Methods:
- Implement `attack(MagicalBeing target)`
    - Damage formula: `(magicalPower / 8) + (dangerLevel * 3)`
    - Print: "🐉 The [species] [name] attacks [target] viciously!"
- Implement `getType()` - returns "[species] - Danger Level [dangerLevel]"
- `roar()` - prints menacing message based on species

**5.2 Create Specific Creature Classes**

Create at least 3 specific creature types that extend MagicalCreature:

**Dragon** (extends MagicalCreature):
- Additional property: `breathType` (Fire, Ice, Poison)
- Override `attack()` to include breath weapon
- Add method `fly()` - prints flying message

**Dementor** (extends MagicalCreature):
- Additional property: `soulsConsumed` (int)
- Override `attack()` - drains extra health and increases soulsConsumed
- Add method `kissOfDeath(MagicalBeing target)` - instant kill (sets health to 0)

**Basilisk** (extends MagicalCreature):
- Additional property: `eyesPower` (int)
- Override `attack()` - chance to petrify (extra damage if successful)
- Add method `petrify(MagicalBeing target)` - special attack

---

## ⚔️ Phase 6: The Battle System

### Story Context
Now we bring it all together - the epic battle for Hogwarts!

### Tasks

**6.1 Create `BattleArena` Class**

Properties:
- `lightSide` (ArrayList<MagicalBeing>) - the good guys
- `darkSide` (ArrayList<MagicalBeing>) - the bad guys
- `battleLog` (ArrayList<String>) - keeps track of what happens
- `roundNumber` (int)

Constructor:
- Initializes empty lists

Methods:
- `addToLightSide(MagicalBeing being)` - adds hero
- `addToDarkSide(MagicalBeing being)` - adds villain
- `startBattle()` - main battle loop:
    - While both sides have living beings
    - Each round, random being from each side attacks
    - Log all actions
    - Check for victory after each round
    - Print round summary
- `determineWinner()` - checks which side has survivors
- `printBattleLog()` - displays complete battle history
- `getStats()` - shows statistics (total damage dealt, spells cast, etc.)
- `healSurvivors()` - heals all living beings to full health

**6.2 Create `Tournament` Class**

A special type of organized battle with rules!

Properties:
- `participants` (ArrayList<MagicalBeing>)
- `matches` (ArrayList<String>) - records of each match
- `champion` (MagicalBeing) - the winner

Methods:
- `registerParticipant(MagicalBeing being)` - adds to tournament
- `startTournament()` - runs bracket-style elimination
    - Pairs up fighters
    - Each pair battles (first to 50 health loss)
    - Winners advance
    - Continue until one champion remains
- `declareChampion()` - announces and returns the winner

---

## 🎖️ Phase 7: Advanced Features & Polish

### Story Context
Add the finishing touches that make your system truly magical!

### Tasks

**7.1 Create `HogwartsHospitalWing` Class (Static)**

Static Properties:
- `patientsHealed` (int)
- `potionsUsed` (int)

Static Methods:
- `admitPatient(MagicalBeing patient)` - fully heals them
- `createHealingPotion()` - returns amount to heal
- `getStatistics()` - prints hospital stats

**7.2 Create `HousePoints` Class**

Properties:
- `houseName` (String)
- `points` (int)

Static Properties:
- `allHouses` (ArrayList<HousePoints>) - tracks all four houses

Methods:
- `addPoints(int amount)` - adds points
- `deductPoints(int amount)` - removes points
- Static: `getHouseCup()` - returns house with most points
- Static: `displayStandings()` - shows all houses and points

**7.3 Enhance Your Classes with instanceof**

Add to BattleArena:
- `checkSpecialAbilities(MagicalBeing being)` - uses instanceof to check type and give bonuses:
    - If Professor: 10% damage bonus
    - If Dark Wizard: Can use forbidden spells
    - If Dragon: Can attack twice per round
    - If Dementor: Can drain health

**7.4 Add Interfaces (Advanced OOP)**

Create interface `Flyable`:
```java
interface Flyable {
    void takeOff();
    void land();
    int getAltitude();
}
```

Make relevant classes implement it (Dragons, some Wizards with brooms)

Create interface `Teachable`:
```java
interface Teachable {
    void teach(Wizard student);
    String getSubject();
}
```

Make Professor implement it

---

## 🧪 Phase 8: JUnit Testing Suite

### Story Context
The Ministry requires that all magical systems be thoroughly tested!

### Tasks

Create comprehensive JUnit tests:

**8.1 Test `MagicalBeing` and Subclasses**
- Test health system (damage, healing, death)
- Test attack methods for each type
- Test polymorphism (MagicalBeing list with different types)

**8.2 Test `Wand` System**
- Test wand creation and bonuses
- Test WandShop static methods
- Test Elder Wand detection

**8.3 Test `Spell` System**
- Test spell casting with sufficient/insufficient power
- Test SpellBook learning and casting
- Test SpellLibrary static methods

**8.4 Test `Battle` System**
- Test adding fighters to sides
- Test battle execution
- Test winner determination
- Test tournament brackets

Create at least **20 meaningful test methods**!

---

## 🎬 Phase 9: The Main Application

### Story Context
Bring everything together in an epic demonstration!

### Tasks

**9.1 Create `HogwartsBattleSimulator` Class with main() method**

Your main method should:

1. **Initialize the world**
    - Call SpellLibrary.initializeSpells()
    - Create the four houses with HousePoints
    - Print welcome message

2. **Create the heroes** (at least 6)
    - Harry Potter (Wizard)
    - Hermione Granger (Wizard)
    - Professor McGonagall (Professor)
    - Professor Snape (Professor)
    - Ron Weasley (Wizard)
    - Neville Longbottom (Wizard)

   Give each a custom wand, teach them spells, set properties

3. **Create the villains** (at least 6)
    - Voldemort (Dark Wizard)
    - Bellatrix Lestrange (Dark Wizard)
    - Lucius Malfoy (Dark Wizard)
    - Hungarian Horntail Dragon (Dragon)
    - Basilisk (Basilisk)
    - Dementor (Dementor)

   Configure their abilities

4. **Pre-battle preparation**
    - Show all characters with their stats
    - Professors teach students (call teach methods)
    - Students learn spells
    - Print updated stats

5. **Run a tournament** (optional)
    - Small friendly tournament among students
    - Award house points to winner

6. **The main battle**
    - Create BattleArena
    - Add heroes to light side
    - Add villains to dark side
    - Start battle
    - Print detailed results

7. **Post-battle**
    - Send wounded to Hospital Wing
    - Award house points based on performance
    - Display House Cup standings
    - Print battle statistics
    - Declare overall victory

8. **Demonstrate polymorphism**
    - Create a mixed list of MagicalBeing types
    - Loop through and call methods
    - Use instanceof to handle special cases

9. **Show off composition**
    - Print all wizards and their wand details
    - Show which spells each wizard knows

**9.2 Make it Interactive (Bonus)**
- Use Scanner to let user make choices
- Let user pick which wizard to play as
- Let user choose spells during battle
- Menu system for different scenarios

---

## 📊 Phase 10: Bonus Challenges

### For students who finish early:

**10.1 Advanced Features**
- Add a `Potion` class with effects
- Create a `MagicalItem` abstract class (Invisibility Cloak, Time-Turner)
- Add status effects (Stunned, Petrified, Poisoned)
- Create a `Team` class that coordinates attacks

**10.2 Design Patterns**
- Implement Singleton pattern for `Hogwarts` class
- Use Factory pattern for creating different wizard types
- Add Observer pattern for battle events

**10.3 Data Persistence**
- Save battle results to a file
- Load saved wizards from file
- Create a leaderboard system

**10.4 Advanced Combat**
- Add turn-based strategy
- Implement spell combos
- Add mana/energy system
- Create defensive spells that actually block

---

