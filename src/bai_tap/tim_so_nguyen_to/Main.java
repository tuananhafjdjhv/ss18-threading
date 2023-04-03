package bai_tap.tim_so_nguyen_to;

public class Main {
    public static void main(String[] args) {
        Runnable lazy = new LazyPrimeFactorization();
        Runnable optimized = new OptimizedPrimeFactorization();

        Thread lazyThread = new Thread(lazy);
        lazyThread.start();
        Thread optimizedThread = new Thread(optimized);


        optimizedThread.start();
    }
}
