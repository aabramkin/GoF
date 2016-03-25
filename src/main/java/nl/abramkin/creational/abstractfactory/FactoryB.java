package nl.abramkin.creational.abstractfactory;

/**
 * Created by aabramkin on 25/03/16.
 */
public class FactoryB implements IFactory {
    public IProduct createButton() {
        return new ProductB();
    }
}
