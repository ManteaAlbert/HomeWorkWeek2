import java.util.Arrays;

public class Exercitiul3 {
    public static void main(String[] args) {
        //2.2 Cititi de la tastatura dimensiunea unui array, iar apoi array-ul si afisati-l in ordinea inversa a elementelor.
        //pont: utilizati un for ce parcurge array-ul descrescator cu i--;
        //56 ; 74 ; 13 ; 22 ; 94
        int numere[]={56,74,13,22,94};
        int l = numere.length;
        System.out.println();
        Arrays.sort(numere);
        System.out.print("Sortarea crescatoare este: ");
            for(int i=0;i < l;i++){
                System.out.print(numere[i] + " ");
        }
        System.out.println();
        System.out.print("Sortarea descrescatoare este: ");
            for(int i=4;i < l;i--){
                System.out.print(numere[i] + " ");
        }
    }
}



