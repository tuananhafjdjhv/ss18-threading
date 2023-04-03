package bai_tap.tim_so_nguyen_to;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        System.out.println("Running OptimizedPrimeFactorization");
        int number = 2;
        while (true) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("OptimizedPrimeFactorization: " + number);
            }
            number++;
        }
    }
}
