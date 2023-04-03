package bai_tap.hien_thi_so_chan_le;

public class OddThread extends Thread {
    public void run(){
        for (int i = 1; i < 10; i+=2) {
            System.out.println(i + " ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
