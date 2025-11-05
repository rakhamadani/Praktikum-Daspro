import java.util.Scanner;

public class tugas3 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int totalPelanggan = 0;
int totalItemTerjual = 0;

System.out.print("Jumlah cabang kafe: ");
int jumlahCabang = sc.nextInt();

System.out.println("\n=== Input Penjualan Per Cabang ===");

for (int i = 1; i <= jumlahCabang; i++) {
    System.out.println("--- Cabang " + i + " ---");
            
    int Pelanggan = 0;
    int ItemTerjual = 0;

    System.out.print("Jumlah pelanggan: ");
    int jumlahPelanggan = sc.nextInt();
            
    for (int j = 1; j <= jumlahPelanggan; j++) {
        System.out.printf("Pelanggan %d memesan berapa item? ", j);
        int itemDipesan = sc.nextInt();

        if (itemDipesan >= 1) {
            ItemTerjual += itemDipesan;
            Pelanggan++;
        } else {
            System.out.println("  (Pelanggan ini diabaikan karena memesan kurang dari 1 item.)");
        }
    }
            
System.out.println("Cabang " + i + ":");

System.out.printf("- Pelanggan: %d orang\n", Pelanggan);
System.out.printf("- Item terjual: %d\n", ItemTerjual);
            
totalPelanggan += Pelanggan;
totalItemTerjual += ItemTerjual;}

System.out.println("\nTotal seluruh cabang:");
System.out.printf("Total pelanggan: %d orang\n", totalPelanggan);
System.out.printf("Total item: %d item\n", totalItemTerjual);

     
    }
}