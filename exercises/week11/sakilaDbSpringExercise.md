## Sakila Actor app

### Create a new project with spring initializr (really do that)
Maven, Spring Boot 4, Java 21, dependencies: web and mysql + the apache dependency from Maaike's project

### Create the DbConfig class
- Give it a method annotated with @Bean that returns a DataSource.
- Configure the datasource using application.properties and @Value
- It should connect to sakila db

### Create the ActorDao (optional: make an interface and implementation)
- Simplest way: create ActorDao class
- Make it depend on the DataSource (like the example ProductDao)
- Give it three methods:
  - Get all actors
  - Get actor by firstname
  - Get actor by lastname

### Create the ActorController
- Give it three endpoints:
  - /actor
  - /actor/first/{first}
  - /actor/last/{last}

### Done?
- Test your application to make sure it works

