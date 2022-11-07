package Projects.threadingDemo;

public class Main {
    public static void main(String[] args) {
        TimerThread thread1 = new TimerThread("t1");
        TimerThread thread2 = new TimerThread("t2");
        TimerThread thread3 = new TimerThread("t3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
