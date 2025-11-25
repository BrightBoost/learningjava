## Group Git Exercise: “Once Upon a Git Conflict…”

### Learning goals

By the end of this exercise, you will be able to:

* Create and share a GitHub repo in a small group
* Work with branches and pull requests
* **Cause** and **solve** merge conflicts (on purpose)
* Communicate changes with your team

---

## 0. Prerequisites

Each student:

* Has a GitHub account and Git installed
* Knows basic Git commands: `clone`, `status`, `add`, `commit`, `push`
* Is in a group of **2–3 people**

---

## 1. Form your group & choose a theme

1. Get into groups of **2–3 students**.
2. Choose a story theme (examples):

    * “Things we learned in this program”
    * “Fun moments during the bootcamp”
    * “Our future as developers”
    * “That One Bug”

You’ll co-write **one story** together in a file called `story.md`.

---

## 2. Create the shared GitHub repo

### 2.1 Owner: create repo

One person in the group is the **Repo Owner**.

1. Go to GitHub → **New repository**
2. Name it: `cohort-story-<groupname>`
   Example: `cohort-story-debug-ducks`
3. Make it **Public**.
4. Tick **“Add a README file”**.
5. Click **Create repository**.

### 2.2 Owner: add collaborators

1. In the repo on GitHub, go to: **Settings → Collaborators (or Manage access)**.
2. Click **Add people**.
3. Add the GitHub usernames of your group members.
4. Tell them to check their email / GitHub notifications and **accept the invitation**.

### 2.3 Everyone: clone the repo

Once everyone has accepted, open a terminal in your Yearup folder.

```bash
git clone <repo-url>
cd cohort-story-<groupname>
```

Check everything is fine:

```bash
git status
```

---

## 3. Prepare the story file

We want a **single shared file** that will cause conflicts later.

### 3.1 Owner: create `story.md` template

In your local repo, create `story.md` with the chapter content, for example like this:

```markdown
# Our Cohort Story

## Chapter 1 – How It Started
(Write 1–2 paragraphs about how you felt before starting the program.)

## Chapter 2 – What We’ve Learned So Far
(Write 1–3 bullet points each about things you learned.)

## Chapter 3 – Fun / Painful Moments
(Each person describes one memorable moment.)

## Chapter 4 – Where We’re Going
(Each person writes a short paragraph about their aspirations.)
```

Then:

```bash
git add story.md
git commit -m "Add story template"
git push origin main
```

Everyone else:

```bash
git pull origin main
```

Now everyone should see `story.md`.

---

## 4. Part 1 – “Happy” collaboration (no conflicts yet)

Goal: basic branching & PRs without pain.

Each student will work on **different parts** of the story.

### 4.1 Create your own feature branch

Each person:

```bash
git checkout -b feature-<yourname>-ch<nr>
```

Examples: `feature-maaike-ch1`, `feature-ali-ch2`.

### 4.2 Edit different sections

* Student A: fill in **Chapter 1 – How It Started** (their perspective).
* Student B: add 2–3 bullet points under **Chapter 2**.
* Student C (if present): add their moment to **Chapter 3**.

Make sure you all work in **different parts** so there’s no conflict yet.

Then each person:

```bash
git status
git add story.md
git commit -m "Add <yourname>'s contribution to chapter 1/2/3"
git push origin feature-<yourname>-ch<nr>
```

### 4.3 Create & merge Pull Requests

On GitHub:

1. Each student goes to the repo → **Compare & pull request** for their branch.
2. Give the PR a nice title:

    * “Add Maaike’s chapter 1”
    * “Add Ali’s learning bullet points”
3. At least one teammate reviews and **approves**.
4. Click **Merge pull request** → **Confirm merge**.
5. Delete the branch on GitHub (optional but good practice).

Then everyone:

```bash
git checkout main
git pull origin main
```

You should see a nicely updated `story.md` containing all contributions.

You’ve now done basic collaboration: branches + PRs + merges.

---

## 5. Part 2 – Deliberately causing merge conflicts

Now the fun part: **BREAK IT ON PURPOSE** so you can fix it.

We’ll force you to edit the **same lines** in different branches.

### 5.1 Agree on the conflict zone

As a group, pick **one specific section** to fight over. For example:

```markdown
## Chapter 3 – Fun / Painful Moments
(Each person describes one memorable moment.)
```

You will all change **the SAME placeholder line**:

> (Each person describes one memorable moment.)

into different text.

### 5.2 Everyone creates a new branch from up-to-date `main`

Everyone:

```bash
git checkout main
git pull origin main
git checkout -b conflict-<yourname>-chapter3
```

Examples: `conflict-maaike-ch3`, `conflict-ali-ch3`.

### 5.3 Everyone makes conflicting edits

Each person **replaces the placeholder line** under Chapter 3 with their own sentence.

Example:

* Samira writes:
  `Samira: The day the test suite finally passed and we all screamed in Slack.`
* Ali writes:
  `Ali: When I deleted the database in production (almost) and learned about backups the hard way.`

**Important:**
Everyone must edit **exactly that same line**, not different places.

Then each person:

```bash
git add story.md
git commit -m "Add <yourname>'s conflicting version of chapter 3"
git push origin conflict-<yourname>-chapter3
```

### 5.4 First PR merges fine

Pick **one person** (e.g. Student A) whose PR will be merged first.

On GitHub:

1. Student A opens a PR from their `conflict-...` branch to `main`.
2. Someone reviews → **Merge pull request**.
3. Delete branch if you want.

Now `main` contains Student A’s version of that line.

Everyone else:

```bash
git checkout main
git pull origin main
```

(They already pushed their conflicting changes earlier — this is important.)

### 5.5 Second PR: see the merge conflict (GitHub UI)

Now Student B (and C if present) **does not pull again**, but directly:

1. Opens a **Pull Request** from `conflict-<name>-chapter3` into `main`.
2. GitHub will say: **“This branch has conflicts that must be resolved.”**

Click **“Resolve conflicts”**.

You should see something like this in the GitHub editor:

```text
<<<<<<< conflict-ali-ch3
Ali: When I deleted the database in production (almost) and learned about backups the hard way.
=======
Samira: The day the test suite finally passed and we all screamed in Slack.
>>>>>>> main
```

### 5.6 Resolve the conflict in GitHub

As a group, decide how the final text should look. For example, keep **both** lines:

```markdown
## Chapter 3 – Fun / Painful Moments

Samira: The day the test suite finally passed and we all screamed in Slack.  
Ali: When I deleted the database in production (almost) and learned about backups the hard way.
```

In the GitHub conflict editor:

1. **Delete** all the conflict markers:
   `<<<<<<<`, `=======`, `>>>>>>>`
2. Edit the text until it looks good.
3. Click **Mark as resolved**.
4. Click **Commit merge**.
5. Then click **Merge pull request**.

Everyone:

```bash
git checkout main
git pull origin main
```

Now everyone has the conflict-free, final version.

---

## 6. (Optional) Conflict resolution in the command line

If you have time and want a bit more pain 😈:

1. Create a **new** conflict the same way (new branches, same line).

2. This time, try resolving it **locally**:

    * When you do `git pull origin main`, Git will stop and mark the file as conflicted.
    * Open `story.md` in your editor, look for `<<<<<<<`, fix it manually, then:

   ```bash
   git add story.md
   git commit -m "Resolve merge conflict in story"
   git push origin <your-branch-name>
   ```

3. Then merge via PR again.

---

## 7. Short reflection (do this as a group)

Answer these questions (write them in a file `reflection.md` or discuss with your instructor):

1. What **caused** the merge conflict, in your own words?
2. What did the conflict markers `<<<<<<<`, `=======`, `>>>>>>>` mean?
3. What did you find **hard or confusing** about resolving the conflict?
4. What naming conventions for branches/commits/pull requests would help a team?
5. How could you **avoid** painful conflicts in a real project (practices, habits)?

