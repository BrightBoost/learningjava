package com.pluralsight.week7;
/*
### 10) BiHolder<A,B> with swap()

**Build:** `BiHolder<A,B>` with `A first; B second;` + `swap()` that returns a **new** `BiHolder<B,A>` with fields swapped.

 */
public class BiHolder<A, B> {
    private A first;
    private B second;

    public BiHolder(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    // return type:BiHolder<B, A>
    // method name:swap
    // no params
    public BiHolder<B, A> swap() {
        return new BiHolder<>(second, first);
    }
}
