package thuc_hanh.ung_dung_dem_so;

public class Count implements  Runnable{
    private Thread myThread;
    public Thread getMyThread() {
        return myThread;
    }
    public Count(){
        myThread = new Thread(this,"my runnable thread");
        System.out.println("my thread created" + myThread);
        myThread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count "+ i);
                Thread.sleep(1000);
            }
        } catch (Exception e){
            System.err.println("my thread interrupted");
            e.printStackTrace();
        }
        System.out.println("my thread run is over");
    }
}
