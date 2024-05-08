class Test extends Thread{
    int total = 0;
    public void run(){
        synchronized(this){
        for(int i=0; i<10 ; i++){
            total = total + 100;
        }
         this.notify();
        }
    }
}
public class Wait_1 {
    public static void main(String[] args) throws InterruptedException {
        Test obj = new Test();
        obj.start();
        
        synchronized(obj){
            obj.wait();
            System.out.println(obj.total);

        }
        
    
    }
}
