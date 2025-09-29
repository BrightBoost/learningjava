# 🎯 Exercise: Grade → Message with `switch`

## Goal

Write a Java program that asks for a letter grade (from **F** up to **A+**) and prints a tailored message using a **switch** on the grade.

---

## Step-by-step instructions (no code shown)

1. **Create a new Java file** named `GradeMessage.java` and add a `main` method.
2. **Decide how to provide the grade input**:

    * Option A: temporarily hard-code a test value (e.g., `"B+"`) to get the logic right.
    * Option B: read one line from the console (preferred once logic works).
3. **Store the input in a `String` variable** called `grade`.
4. **Normalize the input**:

    * Remove leading/trailing spaces.
    * Convert to uppercase.
5. **Validate format (lightweight)**:

    * Accept only these exact tokens:
      `F, D-, D, D+, C-, C, C+, B-, B, B+, A-, A, A+`.
      (Everything else is “invalid input.”)
6. **Create a `switch` that switches on the `grade` string.**
   You will have **13 distinct cases**: one for each accepted token above, plus a `default` for invalid input.
7. **For each case, prepare a specific message** (feel free to tweak wording):

    * `A+`: “Outstanding! You aced it.”
    * `A`: “Excellent work.”
    * `A-`: “Great job—almost perfect.”
    * `B+`: “Very good—keep it up.”
    * `B`: “Good work.”
    * `B-`: “Solid effort; aim a little higher.”
    * `C+`: “Decent—keep practicing.”
    * `C`: “Satisfactory.”
    * `C-`: “Barely satisfactory—review key topics.”
    * `D+`: “Below average; study more.”
    * `D`: “Needs improvement.”
    * `D-`: “Significantly below expectations.”
    * `F`: “Fail—make a recovery plan and get help.”
8. **Ensure each case handles only its grade** and then **stops** (i.e., do not accidentally “fall through” to the next case).
9. **In the `default` case**, print something like:
   “Invalid grade. Use F, D-/D/D+, C-/C/C+, B-/B/B+, A-/A/A+.”
10. **Format the final output** as:
    `Grade: <GRADE> → <MESSAGE>`
11. **Test thoroughly** by trying at least these inputs (including mixed casing and spaces to verify normalization):
    `f`, ` D+`, `c-`, `B+`, `A`, `A+`, `hello`
12. **(Optional polish)**: after printing the message, also print a short tip based on the band (e.g., any grade below C prints a study tip).
