public class this_3 {
    private int value;

    // Constructor with one parameter
    public this_3(int value) {
        this.value = value;
    }

    // Constructor with no parameters
    public this_3() {
        // Passing 'this' as an argument to another constructor
        this(0); // Calling the other constructor with a default value
    }

    // Method to demonstrate passing 'this' as an argument
    public void doSomethingWithObject(this_3 obj) {
        System.out.println("Doing something with object: " + obj.value);
    }

    public static void main(String[] args) {
        this_3 obj = new this_3(10);
        
        // Passing 'this' as an argument to a method
        obj.doSomethingWithObject(obj); // Output: Doing something with object: 10
    }
}

