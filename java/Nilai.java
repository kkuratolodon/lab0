import java.util.Scanner;

public class Nilai {
    public static void main(String[] args){
        // Input.
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Nilai Asli: ");
        int nilaiAsli = sc.nextInt();
        System.out.print("Masukkan Durasi: ");
        int durasi = sc.nextInt();
        // inisialisasi nilai akhir
        double nilaiAkhir;
        // Kondisi
        if (durasi < 60){
            nilaiAkhir = 1.2 * nilaiAsli;
        } else if (60 <= durasi && durasi <= 70) {
            nilaiAkhir = nilaiAsli;
        } else if (70 < durasi && durasi < 90){
            nilaiAkhir = 0.75 * nilaiAsli;
        } else if (90 <= durasi && durasi <= 100) {
            nilaiAkhir = 0.5 * nilaiAsli;
        } else{
            nilaiAkhir = 0.2 * nilaiAsli;
        }
        // Output.
        System.out.printf("%s mendapatkan nilai akhir %f", nama, nilaiAkhir);
        sc.close();
    }
}
