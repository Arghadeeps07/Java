class Student{
    String name;
    int roll;
    char sec;
    Student(){
        this.name = "Arundhuti";
        this.roll = 14;
        this.sec = 'A';
    }
    void printDetails(){
        System.out.print("Name: "+ name +", Roll: "+roll+", Sec: "+ sec);
    }
}
public class CustomClassConstructor {
    public static void main(String[] args) {
        Student Aru = new Student();
        Aru.printDetails();
    }
}
