class Base{
    void print(){
        System.out.println("hello I am base");
    }
}
class Child extends Base{
    void printDetails(){
        System.out.println("Hello I ama child");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Child Ankan = new Child();
        Ankan.print();
        Ankan.printDetails();
    }
}
