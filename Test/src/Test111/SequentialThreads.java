package Test111;

public class SequentialThreads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1", 2000));
        Thread thread2 = new Thread(new MyRunnable("Thread 2", 4000));

        thread1.start();

        try {
            thread1.join();
            Thread.sleep(2000);  // Delay for 2000 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }

    static class MyRunnable implements Runnable {
        private final String threadName;
        private final long delay;

        public MyRunnable(String threadName, long delay) {
            this.threadName = threadName;
            this.delay = delay;
        }

        @Override
        public void run() {
            try {
                System.out.println("Thread " + threadName + " is running");
                Thread.sleep(delay);
                System.out.println("Thread " + threadName + " has completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
