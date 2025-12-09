### Exercise: Spill the Beans!

You are part of a Spring Boot team building a Coffee Shop app. The app needs to handle different types of coffee orders, and each coffee has a specific preparation process. We’ll use Spring Beans to represent different parts of the coffee making process.

### Steps:

1. Set Up the Spring Boot Application:
    - Start a new Spring Boot application with the `Spring Web` dependency.

2. Create CoffeeBeans for Different Orders:
    - Create a `CoffeeBean` class and use the `@Component` annotation for it. Each `CoffeeBean` will represent a basic coffee with a method that returns the type of coffee.
    - Add a method getCoffeeType that returns a String of your favorite type of coffee.

3. Create a `Barista` Bean with Constructor Injection:
    - Create a `Barista` class that depends on `CoffeeBean` and prepares coffee using the `getCoffeeType()` method.
    - The barista prepares the coffee in a prepareCoffee method that returns a string (that uses the getCoffeeType method).
    - Use constructor based dependency injection to inject `CoffeeBean` into `Barista`.

4. Create a Coffee Shop Service with Bean Scopes (this is about the one instance bean for injection or new beans for each injection):
    - Create a `CoffeeShopService` that manages coffee orders. The service should have two methods: one to take an order and one to serve it.
    - Annotate the service with `@Service`. No beans are injected here.
    - Introduce the concept of singleton scope for the `CoffeeShopService` (default scope for beans in Spring).
    - We annotate the class with `@Scope("singleton")`
    - Later, we'll change the scope of `CoffeeShopService` to prototype and explain the difference in behavior (a new instance is created each time).
    - Add this to the service:
   ```java
   private int random = new Random().nextInt(1000);

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }
   ```
5. Create a `CoffeeController`:
    - Create a `CoffeeController` to expose a REST endpoint that simulates ordering coffee and serving it.
    - Inject `Barista` and `CoffeeShopService` into the controller and make it return different responses based on the coffee order.
    - The `/order/{coffeeType}` endpoint will take an order, prepare the coffee, and return the String order status along with the preparation message.
    - The `/serve` endpoint will serve the coffee (return a String).
    - In both endpoints, return the random number of the `CoffeeShopService` in the String the endpoints return.

6. Now we'll do something silly:
    - We are going to copy the CoffeeController to a SecondCoffeeController.
    - This is only to demonstrate how scope works.
    - Give it similar methods, but different endpoints to avoid ambiguity.
    - Call the endpoints of both methods and observe the same random numbers. If you start the app again, new numbers (most likely).
    - Now change `@Scope("prototype")` on the `CoffeeShopService`.
    - Restart the application, call endpoints of both classes and see the difference.

7. Spill the Beans - List All Beans in the Application Context:
    - Modify the `main`method in the `...Application` class to print all beans in the Spring context when the app starts. 