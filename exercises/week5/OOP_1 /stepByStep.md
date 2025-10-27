
#### **Step-by-step Instructions (if you want help along the way)**

##### ✅ Step 1: Create your Cat class
In the same folder/package as your `Chair`, create a new file:

```java
package week2.oop;

public class Cat {
    static String latinName = "Felis catus";
    String name;
    String color;
    int age;
    boolean isFluffy;

    public void meow() {
        System.out.println(name + " says: Meow! (in a " + color + " coat)");
    }
}
```

##### ✅ Step 2: Create your Dog class
Just like `Cat`, create a `Dog` class:

```java
package week2.oop;

public class Dog {
    static String latinName = "Canis lupus familiaris";
    String name;
    String breed;
    int age;
    boolean isGoodBoy;

    public void bark() {
        System.out.println(name + " says: Woof! (Breed: " + breed + ")");
    }
}
```

##### ✅ Step 3: Time to play in the `App` class!

Go back to your `App` class and create some animals. For example:

```java
public class App {
    public static void main(String[] args) {
        System.out.println(Cat.latinName);
        System.out.println(Dog.latinName);

        Cat zia = new Cat();
        zia.name = "Zia";
        zia.color = "white";
        zia.age = 2;
        zia.isFluffy = true;

        Dog wiesje = new Dog();
        wiesje.name = "Wiesje";
        wiesje.breed = "Dachshund";
        wiesje.age = 4;
        wiesje.isGoodBoy = false;

        zia.meow();
        wiesje.bark();

        // optional: show how objects are references
        Cat anotherZia = zia;
        anotherZia.color = "gray";
        System.out.println("Zia's new color? " + zia.color);
    }
}
```

---

### 💡 Pro tips:
- Be creative with the values you assign.
- Try out different numbers of objects.
- Use `System.out.println` to explore what your animals know and can do.
- Don’t worry if something doesn’t work right away. That’s how programmers learn!

---



