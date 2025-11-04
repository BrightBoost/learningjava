package com.pluralsight.week7;
/*
### 11) Mapper<I,O>

**Build:** Interface `Mapper<I,O>` with method `O map(I input)`.
Make a class `ToLength implements Mapper<String,Integer>` and another `ToString implements Mapper<Double,String>`.
**Try:**

```java
Mapper<String,Integer> m1 = new ToLength();
Mapper<Double,String>  m2 = new ToString();
System.out.println(m1.map("hello")); // 5
System.out.println(m2.map(3.14));    // "3.14"
```
 */

@FunctionalInterface
public interface Mapper<I, O> {
    O map(I input);
}
