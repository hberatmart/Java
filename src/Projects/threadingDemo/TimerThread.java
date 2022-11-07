package Projects.threadingDemo;

public class TimerThread  implements Runnable{

    private Thread thread;
    private String threadName;

    public TimerThread(String threadName){
        this.threadName = threadName;
        System.out.println("Creating : " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Runing : " + threadName);

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        System.out.println("Thread finished : " + threadName);
        }

    public void start(){
        System.out.println("Thread's object creating");
        if (thread==null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}

