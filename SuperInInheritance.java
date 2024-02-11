class Parent{
    Parent(){
        System.out.println("Hello, I am non parameterised contructor from the parent class");
    }
    Parent(int x){
        System.out.println("Hello, I am  parameterised contructor from the parent class");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("I am child class constructor");
    }
    Child(int x, int y){
        super(x); // Whene this child class constructor be called, then it will call the paramiterised constructor of the parent class
        // Is used to reffer the immidiate the imidiate patent class obj
        // Basically a reference of the obj
        System.out.println("I am child class constructor");
    }

}
public class SuperInInheritance {
    public static void main(String[] args) {
        Child obj = new Child(4, 5);
        
    }
}
