public class ThrowExample {
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above."); // Throwing an IllegalArgumentException
        } else {
            System.out.println("Age is valid.");
        }
    }
    
    public static void main(String[] args) {
        try {
            validateAge(15); // Trying to validate an age less than 18
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
