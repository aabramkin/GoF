package nl.abramkin.structural.facade;

/**
 * Created by aabramkin on 28/03/16.
 */
public class Main {
    public static void main(String[] argv) {
        Facade facade = new Facade();
        facade.doSomethingForProductA();
        facade.doSomethingForProductB();
        facade.doSomethingForProductC();
    }
}
