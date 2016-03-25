package nl.abramkin.creational.abstractfactory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by aabramkin on 25/03/16.
 */
public class Main {
    public static void main(String[] args) {
        String type = "B";
        IFactory factory;
        switch (type) {
            case "A" :
                factory = new FactoryA();
                break;
            case "B" :
                factory = new FactoryB();
                break;
            default :
                throw new NotImplementedException();
        }
        factory.createButton().doSomething();
    }
}
