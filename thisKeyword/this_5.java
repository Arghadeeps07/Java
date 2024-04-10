public class this_5 {
    private int value;

    public this_5(int value) {
        // Assigning the value passed as parameter to the instance variable
        this.value = value;
    }

    public void setValue(int value) {
        // Setting the value of the instance variable using 'this'
        this.value = value;
    }

    public int getValue() {
        // Returning the value of the instance variable using 'this'
        return this.value;
    }

    public static void main(String[] args) {
        this_5 obj1 = new this_5(10);
        this_5 obj2 = new this_5(20);
        
        // Accessing and printing the value of instance variable using 'this'
        System.out.println("Value of obj1: " + obj1.getValue()); // Output: Value of obj1: 10
        System.out.println("Value of obj2: " + obj2.getValue()); // Output: Value of obj2: 20
    }
}
