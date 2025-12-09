### Exercise: Understanding Spring Beans with @Component and @Bean

1. Create a Spring Boot Application:
    - Set up a new Spring Boot project using [Spring Initializr](https://start.spring.io/).
    - Include `Spring Web` as the dependency.

2. Create a `GreetingService` Bean using `@Component`:
    - Create a class `GreetingService` and annotate it with `@Component` to make it a Spring-managed bean.
    - Give it a method `getGreeting` that returns a String with a greeting.

3. Create a `MessageService` class.
    - Give it a method `getMessage` that returns a String with a message.
    - Create a `MessageService` bean using the `@Bean` annotation inside a new configuration class `AppConfig` that is annotated with `@Configuration`.

4. Create a REST Controller to get the Strings:
    - Create a `BeanController` class that uses `GreetingService` and `MessageService`.
    - They have to be injected via the controller.
    - Create two endpoints: one returns the String from `getGreeting`, the other returns the String from `getMessage`.
        - The `/greeting` endpoint will return the message from `GreetingService`.
        - The `/message` endpoint will return the message from `MessageService`.

5. Print the beans in the Application Context:
    - Modify the main application class to print all the beans in the Spring context at startup.