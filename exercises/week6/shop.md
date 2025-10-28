### 🎩🎸 Mini Project 3: *Wilmer's Wonder Shop – Magic Meets Music!*

**Welcome to Wilmer’s Wonder Emporium**, where enchanted wands sit beside vintage guitars, and top hats share shelves with drum kits. Your job is to build a system that manages all these magical and musical items—and gives them life through a magician and a musician!

#### **🎯 Project Goal:**

Create a system that tracks **both magic items and musical instruments**, and lets characters interact with the items in fun and polymorphic ways.

---

### 🧱 Step 1: Build the Item Hierarchy

1. Create a **base class** called `Item` with:

    * `name` (String)
    * `price` (double)
    * A method `use()`.

2. Create two subclasses of `Item`:

    * `MagicItem`
    * `MusicItem`

3. Create **two+ subclasses of each**:

    * For `MagicItem`:

        * `Wand`
        * `Potion`
    * For `MusicItem`:

        * `Guitar`
        * `DrumKit`

4. Override the `use()` method in each concrete subclass:

    * `Wand` might print: `"✨ Swish! The wand sparks with magical energy!"`
    * `Potion` might print: `"💫 You drink the potion. You feel invisible!"`
    * `Guitar` might print: `"🎸 Strumming the strings of the guitar!"`
    * `DrumKit` might print: `"🥁 Boom boom! The drumbeat fills the room!"`

5. Use **constructors** with `super(...)` to initialize name and price.

---

### 🧙 Step 2: Create the Characters

Create two classes:

* `Magician`:

    * Has a `List<MagicItem>`
    * A method `performShow()` that loops through the list and calls `use()` on each item.

* `Musician`:

    * Has a `List<MusicItem>`
    * A method `playConcert()` that loops through the list and calls `use()` on each item.

---

### 🧪 Step 3: Main Program Setup

In your `main()` method:

* Create several magic and music items.
* Create a `Magician` and a `Musician`.
* Add appropriate items to their lists.
* Call `performShow()` and `playConcert()` to see everything in action!

---

### ⭐ Bonus Ideas:

* Add a `rarity` level to `MagicItem` and a `numberOfStrings` or `isAcoustic` to `MusicItem`.
* Make a combined `List<Item>` and loop through it to call `use()` — showing off polymorphism at the top level.
* Add a method to calculate total value of a performer’s equipment.

---

🎯 *This project invites you to have fun with your imagination and practice powerful OOP concepts like inheritance, polymorphism, and classes. You’re not just writing code—you’re creating an enchanted universe that rocks!* 💥

---


