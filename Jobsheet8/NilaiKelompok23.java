
import java.util.Scanner;

public class NilaiKelompok23 {

public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
double rataTertinggi = 0;
int kelompokTertinggi = 0;

int i = 1;
while (i <= 6) {
    System.out.println("Kelompok " + i);
    
    float totalNilai = 0;
    for (int j=1; j<=5; j++) {
        System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
        int nilai = sc.nextInt();
        totalNilai += nilai; 

        
    }
    
    float rataNilai = totalNilai / 5;
    System.out.println(" Rata-rata Nilai Kelompok " + i + " : " + rataNilai);
    i++;
    if (rataNilai > rataTertinggi) {
        rataTertinggi = rataNilai;
        kelompokTertinggi = i - 1;
    }
}

System.out.println("Rata-rata Tertinggi: " + rataTertinggi);
System.out.println("Kelompok dengan Rata-rata Tertinggi: Kelompok " + kelompokTertinggi);
}
}
