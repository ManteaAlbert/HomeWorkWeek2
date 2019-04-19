import java.util.Scanner;
public class Exercitiul6 {
    //2.5 As vrea totusi sa ne mai jucam putin cu numerele astea prime si palindrome pentru ca sunt foarte bune
    // pentru partea de flow control.
    //Incercati sa faceti o clasa MyPrimeNumbers cu urmatorele metode:
    //boolean isPrime(int n)
    //void primesUntilN(int n)
    //void firstNPrimes(int n)
    //main
    public static void primesUntilN (int n){
        System.out.println("primes until " + n);
        for (int i = 2; i <= n; i++) {
            boolean iIsPrime = isPrime(i);
            if (iIsPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void firstNPrimes(int n) {
        System.out.println("first " + n + " primes");
        int nrOfPrimesFound = 0;
        int i = 2;
        while (nrOfPrimesFound < n) {
            boolean iIsPrime = isPrime(i);
            if (iIsPrime) {
                nrOfPrimesFound++;
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        int i = 2;
        while (i <= n / 2 && isPrime) {
            if (n % i == 0) {
                isPrime = false;
            }
            i++;
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("citim n");
        int n = s.nextInt();
        boolean nIsPrime = isPrime(n);
        System.out.println("n is prime: " + nIsPrime);
        primesUntilN(n);
        firstNPrimes(n);
    }
}
