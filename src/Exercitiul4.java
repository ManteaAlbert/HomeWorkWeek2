import java.util.Scanner;

public class Exercitiul4 {
    //2.3 Cititi de la tastatura un array (dimensiune + valori, cum a facut pana acum) si
    // apoi, afisati doar elemetele cu o valore mai mare decat 0.
    // Daca se poate inlocuiti 0 cu un numar citit tot de la tastatura.
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        //primul pas introducem n!
        System.out.println("Introduceti valoarea elementelor mai mare ca:");
        int n = nr.nextInt();
        int[] a = new int[n];
        for( int i = 0; i < a.length ; i++){
        }
        //scriem a[i] = nr.nextInt pentru a puteam introduce toate nr. de la primul pas.
        System.out.println("Introduceti valorile din Array");
        for (int i = 0; i < n; i++) {
            a[i] = nr.nextInt();
        }
        //scriem a[i] > n pt a ne compara nr din a[i] (adica a[i]= nr introduce de noi) cu acel nr n(n= Nr care il
        //introducem  in primul pas , adica Valoarea elementelor mai mare ca: "n" ).
        System.out.println("Afis arry-ul");
        for (int i = 0; i < n; i++) {
            if (a[i] > n) {
                System.out.print(a[i]+ " ");
            }
        }
    }
}

