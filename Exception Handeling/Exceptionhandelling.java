public class Exceptionhandelling {
    public static void main(String[] args) {
        int n = 0;
        try{
            int a = 78/n;
        }
        finally{
            System.out.println(n);
        }

    }
}
