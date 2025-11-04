### 1) Box<T>

**Build:** Class `Box<T>` with: a private `T value`, constructor, `get()` that returns what's in the box.
**Try:**

```java
Box<Integer> a = new Box<>(42);
Box<String> b = new Box<>("hi");
System.out.println(a.get()); // 42
System.out.println(b.get()); // hi
```

### 2) Holder<T> with setter

**Build:** `Holder<T>` with `T value`, constructor, `get()`, `set(T v)`.
**Try:**

```java
Holder<Double> h1 = new Holder<>(3.14);
Holder<Character> h2 = new Holder<>('Z');
h1.set(2.71);
System.out.println(h1.get()); // 2.71
System.out.println(h2.get()); // Z
```

### 3) Labelled<T>

**Build:** `Labelled<T>` with fields `String label` and `T value`. `toString()` returns `"label=value"`.
**Try:**

```java
Labelled<String> l1 = new Labelled<>("name", "Maaike");
Labelled<Integer> l2 = new Labelled<>("age", 29);
System.out.println(l1); // name=Maaike
System.out.println(l2); // age=29
```

### 4) Wrapper<T> with equalsByValue

**Build:** `Wrapper<T>` with `T value` and method `boolean equalsByValue(Wrapper<T> other)` that uses `Objects.equals(value, other.value)`.
**Try:**

```java
Wrapper<String> w1 = new Wrapper<>("cat");
Wrapper<String> w2 = new Wrapper<>("cat");
System.out.println(w1.equalsByValue(w2)); // true
Wrapper<Integer> w3 = new Wrapper<>(1);
Wrapper<Integer> w4 = new Wrapper<>(2);
System.out.println(w3.equalsByValue(w4)); // false
```

### 5) Printer<T>

**Build:** `Printer<T>` with method `void print(T x)` that just `System.out.println(x)`.
**Try:**

```java
Printer<String> ps = new Printer<>();
Printer<Boolean> pb = new Printer<>();
ps.print("Hi");
pb.print(true);
```

### 6) OptionalLite<T>

**Build:** `OptionalLite<T>` with `private T value;`

* `static <T> OptionalLite<T> of(T v)`
* `static <T> OptionalLite<T> empty()` (store `null`)
* `boolean isPresent()`
* `T get()` (just return `value`)
  **Try:**

```java
OptionalLite<String> o1 = OptionalLite.of("x");
OptionalLite<String> o2 = OptionalLite.empty();
System.out.println(o1.isPresent()); // true
System.out.println(o2.isPresent()); // false
```

### 7) PairStringify<T>

**Build:** `PairStringify<T>` with `String stringify(T a, T b)` returning `a + "," + b`.
**Try:**

```java
PairStringify<Integer> p1 = new PairStringify<>();
PairStringify<String>  p2 = new PairStringify<>();
System.out.println(p1.stringify(1, 2));     // 1,2
System.out.println(p2.stringify("a","b"));  // a,b
```

### 8) StoreOnce<T>

**Build:** `StoreOnce<T>` with `void put(T v)` that can be called **once** (ignore extra puts), and `T get()`. Keep logic tiny: if `stored` is `null`, set; else ignore.
**Try:**

```java
StoreOnce<String> s1 = new StoreOnce<>();
StoreOnce<Integer> s2 = new StoreOnce<>();
s1.put("first"); s1.put("second");
System.out.println(s1.get()); // first
s2.put(10);
System.out.println(s2.get()); // 10
```
---

## Level up: two type parameters

### 9) Pair<K,V>

**Build:** Immutable `Pair<K,V>` with fields, constructor, `K key()`, `V value()`, and `toString()` like `(key=value)`.
**Try:**

```java
Pair<String,Integer> p1 = new Pair<>("age", 30);
Pair<Integer,String> p2 = new Pair<>(1, "one");
System.out.println(p1); // (age=30)
System.out.println(p2); // (1=one)
```

### 10) BiHolder<A,B> with swap()

**Build:** `BiHolder<A,B>` with `A first; B second;` + `swap()` that returns a **new** `BiHolder<B,A>` with fields swapped.
**Try:**

```java
BiHolder<String,Boolean> bh = new BiHolder<>("ok", true);
BiHolder<Boolean,String> swapped = bh.swap();
System.out.println(swapped.getFirst()); // true
System.out.println(swapped.getSecond()); // ok
```

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

### 12) BiLabelled<K,V>

**Build:** `BiLabelled<K,V>` with fields `String leftLabel`, `K left`, `String rightLabel`, `V right`.
Add `String describe()` => `"leftLabel=left, rightLabel=right"`.
**Try:**

```java
BiLabelled<String,Integer> bl = new BiLabelled<>("name","Zia","age",3);
System.out.println(bl.describe()); // name=Zia, age=3
BiLabelled<Integer,String> bl2 = new BiLabelled<>("id",101,"tag","cat");
System.out.println(bl2.describe());
```

### 13) Result<T,E> (success or error)

**Build:** Sealed-feeling lite version (no sealed keyword needed):

* Interface `Result<T,E>`
* Class `Ok<T,E>` holds `T value`
* Class `Err<T,E>` holds `E error`
  Add helpers:
  `static <T,E> Result<T,E> ok(T v)` and `static <T,E> Result<T,E> err(E e)` in a `Results` factory.
  **Try:**

```java
Result<Integer,String> r1 = Results.ok(200);
Result<Integer,String> r2 = Results.err("Not found");
System.out.println(r1 instanceof Ok);  // true
System.out.println(r2 instanceof Err); // true
```

---