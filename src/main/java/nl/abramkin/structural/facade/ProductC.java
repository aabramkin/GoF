package nl.abramkin.structural.facade;

/**
 * Created by aabramkin on 28/03/16.
 */
public class ProductC implements IProduct{
    @Override
    public void doSomething() {
        System.out.println(getClass());
    }
}
