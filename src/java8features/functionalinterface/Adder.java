package java8features.functionalinterface;

@FunctionalInterface
public interface Adder<T> {
    T add(T val,T val2);
}
