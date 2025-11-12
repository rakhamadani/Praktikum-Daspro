import java.util.Scanner;

public class Tugas2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
System.out.print("Masukkan jumlah jenis pesanan yang berbeda: ");
int jumlahPesanan = sc.nextInt();
sc.nextLine(); 

String[] namaPesanan = new String[jumlahPesanan];
int[] hargaPesanan = new int[jumlahPesanan];
int totalBiaya = 0;
        
System.out.println("--- Masukkan Detail Pesanan ---");
        
for (int i = 0; i < jumlahPesanan; i++) {
    System.out.println("Pesanan ke-" + (i + 1) + ":");
            
    System.out.print("  Nama makanan/minuman: ");
    namaPesanan[i] = sc.nextLine();
            
    System.out.print("  Harga satuan (Rp): ");
    hargaPesanan[i] = sc.nextInt();
            
    totalBiaya += hargaPesanan[i]; 
    sc.nextLine(); 
}
        
System.out.println("\n--- Daftar Pesanan dan Total Biaya ---");
        
System.out.println("No.\tNama Pesanan\t\tHarga (Rp)");
System.out.println("-------------------------------------------------");
        
for (int i = 0; i < jumlahPesanan; i++) {
    System.out.println((i + 1) + "\t" + namaPesanan[i] + "\t\t\t" + hargaPesanan[i]);
}
        
System.out.println("-------------------------------------------------");
System.out.println("\t\t\t\tTOTAL BIAYA: " + totalBiaya + " Rp");
        
    
}
}