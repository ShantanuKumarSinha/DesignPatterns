package design.pattern.creational.prototype;

public interface Prototype<T> {
    /**
     * Creates a copy of the current object.
     *
     * @return a new instance of the object that is a copy of the current object
     */
    T copy();
}
