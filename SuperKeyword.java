class Parent{
    int n;
    void getValue(int n){
        this.n = n;
    }
    int disp(){
        return n;
    }
}
class Child extends Parent {
    int n;
    Child(){
        super.getValue(8);
        n = super.disp();
        System.out.println(n);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
