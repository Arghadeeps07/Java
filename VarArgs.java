public class VarArgs {
    static int add (int a,int ...arr) // adding a bar a so that atleast one argument is necessary
    {
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        return sum + a;
    }
    public static void main(String[] args) {
        System.out.println(add(10,11,34,45));
    }
}
