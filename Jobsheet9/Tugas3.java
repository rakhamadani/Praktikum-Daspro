import java.util.Scanner;

public class Tugas3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
System.out.println("--- Daftar Menu Kafe ---");
for (String item : menu) {
    System.out.println("- " + item);
}
System.out.println("------------------------\n");

System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
String cariMakanan = sc.nextLine();
        
boolean ditemukan = false;
int indeksDitemukan = -1; 
        
for (int i = 0; i < menu.length; i++) {
    if (cariMakanan.equalsIgnoreCase(menu[i])) {
        ditemukan = true;
        indeksDitemukan = i;
        break;
    }
}
        
System.out.println("\n--- Hasil Pencarian ---");
if (ditemukan) {
    System.out.println("Makanan/Minuman \"" + cariMakanan + "\" tersedia di menu!");
    System.out.println("(Ditemukan pada indeks ke-" + indeksDitemukan + ")");
} else {
        System.out.println("Maaf, Makanan/Minuman \"" + cariMakanan + "\" tidak ada di menu.");
}
        
        
}
}