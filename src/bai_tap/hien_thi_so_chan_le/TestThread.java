package bai_tap.hien_thi_so_chan_le;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        EvenThread evenThread =new EvenThread();
        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        evenThread.start();
    }
}
