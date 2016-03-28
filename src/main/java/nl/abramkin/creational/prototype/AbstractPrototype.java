package nl.abramkin.creational.prototype;

/**
 * Created by aabramkin on 28/03/16.
 */
public abstract class AbstractPrototype implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
