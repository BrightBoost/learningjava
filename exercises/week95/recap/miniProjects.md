## 🧠 **Assignment 1: Daily Mood Logger**

### 📋 **Objective**  
Create a small app where the user can log how they feel today. Each mood will be saved with today’s date in a file. The app should allow the user to add a new mood and read back the past moods.

### ✅ **Requirements**
- Ask the user: “How are you feeling today?”
- Use `LocalDate` to record the date of the entry
- Save each entry to a file in the format:  
  `2025-04-23: Happy`
- When the user chooses, show all previous mood entries

### 💡 **Hints**
- Use `Scanner` to read input
- Use `FileWriter` to save, and `BufferedReader` to read
- Use a loop to let the user choose between:
  - [1] Log a new mood
  - [2] View past moods
  - [3] Exit

---

## 🧠 **Assignment 2: Flashcard Quiz App**

### 📋 **Objective**  
Build a flashcard quiz game. The app shows a simple question, waits for the user to answer, and tells them if they were correct. After a few rounds, show how many they got right.

### ✅ **Requirements**
- Store a few questions and correct answers (e.g. 5)
- Loop through the questions one by one
- Use `Scanner` to collect answers
- Show correct/incorrect immediately
- After all questions, show:
  - Total questions
  - Number correct
  - Percentage

### 💡 **Hints**
- Use two `String[]`, one for questions and one for answers. Make the indices match for answer and question.
- You can hard-code both arrays at the start
- Consider `.equalsIgnoreCase()` for comparing answers
- Want to go fancy? Instead of two `String[]` you can create a class `Flashcard` that holds the question and the answer and work with a `Flashcard[]` instead.

---

## 🧠 **Assignment 3: Random Quote Generator**

### 📋 **Objective**  
Make a simple program that shows a random quote every time the user presses Enter.

### ✅ **Requirements**
- Store at least 10 quotes in a `String[]`
- When the program starts, prompt the user:
  > Press Enter to see a quote, or type "exit" to stop
- Use a random index to pick a quote each time
- Repeat until the user types "exit"

### 💡 **Hints**
- Use `Random.nextInt(array.length)` to pick a random quote
- Use a `while` loop to repeat
- Don’t forget to import `java.util.Random`

---

## 🧠 **Assignment 4: Random Quote Generator with File Support**

### 📋 **Objective**  
Build a Random Quote Generator that:
- Loads quotes from a file
- Shows a random quote on demand
- Lets the user view all quotes
- Lets the user add new quotes to the file

This project adds file handling and more interaction options to the original version of assignment 3.

---

### ✅ **Requirements**

1. **Start by loading all quotes from a file**
   - File name: `quotes.txt`
   - Each line in the file is one quote

2. **Show the user a menu**:
   ```
   What would you like to do?
   [1] Show all quotes
   [2] Show a random quote
   [3] Add a new quote
   [4] Exit
   ```

3. **If the user chooses 1**:
   - Print all quotes in the file (one per line)

4. **If the user chooses 2**:
   - Pick and print one random quote

5. **If the user chooses 3**:
   - Ask them to type a new quote
   - Append it to the file (`quotes.txt`)
   - (Optional: Show a confirmation message)

6. **If the user chooses 4**:
   - Exit the program

---

### 💡 **Hints**
- Use `BufferedReader` to read all quotes into a `List<String>`
- Use `Random` to pick a random index
- Use `FileWriter` with `append = true` to add a new quote
- Use `Scanner` for all user input
- Use a loop so the menu repeats until the user chooses to exit

---

### ✍️ **Example `quotes.txt` file:**

```
Be yourself; everyone else is already taken.
The best way to get started is to quit talking and begin doing.
Do what you can, with what you have, where you are.
```

