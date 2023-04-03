package bai_tap.tim_so_nguyen_to;

public class LazyPrimeFactorization implements Runnable{

    @Override
    public void run() {
        System.out.println("Running LazyPrimeFactorization");
        int number = 2;
        while (true){
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("LazyPrimeFactorization: " + number);
            }
            number++;
        }
    }
}
