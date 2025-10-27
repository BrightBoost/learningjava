

## 🛠️ **Your OOP Exercise: Houses & Cars Edition!** 🛠️

### **Step-by-step Instructions (if you're still figuring it out)**

#### ✅ Step 1: Create the `House` class

In your `week2.oop` package, make a new file called `House.java` and write this:

```java
package week2.oop;

public class House {
    static String latinName = "domus";
    String color;
    int numberOfRooms;
    boolean hasGarden;
    double sizeInSquareMeters;

    public void openDoor() {
        System.out.println("Opening the door of a " + color + " house with " + numberOfRooms + " rooms.");
    }
}
```

#### ✅ Step 2: Create the `Car` class

Make another file, `Car.java`:

```java
package week2.oop;

public class Car {
    static String latinName = "autocinetum";
    String brand;
    String color;
    int year;
    boolean isElectric;

    public void startEngine() {
        System.out.println("Starting the " + (isElectric ? "silent electric" : "rumbling") + " engine of the " + color + " " + brand + ".");
    }
}
```

#### ✅ Step 3: Use them in the `App` class

Now go to your `App.java` and write something like this in your `main()` method:

```java
package week2.oop;

public class App {
    public static void main(String[] args) {
        System.out.println(House.latinName);
        System.out.println(Car.latinName);

        House myHouse = new House();
        myHouse.color = "blue";
        myHouse.numberOfRooms = 5;
        myHouse.hasGarden = true;
        myHouse.sizeInSquareMeters = 120.5;

        House hauntedHouse = new House();
        hauntedHouse.color = "dark purple";
        hauntedHouse.numberOfRooms = 13;
        hauntedHouse.hasGarden = false;
        hauntedHouse.sizeInSquareMeters = 666.6;

        Car tesla = new Car();
        tesla.brand = "Tesla";
        tesla.color = "white";
        tesla.year = 2021;
        tesla.isElectric = true;

        Car oldBeetle = new Car();
        oldBeetle.brand = "Volkswagen Beetle";
        oldBeetle.color = "red";
        oldBeetle.year = 1969;
        oldBeetle.isElectric = false;

        myHouse.openDoor();
        hauntedHouse.openDoor();
        tesla.startEngine();
        oldBeetle.startEngine();

        // Optional: explore references
        Car anotherTesla = tesla;
        anotherTesla.color = "matte black";

        System.out.println("Tesla's new color? " + tesla.color);
    }
}
```

---



