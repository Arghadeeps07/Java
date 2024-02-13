interface Cycle{
    void applyBrake();
    // int speed();
    void com();
}
class Bicycle implements Cycle{
    int speed;
    String name;
    Bicycle(int speed, String name){
        this.speed = speed;
        this.name = name;
    }
    public void applyBrake(){
        speed--;
    }
    public void com(){
        System.out.println("Brand name :" + this.name);
    }
    
}
public class Interface {
    public static void main(String[] args) {
        Bicycle obj = new Bicycle(15, "Hero");
        obj.com();
        obj.applyBrake();
    }


}
