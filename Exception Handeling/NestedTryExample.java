
public class NestedTryExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {1, 2, 3};
            System.out.println("Outer try block begins");
            
            try {
                // Inner try block
                System.out.println("Inner try block begins");
                System.out.println(numbers[5]); // Accessing an element beyond the bounds
                System.out.println("Inner try block ends");
            } catch (ArrayIndexOutOfBoundsException innerException) {
                // Inner catch block
                System.out.println("Inner catch block: " + innerException);
            }
            
            System.out.println("Outer try block ends");
        } catch (Exception outerException) {
            // Outer catch block
            System.out.println("Outer catch block: " + outerException);
        }
    }
}

