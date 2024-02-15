interface Cycle{
    int i = 8; // We cannot change the properties of the interface it is by default final
    void applyBrake();
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
