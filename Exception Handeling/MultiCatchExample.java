
public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw multiple exceptions
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]); // ArrayIndexOutOfBoundsException
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            // Multi-catch block to handle both exceptions
            System.out.println("Exception caught: " + e);
        }
    }
}
