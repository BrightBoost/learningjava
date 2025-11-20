## ⚽ Soccer Tournament OOP Project

Let’s build your very own **Soccer Tournament Simulator**! In this project, you’ll create the classes and logic needed to model and play a knockout tournament with 8 teams, 3 rounds, and a final winner.

We’ll break it down into small, achievable steps. By the end, you’ll have a working tournament that plays itself and prints who’s up against who—and who wins each round.

---

### **STEP 1: Design the Object-Oriented Structure (OOP Basics)**

Start by thinking in objects. You’ll need to define the right classes and their relationships.

🧱 Create the following classes:

#### 1. `Player`

* Properties: `name`, `position`, `number`
* Constructor to initialize all fields
* Getters and setters

#### 2. `Team`

* Properties: `name`, `List<Player> players`
* Constructor to set name and initialize the list
* Methods to add players
* Getters

#### 3. `Match`

* Properties: `Team team1`, `Team team2`, `Team winner`
* Constructor that takes the two teams
* A method you’ll later implement to “play” the match

#### 4. `Round`

* Properties: `List<Match> matches`
* Constructor to initialize the list
* A method you’ll later implement to play all matches in the round

#### 5. `Tournament`

* Properties: `String name`, `List<Team> teams`, `List<Round> rounds`, `Team winner`
* Constructor to set the name and initialize the team list and round list
* A method to start and play the tournament

🌟 **Nice work!** You've just built a solid OOP structure. These objects "have" other objects—like a Team *has* Players and a Round *has* Matches. That's composition in action!

---

### **STEP 2: Add Match Logic**

Now let’s make the matches actually do something!

👟 In the `Match` class:

* Write a `play()` method.
* Inside that method, randomly select one of the two teams as the winner.
* Set the `winner` property.
* Print out:
  `"Match: <team1 name> vs <team2 name> — Winner: <winner name>"`

This is a simple version—we’re not tracking goals or stats yet. Just who wins and moves on.

👍 **Well done!** You’re giving behavior to your classes now!

---

### **STEP 3: Add Round Logic**

Next, let’s play a whole round.

🌀 In the `Round` class:

* Write a `playRound()` method.
* Loop through the list of matches and call `play()` on each one.
* Collect the winning teams into a new list and return that list.

🖨️ Also print a line before the round starts:
`"=== Starting Round ==="`

And after all matches are done:
`"=== Round complete ==="`

You’ve now got one full round of matches that plays automatically!

---

### **STEP 4: Create and Kick Off the Tournament**

It’s time to tie everything together.

🎉 In the `Tournament` class:

* Write a method `startTournament()` that:

  * Creates the first round with 4 matches using your 8 teams.
  * Plays the round.
  * Takes the 4 winners and creates the second round with 2 matches.
  * Plays the second round.
  * Takes those 2 winners, creates the final match, and plays it.
  * Sets the tournament winner based on the final match.
  * Prints out:
    `"🏆 The winner of the tournament is: <winner name>!"`

🧠 You'll need to manually create the matches for each round by pairing up teams two by two from the list of winners. 

---

### **STEP 5: Bring It to Life in Your Main Method**

In your `Main` class:

* Create 8 `Team` objects with a few `Player` objects each.
* Add all teams to a `Tournament` object.
* Call `startTournament()` and enjoy the show!

💪 You've just built a real-world application with objects working together!

---

### 💡 Tips & Encouragement

* Take it one step at a time. It’s totally okay to write just one class per day.
* Print a lot. Seeing what your code is doing helps you understand it better.
* If something breaks, don’t panic! That means you’re learning.
* If you finish early, you can make it fancier by tracking goals, adding stats, or letting the user input team names, or even determine what player scored on a team to get to an end score and come up with fancy end scores like 2-1 instead of team 1 wins.


