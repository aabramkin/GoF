package nl.abramkin.creational.factorymethod;

/**
 * Created by aabramkin on 28/03/16.
 */
public class ProductCreator extends AbstractCreator {
    @Override
    public IProduct produce() {
        return new ConcreteProduct();
    }
}
