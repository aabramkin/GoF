package nl.abramkin.creational.abstractfactory;

/**
 * Created by aabramkin on 25/03/16.
 */
public class ProductB implements IProduct {
    public void doSomething() {
        System.out.println("Do " + getClass());
    }
}
