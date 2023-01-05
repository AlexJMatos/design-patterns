package strategy;

/**
 * The Strategy Pattern defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently of
 * clients that use it.
 */
public interface QuackBehavior {
    void quack();
}
