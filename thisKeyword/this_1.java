public class this_1 {
    public void myMethod() {
        System.out.println("Inside myMethod");
    }

    public void anotherMethod() {
        this.myMethod();
    }

    public static void main(String[] args) {
        this_1 obj = new this_1();
        obj.anotherMethod();
    }
}