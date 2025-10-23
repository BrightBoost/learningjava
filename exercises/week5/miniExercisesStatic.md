## 🧩 1. Static vs Instance Variables (Counting Objects)

**Goal:** See how `static` makes a variable shared across all objects.

**Steps:**

1. Create a class `Cat` with:

    * A non-static field `name`
    * A static field `catCount`
2. In the constructor, increment `catCount` every time a new `Cat` is created.
3. Create three cats in your `main` method. 
4. Print `catCount` after creating each one.

**Reflection:**
Why does `catCount` increase even though each `Cat` has its own name?

---

## ⚙️ 2. Static Methods (Utility Functions)

**Goal:** See how static methods can be used without creating objects.

**Steps:**

1. Create a class `MathHelper` with a static method `add(int a, int b)` that returns their sum.
2. Try to call it from a `main` method:

    * Directly: `MathHelper.add(3, 5)`
    * From an instance: `new MathHelper().add(3, 5)`
      What happens?
3. Add another static method: `square(int number)`.

**Reflection:**
Why can you call the method without creating a `MathHelper` object?

---

## 🏷️ 3. Mixing Static and Instance Members

**Goal:** Learn which members static methods can and can’t access.

**Steps:**

1. Create a class `Counter` with:

    * `private int value = 0;`
    * `private static int total = 0;`
    * `public void increment()` that increases both.
    * `public static void printTotal()`
2. Inside `printTotal()`, try printing both `value` and `total`.
3. Create a `main` method in a separate class with multiple `Counter` objects.

**Reflection:**
Why can’t the static method access `value` directly?

---

## 🔁 4. Static Factory Method

**Goal:** Learn a real-world use case for static methods.

**Steps:**

1. Create a class `User` with:

    * A private constructor.
    * A static method `createGuest()` that returns a new `User` with the name `"Guest"`.
2. In `main`, create a guest using `User.createGuest()`.

**Reflection:**
Why might you prefer a static method like `createGuest()` instead of `new User()`?

---

## 💡 5. Shared Settings (Static Field Across Instances)

**Goal:** Observe that all instances share static data.

**Steps:**

1. Create a class `GameSettings` with a static field `volumeLevel = 5`.
2. In `main`, create two “fake players”:

    * Player 1 changes `GameSettings.volumeLevel` to 10.
    * Player 2 prints `GameSettings.volumeLevel`.

**Reflection:**
Why does Player 2 see the updated value even though they didn’t change it?

---

## 🧱 6. Very Challenging Challenge: Singleton Pattern Lite

**Goal:** Use `static` to make sure only one object exists.

**Steps:**

1. Create a class `DatabaseConnection`.
2. Add:

    * A private static field `instance`.
    * A private constructor.
    * A public static method `getInstance()` that creates a new object only if `instance` is `null`.
3. Call `getInstance()` twice in `main` and compare them with `==`.

**Reflection:**
Why do both calls return the same object? What role does `static` play?

