class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            // Print thread name and its count
            System.out.println(Thread.currentThread().getName() + ": " + i);
            
            // Pause the current thread temporarily
            Thread.yield();
        }
    }
}

public class YieldExample {
    public static void main(String[] args) {
        // Create two threads
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        // Start both threads
        thread1.start();
        thread2.start();
    }
}

