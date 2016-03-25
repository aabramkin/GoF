package nl.abramkin.creational.abstractfactory;

/**
 * Created by aabramkin on 25/03/16.
 */
public class FactoryA implements IFactory {
    public IProduct createButton() {
        return new ProductA();
    }
}
