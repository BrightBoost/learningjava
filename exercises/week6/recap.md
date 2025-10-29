# 🧙‍♂️ Java at Hogwarts: Object-Oriented Magic Recap

---

## 🪶 1. Creating a Class (Properties, Getters, Setters, Methods)

**Mini Explanation**

A *class* is like a magical blueprint for creating objects. Each object (instance) will have its own copy of the properties. Properties are usually private, and we use getters and setters to access and modify them safely.

Example:

```java
class Wand {
    private String wood;
    private double length;
    
    public String getWood() { return wood; }
    public void setWood(String wood) { this.wood = wood; }
    
    public void castSpell() {
        System.out.println("A spell is cast with a " + wood + " wand!");
    }
}
```

**Exercise**

Create a class called `Wizard` with properties like `name`, `house`, `powerLevel`, and `wandType`.
Add getters and setters for each property, and a method `castSpell(String spell)` that prints something like:

> "Harry from Gryffindor casts Expelliarmus!"

---

## ✨ 2. Creating Instances

**Mini Explanation**

Once you have a class, you can *instantiate* it — meaning, you create an actual wizard from your blueprint. Each instance is a unique object with its own property values.

Example:

```java
Wizard harry = new Wizard();
harry.setName("Harry");
harry.setHouse("Gryffindor");
```

**Exercise**

Create three different `Wizard` instances (for example, Harry, Hermione, and Ron) and set their properties using the setter methods.
Then, call their `castSpell()` methods to see each wizard cast a spell.

---

## 🧪 3. Testing Custom Methods with JUnit

**Mini Explanation**

Unit tests are like checking whether your spells actually work. JUnit helps us make sure our methods behave as expected. We write test methods that verify our code produces the correct results.

Example:

```java
@Test
void testCastSpell() {
    Wizard harry = new Wizard();
    harry.setName("Harry");
    harry.setHouse("Gryffindor");
    // Test that the castSpell method works correctly
    // You might check output or returned values
}
```

**Exercise**

Write JUnit tests for your `Wizard` class to ensure:
- The getter and setter methods work correctly (set a name, then get it and verify it's the same)
- The `castSpell()` method behaves correctly — for example, that it prints or returns the right message
- (Bonus) Test that a wizard's power level can be increased or decreased

---

## ⚡ 4. Static Fields and Methods

**Mini Explanation**

Static things belong to the *class*, not to any one object. All instances share the same static field or can call the same static method. Use static when something should be shared by all objects or when a method doesn't need any specific object's data.

Example:

```java
class Wizard {
    static String school = "Hogwarts";  // All wizards share this
    private String name;                  // Each wizard has their own
    
    static void welcomeMessage() {
        System.out.println("Welcome to " + school + "!");
    }
}
```

**Exercise**

Add a static field `school` to your `Wizard` class and set it to "Hogwarts".
Add a static method `welcomeMessage()` that prints:

> "Welcome to Hogwarts School of Witchcraft and Wizardry!"

Call this method without creating a `Wizard` instance (use `Wizard.welcomeMessage()`).

---

## ⚖️ 5. Static or Non-Static? (10 Quick Situations)

**Mini Explanation**

Remember:
- **Static** = shared by *all* instances, belongs to the class
- **Non-static** = unique per *object*, each instance has its own

**Exercise**

Decide whether the following should be `static` or `non-static`:

1. The total number of students currently enrolled at Hogwarts
2. A wizard's name
3. A spell counter that tracks the *total* spells cast by all wizards combined
4. A spell counter that tracks *each individual wizard's* spells
5. A method that calculates an individual wizard's power level based on their experience
6. A method that prints the Hogwarts school motto (same for everyone)
7. The Sorting Hat's list of all four houses
8. The temperature at which a specific potion is currently brewing
9. The name of the current headmaster of Hogwarts
10. The specific spell a wizard is currently casting

---

## 🏰 6. Has-a Relationship (Composition)

**Mini Explanation**

When a class *has* another class as a property, that's **composition**. This represents a "has-a" relationship: a Wizard *has-a* Wand. The outer class contains an instance of the inner class.

Example:

```java
class Wand { 
    private String wood;
    private String core;
}

class Wizard { 
    private String name;
    private Wand wand;  // Wizard HAS-A Wand
}
```

**Exercise**

Create a `Wand` class with properties: `wood`, `core`, and `length` (with getters and setters).
Make your `Wizard` class *have* a `Wand` property (add a getter and setter for it).
Then, create a few `Wizard` objects, give each one a `Wand`, and print their wand details (e.g., "Harry's wand is made of Holly with a Phoenix feather core").

---

## 🔁 7. Looping Over Classes with Composition

**Mini Explanation**

When you have lists of objects that contain other objects, you can loop through them to access their nested data. You'll use the outer object's getter to access the inner object, then the inner object's getter to access its properties.

Example:

```java
for (Wizard w : wizards) {
    System.out.println(w.getName() + " has a " + w.getWand().getWood() + " wand");
}
```

**Exercise**

Create an ArrayList of `Wizard` objects, each with their own `Wand`.
Loop over the list and print each wizard's name along with their wand's wood type, core, and length.
Format it nicely, like: "Hermione's wand: Vine wood, Dragon heartstring core, 10.75 inches"

---

## 🦉 8. Inheritance (Extends Keyword)

**Mini Explanation**

Inheritance means one class *extends* another and gets all its magical abilities (fields and methods). The subclass inherits everything from the superclass and can add its own unique features.

Example:

```java
class Wizard {
    private String name;
    void castSpell() { }
}

class Professor extends Wizard {
    private String subject;  // Professors have everything Wizards have, PLUS a subject
}
```

**Exercise**

Create a `Professor` class that extends `Wizard`.
Add a `subject` property (with getter and setter) and a method `teachSpell(String spell)` that prints something like:

> "Professor McGonagall teaches you Expelliarmus in Transfiguration class"

Instantiate a few professors (e.g., McGonagall, Snape, Flitwick) and call their methods.

---

## 🪄 9. Constructors and Inheritance

**Mini Explanation**

Constructors help you *build* objects with starting values when you create them. When using inheritance, the subclass constructor must call the superclass constructor using `super()`. This ensures the parent class is properly initialized first.

**Important:** If you don't explicitly call `super()`, Java automatically calls the no-argument constructor of the superclass. If the superclass doesn't have a no-argument constructor, you'll get a compilation error.

Example:

```java
class Wizard {
    private String name;
    
    Wizard(String name) { 
        this.name = name; 
    }
}

class Professor extends Wizard {
    private String subject;
    
    Professor(String name, String subject) { 
        super(name);  // Must call parent constructor first!
        this.subject = subject; 
    }
}
```

**Exercise**

Add constructors to both `Wizard` and `Professor`:
- `Wizard` should have a constructor that takes `name`, `house`, and `powerLevel`
- `Professor` should have a constructor that takes the same parameters plus `subject`, and it should call `super()` to initialize the Wizard properties

Create several objects using these constructors (no more using setters for initial values!).

---

## 🧞‍♀️ 10. Polymorphism

**Mini Explanation**

Polymorphism lets objects of different subclasses behave differently *through the same reference type*. You can store a subclass object in a superclass variable, and when you call a method, it will use the subclass's version.

Example:

```java
Wizard w1 = new Professor("McGonagall", "Gryffindor", 95, "Transfiguration");
Wizard w2 = new Wizard("Harry", "Gryffindor", 75);

w1.castSpell();  // Uses Professor's version
w2.castSpell();  // Uses Wizard's version
```

**Exercise**

Create a `DarkWizard` class that extends `Wizard`.
Override the `castSpell()` method to print something dark and menacing.
Create a list that stores `Wizard` references but contains `Wizard`, `Professor`, and `DarkWizard` objects.
Loop through the list and call `castSpell()` on each — observe how each behaves differently even though they're all stored as `Wizard` type!

---

## 🧠 11. Overridden Methods

**Mini Explanation**

When a subclass wants to change how an inherited method works, it **overrides** it by providing a new implementation. Use the `@Override` annotation to make your intentions clear and catch errors.

Example:

```java
class Wizard {
    void castSpell() { 
        System.out.println("A generic spell is cast!"); 
    }
}

class DarkWizard extends Wizard {
    @Override
    void castSpell() { 
        System.out.println("Dark magic unleashed!"); 
    }
}
```

**Exercise**

Override the `castSpell()` method in both `Professor` and `DarkWizard` so they each produce their own unique spell output:
- Professors should cast educational spells
- Dark wizards should cast dark spells
- Regular wizards keep the original implementation

Make sure to use the `@Override` annotation!

---

## 🪶 12. Looping with Polymorphism

**Mini Explanation**

If you have a list of a **superclass type**, you can store **subclass** objects inside it and loop over them. When you call an overridden method, each object will use its own version — that's polymorphism in action!

Example:

```java
List<Wizard> wizards = new ArrayList<>();
wizards.add(new Professor("McGonagall", "Gryffindor", 95, "Transfiguration"));
wizards.add(new DarkWizard("Voldemort", "Slytherin", 100));
wizards.add(new Wizard("Harry", "Gryffindor", 75));

for (Wizard w : wizards) { 
    w.castSpell();  // Each uses their own version!
}
```

**Exercise**

Create an ArrayList of `Wizard` type that contains different wizard types (`Wizard`, `Professor`, `DarkWizard`).
Add at least 5-6 different wizards to the list.
Loop through them and call their overridden methods.
Notice how each behaves differently — that's polymorphism in action!

---

## 🧩 13. The `instanceof` Operator

**Mini Explanation**

Sometimes you want to check *what kind* of wizard you're dealing with before performing specific actions. The `instanceof` operator lets you test if an object is an instance of a particular class.

Example:

```java
if (w instanceof Professor) {
    Professor p = (Professor) w;  // Cast it to access Professor-specific methods
    System.out.println(p.getSubject());
}
```

**Exercise**

Loop through your list of wizards (from the previous exercise).
Use `instanceof` to check each wizard's type:
- If a wizard is a `Professor`, print what subject they teach
- If a wizard is a `DarkWizard`, print "⚠️ Use caution! Dark wizard detected!"
- For regular `Wizard` objects, print "Regular wizard encountered"

---

## 🏆 14. Abstract Classes and Methods

**Mini Explanation**

An abstract class is like a spellbook that can't be used directly — you must extend it to create concrete implementations. Abstract classes can have both abstract methods (no implementation, must be overridden) and concrete methods (with implementation, can be used as-is or overridden).

You **cannot** instantiate an abstract class directly. Abstract methods **must** be implemented by any non-abstract subclass.

Example:

```java
abstract class MagicalBeing {
    abstract void useMagic();  // No implementation
    
    void breathe() {           // Concrete method
        System.out.println("Breathing...");
    }
}

class Wizard extends MagicalBeing {
    @Override
    void useMagic() {
        System.out.println("Casting spells!");
    }
}
```

**Exercise**

Create an abstract class `MagicalBeing` with:
- An abstract method `useMagic()`
- A concrete method `introduce()` that prints "I am a magical being"

Make `Wizard`, `Professor`, and `DarkWizard` extend `MagicalBeing` instead of each other (restructure your inheritance).
Each class should implement `useMagic()` differently:
- Wizards use magic for learning
- Professors use magic for teaching
- Dark wizards use magic for dark purposes

Create a list of `MagicalBeing` objects, add various types, and call `useMagic()` for each.

---
