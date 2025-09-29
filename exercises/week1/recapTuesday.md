### 🔹 Challenge A: Double Trouble

* Create an `double` with any value you like.
* Multiply it by 2.
* Print both the original and the doubled value.

Example output:

```
Original: 12.0  
Doubled: 24.0
```

---

### 🔹 Challenge B: Name + Number

* Make a `String` with your name.
* Make an `int` with your favorite number.
* Print them in one sentence using concatenation.

Example output:

```
My name is Maaike and my favorite number is 7
```

---

### 🔹 Challenge C: Random Surprise

* Generate a random number between 0 and 10.
* Print it.
* Add 5 to it and print the new value.

Example output:

```
Random number: 3  
After adding 5: 8
```

---

## Bonus exercises: more challenging


### 🔹 Bonus 1: Clock Math ⏰

Take a number of hours (e.g. `27`) and calculate what hour that would be on a 24-hour clock. Use `% 24`.

Example:

```
27 hours later → 3 o’clock
```

---

### 🔹 Bonus 2: Minutes to Hours and Minutes ⏳

Take a number of minutes (e.g. `130`) and figure out how many full hours and leftover minutes that is.

* Hours = `minutes / 60`
* Leftover = `minutes % 60`

Example:

```
130 minutes = 2 hours and 10 minutes
```

---

### 🔹 Bonus 3: Time Calculator 📅


Yes! 🙌 Here’s how you could turn that into a **step-by-step exercise** for your students. It starts very basic and nudges them towards the final solution with `nrhours`, `nrminutes`, and `minutestoadd`.

---

## 📝 Exercise: Time Calculator (No `if` statements)

You are given a starting time and some extra minutes to add. Write a program that calculates the final time on a 24-hour clock.

### Step 1: Start with variables

```java
int nrHours = 3;
int nrMinutes = 23;
int minutesToAdd = 183;
```


---

### Step 2: Find the new hours

---

### Step 3: Find the leftover minutes

---

### Step 4: Print the final time

Finally, show the result as `hours:minutes`.

```java
System.out.println("Final time: " + newHours + ":" + newMinutes);
```

---

### ✅ Example Run

```
Start time: 3:23
Minutes to add: 183
Final time: 6:26
```

---


