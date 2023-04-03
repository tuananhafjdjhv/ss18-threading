package bai_tap.hien_thi_so_chan_le;

public class EvenThread extends Thread {
    public void run(){
        for (int i = 2; i < 10; i+=2) {
            System.out.println(i + " ");
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
