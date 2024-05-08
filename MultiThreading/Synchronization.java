

public class Synchronization implements Runnable{
    int n = 2;
    int passenger ;
    Synchronization(int noOfPassenger){
        this.passenger = noOfPassenger;
    }
    public synchronized void run(){
        String name = Thread.currentThread().getName();
        if(n >= passenger){
            System.out.println("The seat is booked by : "+ name);
            n--;
        }
        else{
            System.out.println("Seat not avialable...");
        }
    }
    public static void main(String[] args) {
        Synchronization r = new Synchronization(1);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.setName("Ram");
        t2.setName("Shayam");
        t3.setName("Madhu");

        t1.start();
        t2.start();
        t3.start();
        
    }
}
