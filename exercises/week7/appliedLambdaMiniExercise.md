## 🧩 1. Integers — Filter even numbers

**Concept:** Boolean-returning lambdas.

**Create interface:**

```java
public interface IntFilter {
    boolean filter(int number);
}
```

**Task:**

1. Create a method in an `App` class called `filterNumbers(IntFilter filter, List<Integer> numbers)` that returns a new list of numbers passing the filter.
2. In the main method, write a lambda that returns `true` if the number is even (`number % 2 == 0`).
3. Test it with a list like `[1,2,3,4,5,6]` and print the result.

**Mini-explanation:**
Just like with `StudentFilter`, this lambda checks each number and returns `true` or `false`.

---

## 🧩 2. Strings — Filter long words

**Concept:** Same pattern, different data type.

**Create interface:**

```java
public interface StringFilter {
    boolean filter(String text);
}
```

**Task:**

1. Create `filterWords(StringFilter filter, List<String> words)` returning all words that pass the test.
2. Write a lambda that returns `true` if the string has more than 5 characters.
3. Test it with `["java", "lambdas", "awesome", "fun"]`.

**Mini-explanation:**
You’re filtering based on word length instead of numbers — same concept, new context.

---

## 🧩 3. Students — Filter by number of courses

**Concept:** Using an object in a lambda.

**Create interface:**

```java
public interface StudentFilter {
    boolean filter(Student student);
}
```

**Task:**

1. Reuse your existing `Student` class with `List<String> courses`.
2. Write a method `filterStudents(StudentFilter filter, List<Student> students)`.
3. Use a lambda that returns `true` if the student has more than 3 courses.
4. Print all students matching.

**Mini-explanation:**
The lambda now works on full objects — you can call getters and make decisions based on them.

---

## 🧩 4. Dogs — Filter by age or breed

**Concept:** Apply same idea to a new class.

**Create class:**

```java
public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getBreed() { return breed; }

    @Override
    public String toString() {
        return name + " (" + breed + ", " + age + " years)";
    }
}
```

**Create interface:**

```java
public interface DogFilter {
    boolean filter(Dog dog);
}
```

**Task:**

1. Create a method `filterDogs(DogFilter filter, List<Dog> dogs)`.
2. Use one lambda to find dogs **older than 5**, and another to find **breed equals "Labrador"**.
3. Print both filtered lists.

**Mini-explanation:**
Same boolean test idea, just applied to another domain object.

---

## 🧩 5. Strings — Convert to uppercase (mapper)

**Concept:** Lambdas that **return transformed data**, not true/false.

**Create interface:**

```java
public interface StringMapper {
    String map(String text);
}
```

**Task:**

1. Write `mapStrings(StringMapper mapper, List<String> words)` that returns a new list of transformed strings.
2. Use a lambda that makes all words uppercase.
3. Test it with `["hello", "world", "java"]`.

**Mini-explanation:**
Instead of filtering, we’re *mapping* — changing each element and returning a new version.

---

## 🧩 6. Dogs — Apply an action (void)

**Concept:** Lambdas for side effects, not returning anything.

**Create interface:**

```java
public interface DogAction {
    void act(Dog dog);
}
```

**Task:**

1. Create `forEachDog(DogAction action, List<Dog> dogs)` that loops over each dog and calls `action.act(dog)`.
2. Pass a lambda that prints `"Good dog, <name>!"` for each one.
3. Pass another lambda that prints `<name> is <age> years old.`

**Mini-explanation:**
This pattern lets you “do something” for every item, similar to what you’d later do with `forEach` in streams.

---