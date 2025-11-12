import java.util.Scanner;

public class Tugas1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
int jumlahNilai = sc.nextInt();
int[] nilaiMahasiswa = new int[jumlahNilai];
int total = 0;
int nilaiTertinggi = 0;
int nilaiTerendah = 101; 

for (int i = 0; i < jumlahNilai; i++) {
    System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
    int nilai = sc.nextInt();
    nilaiMahasiswa[i] = nilai;
    total += nilai;

    if (nilai > nilaiTertinggi) {
        nilaiTertinggi = nilai;
    }
            
    if (nilai < nilaiTerendah) {
        nilaiTerendah = nilai;
    }
}
        
System.out.println("\n--- Hasil Pengelolaan Nilai ---");

System.out.print("Semua Nilai yang Dimasukkan: [");
for (int i = 0; i < nilaiMahasiswa.length; i++) {
    System.out.print(nilaiMahasiswa[i]);
    if (i < nilaiMahasiswa.length - 1) {
        System.out.print(", ");
    }
}
        System.out.println("]");
        
        double rataRata = (double) total / jumlahNilai;
        System.out.println("Nilai Rata-rata Mahasiswa: " + rataRata);

        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        
        
}
}