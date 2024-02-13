// Abstract is just the generalised version of the class by using which many subClass may be created.

abstract class Test{
    void greet(){
        System.out.println("Hello World...");
    }
    abstract void abs();
    abstract void sps();
}
class New extends Test{
    void abs(){
        System.out.println("Hello I am the abstruct inherited methode");
    }
    void sps(){
        System.out.println("Hiii...");
    }
    // We new to define all the methods for the creating a concreate class
}
abstract class New1 extends Test{
    void abs(){
        System.out.println("Hello I am the abstruct inherited methode");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        // Test ob = new Test(); // We cannot make an object of the abstract class
        New obj = new New();
        obj.greet();
        obj.abs();
        obj.sps();
    }
}
