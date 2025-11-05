
import java.util.Scanner;

public class NilaiKelompok23 {

public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

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
    


}



}
}
