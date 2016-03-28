package nl.abramkin.structural.facade;

/**
 * Created by aabramkin on 28/03/16.
 */
public class Facade {
    private final IProduct productA;
    private final IProduct productB;
    private final IProduct productC;

    public Facade() {
        productA = new ProductA();
        productB = new ProductB();
        productC = new ProductC();
    }

    public void doSomethingForProductA(){
        productA.doSomething();
    }

    public void doSomethingForProductB(){
        productB.doSomething();
    }

    public void doSomethingForProductC(){
        productC.doSomething();
    }
}
