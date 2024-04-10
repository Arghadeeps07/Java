public class this_2 {
    private int value;

    // Constructor with one parameter
    public this_2(int value) {
        this.value = value;
    }

    // Constructor with no parameters
    public this_2() {
        // Invoking the constructor with one parameter using 'this'
        this(0); // Calling the other constructor with a default value
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Creating instances of this_2
        this_2 obj1 = new this_2(10);
        this_2 obj2 = new this_2();
        
        // Printing values
        System.out.println("Value of obj1: " + obj1.getValue()); // Output: Value of obj1: 10
        System.out.println("Value of obj2: " + obj2.getValue()); // Output: Value of obj2: 0
    }
}
