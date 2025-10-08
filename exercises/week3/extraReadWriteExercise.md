# 📚 Mini-Lab: Video Games CSV with BufferedReader & BufferedWriter

**You’ll practice:** reading text files line-by-line, parsing simple CSV, storing objects, and (bonus) appending to a file.

---

## 0) Setup

1. Create a new Java project (any name you like). (Or make a new package in your existing project.)
2. Make a folder called `data` in your project’s root.
3. Create a file `data/videogames.csv` and paste the dataset below:

```
title,platform,genre,year,rating
The Legend of Zelda: Breath of the Wild,Switch,Adventure,2017,9.8
God of War,PS4,Action,2018,9.6
Stardew Valley,PC,Simulation,2016,9.0
Minecraft,PC,Sandbox,2011,9.3
Animal Crossing: New Horizons,Switch,Simulation,2020,9.1
Hades,PC,Roguelike,2020,9.2
Super Mario Odyssey,Switch,Platformer,2017,9.4
The Witcher 3: Wild Hunt,PC,RPG,2015,9.7
```

---

## 1) Create your class: `VideoGame`

Create a class that represents one row from the CSV.

* Fields:
    * `title` (text)
    * `platform` (text)
    * `genre` (text)
    * `year` (whole number)
    * `rating` (decimal number)
* Add:
    * A constructor that sets all fields
    * Getters for each field
    * A method that can turn the object back into a CSV row in the **same column order** as the header (toCsvString in Employee class Maaike's example)

> **Done when:** You can create a `VideoGame` in code.

---

## 2) Read the CSV with `BufferedReader`

1. Open `videogames.csv` for reading using a `BufferedReader` (wrapped around a file reader or NIO helper).
2. Read and **skip the first line** (it’s the header).
3. For each following line:
    * Ignore empty lines.
    * Split by comma into 5 parts.
    * Trim spaces if needed.
    * Convert `year` to an integer and `rating` to a double.
    * Create a `VideoGame` with these values and add it to a list.
4. If a line doesn’t have exactly 5 parts, print a warning and skip it.

> **Done when:** Your list contains 8 games from the file.

---

## 3) Print simple insights

From your list of games, print:
* The total number of games loaded
* The average rating (rounded to 2 decimals is fine)
* The oldest release year
* The number of **PC** titles

> **Done when:** You see clear, readable output with all stats.

---

## 4) Bonus A — Append a new game with `BufferedWriter` (look into creating a FileWriter with second param `true`)

1. Create a new `VideoGame` in code (your choice of game).
2. Open `videogames.csv` for **appending** using `BufferedWriter`.
3. Write a newline and then the game as a CSV row (use your helper from step 1).
4. Re-run your reader to confirm the file now has one more row.

> **Done when:** The CSV file has grown by exactly one line and your program reads the new total.

---

## 5) Bonus B — Let the user add a game (console)

1. Prompt the user in the console for: title, platform, genre, year, rating.
2. Create a `VideoGame` from that input.
3. Append it to the CSV (same as Bonus A).
4. Show a friendly confirmation message.

> **Done when:** You can type a game in the console, and it appears in the CSV.

---

## 6) Stretch goals (for fast finishers)

* Create a new CSV with **only Switch** games.
* Sort games by rating (highest first) and print the **top 3**.
* Print a count per platform (e.g., PC: 4, Switch: 3, PS4: 1).
* Validate inputs (e.g., rating between 0 and 10) and reprompt on mistakes.

