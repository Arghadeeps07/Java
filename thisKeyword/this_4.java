public class this_4 {
    private int value;

    public this_4(int value) {
        this.value = value;
    }

    public this_4 setValue(int value) {
        this.value = value;
        return this; // Returning current class instance
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        this_4 obj = new this_4(10);
        
        // Using method chaining to set and get value
        int newValue = obj.setValue(20).getValue();
        System.out.println("New value: " + newValue); // Output: New value: 20
    }
}

