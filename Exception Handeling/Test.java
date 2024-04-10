class Test {
    static void validate(int n) {
        try {
            if (n < 5) {
                throw new InvalidNoOfElementsException("Invalid no of elements");
            } else {
                System.out.println("Valid age");
            }
        } catch (InvalidNoOfElementsException e) {
            System.out.println("ExceptionCaught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("From the try block");
        validate(args.length);
    }
}

class InvalidNoOfElementsException extends Exception {
    public InvalidNoOfElementsException(String message) {
        super(message);
    }
}
