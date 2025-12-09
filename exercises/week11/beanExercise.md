## Create a new Spring Boot application 
- Same configuration as yesterday, but no dependencies
- (Maven, Java 21 or higher and spring boot 4)

## Create 3 classes
- GreenBean --> annotate with @Component
- MagicBean --> annotate with @Component
- BeanConfig --> annotate with @Configuration

## In the main method, print all the beans:
```java
public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(DemoApplication.class, args);
        for(String beanName : ac.getBeanDefinitionNames()) {
            System.out.println("Bean: " + beanName);
        }
	}
```

## Create a class Spell with a property description

## Give your MagicBean a constructor that accepts an object of type Spell

## Give your MagicBean a method that prints the spell description

## Run the application again and solve the errors that will now occur.