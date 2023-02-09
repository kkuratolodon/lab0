import java.util.Scanner;

public class PangkatFaktorial {
    public static void main(String[] args){
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan bilangan utama (n): ");
        long n = sc.nextLong();
        System.out.print("masukkan pemangkatan (m): ");
        long m = sc.nextLong();
        // Menghitung hasil faktorial
        long hasilFact = 1;
        long tempN = n;
        while (tempN-- >= 1){
            hasilFact *= tempN+1;
        }
        // Menghitung hasil pangkat
        long hasilPangkat = 1;
        for(int i=0; i<m; i++){
            hasilPangkat *= n;
        }
        System.out.printf("n factorial = %d\n", hasilFact);
        System.out.printf("n pangkat m = %d", hasilPangkat);
    }

}
