package nl.abramkin.creational.factorymethod;

/**
 * Created by aabramkin on 28/03/16.
 */
public class Main {
    public static void main(String[] args){
        AbstractCreator creator = new ProductCreator();
        creator.doSomethingWithProduct();
    }
}
