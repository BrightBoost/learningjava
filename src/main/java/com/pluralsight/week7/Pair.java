package com.pluralsight.week7;

/*
### 9) Pair<K,V>

**Build:** Immutable `Pair<K,V>` with fields, constructor, `K key()`, `V value()`, and `toString()` like `(key=value)`.
```
 */
public class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K key() {
        return key;
    }

    public V value() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("(%s=%s)", key.toString(), value.toString());
    }
}
