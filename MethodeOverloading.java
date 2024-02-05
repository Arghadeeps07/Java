public class MethodeOverloading {
    static void print(int a){
        System.out.println("Hello!");
    }
    static void print(int a, int b){
        System.out.println("Bye!");
    }
    public static void main(String[] args) {
        print(2,3);
        print(2);
    }
}
