package bai_tap.tao_thread_don_gian;

public class NumberGenerator implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
