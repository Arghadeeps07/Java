class Circle{
    int r;
    Circle(int r){
        this.r = r;
    }
    void print(){
        System.out.println("The area of the circle is :" + Math.PI*r*r);
    }
}
class Cylinders extends Circle{
    int h;
    Cylinders(int r, int h){
        super(r);
        this.h = h;
    }
    void print(){
        System.out.println("The area of the cylinders is :" + Math.PI*r*r*h);
    }
}
class AreaAndVolOfCircleAndCylinders{
    public static void main(String[] args) {
        Cylinders obj = new Cylinders(4, 6);
        obj.print();
    }
}