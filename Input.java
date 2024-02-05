import java.util.Scanner;
public class Input {
    public static void main(Strings[] args) {
        System.out.println("Enter the first number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("The result is:" + (a+b));
        sc.close();
    }
}
