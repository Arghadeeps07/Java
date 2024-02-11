// It is basically overidding of a methode of the inheritted parent class
class Parent {
    void print() {
        System.out.println("Hello world...");
    }

    void greet() {
        System.out.println("hii...");
    }
}

class Child extends Parent {
    @Override
    void greet() {
        System.out.println("i am overrided");
    }
}

public class MethodeOverriding {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.print();
        obj.greet();
    }
}
