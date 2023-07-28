package chapter2;

// Напишите программу, которая находила бы простые числа в пределах от 2 до 100.
public class PrimeNumbers {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;

        for(i = 2; i <= 100; i++) {
            isPrime = true;
            for (j = 2; j <= i / j; j++) {
                if(i % j == 0) {
                    isPrime = false;
                }
            }
            if(isPrime) {
                System.out.println(i + " простое число");
            }
        }
    }
}