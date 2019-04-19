import java.util.Scanner;

public class Exercitiul7 {
        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
            }
            System.out.println("Introduceti valorile:");

            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            int i = 0;
            int sum = s.nextInt();
            int sumArry = 0;
            System.out.println("minSum");

            while (sum > sumArry) {
                sumArry = sumArry + a[i];
                System.out.println(a[i]);
                i++;
            }
        }
}
