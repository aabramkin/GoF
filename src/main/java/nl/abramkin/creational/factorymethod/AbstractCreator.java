package nl.abramkin.creational.factorymethod;

/**
 * Created by aabramkin on 28/03/16.
 */
public abstract class AbstractCreator {
    protected abstract IProduct produce();

    public void doSomethingWithProduct() {
        System.out.println("Do " + produce());
    }
}
