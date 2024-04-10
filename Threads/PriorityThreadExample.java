public class PriorityThreadExample {
    static int counter = 0;

    public static void main(String[] args) {
        // Create and start threads with different priorities
        Thread thread1 = new Thread(new CounterTask(), "Thread 1");
        Thread thread2 = new Thread(new CounterTask(), "Thread 2");
        Thread thread3 = new Thread(new CounterTask(), "Thread 3");
        Thread thread4 = new Thread(new CounterTask(), "Thread 4");

        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(3); // Priority 3
        thread3.setPriority(Thread.NORM_PRIORITY); // Priority 5
        thread4.setPriority(Thread.MAX_PRIORITY); // Priority 7

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final count for each thread
        System.out.println("Final count for Thread 1: " + CounterTask.counter1);
        System.out.println("Final count for Thread 2: " + CounterTask.counter2);
        System.out.println("Final count for Thread 3: " + CounterTask.counter3);
        System.out.println("Final count for Thread 4: " + CounterTask.counter4);
    }

    static class CounterTask implements Runnable {
        static int counter1 = 0;
        static int counter2 = 0;
        static int counter3 = 0;
        static int counter4 = 0;

        public void run() {
            for (int i = 0; i < 10; i++) {
                switch (Thread.currentThread().getName()) {
                    case "Thread 1":
                        counter1++;
                        break;
                    case "Thread 2":
                        counter2++;
                        break;
                    case "Thread 3":
                        counter3++;
                        break;
                    case "Thread 4":
                        counter4++;
                        break;
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

