package thuc_hanh.tao_luong_runable;

public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;

    public RunnableDemo( String threadName) {
        this.threadName = threadName;
        System.out.println("Thêm "+ threadName);
    }


    @Override
    public void run() {
        System.out.println("Running "+threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Dừng vòng lặp trong 50 ms
                Thread.sleep(50);
            }
        } catch (InterruptedException e){
            System.out.println("Thread "+ threadName+" interrupted");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
    public void start(){
        System.out.println("Start "+threadName);
        if (t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}
