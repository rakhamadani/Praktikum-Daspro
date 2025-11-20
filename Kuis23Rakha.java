//Nama  : Rakha Madani Rizkullah
//NIM   : 254107020073

public class Kuis23Rakha {
public static void main(String[] args) {
        
int roda2 = 5000;
int roda4 = 10000;
int mobil1 = 6;
int mobil2 = 8;
int mobil3 = 3;
int motor1= 12;
int motor2 = 10;
int motor3 = 2;
int sepeda1 = 4;
int sepeda2 = 6;
int sepeda3 = 1;
int truk1 = 2;
int truk2 = 3;
int truk3 = 1;
int bus1 = 1;
int bus2 = 2;
int bus3 = 1;
int totalMobil = mobil1 + mobil2 + mobil3;
int totalMotor = motor1 + motor2 + motor3;
int totalSepeda = sepeda1 + sepeda2 + sepeda3;
int totalTruk = truk1 + truk2 + truk3;
int totalBus = bus1 + bus2 + bus3;


System.out.println("Total kedaraan Outdoor \t\t : " + (mobil1 + motor1 + sepeda1 + truk1 + bus1) + " kendaraan");
System.out.println("Total kederaan Basement \t : " + (mobil2 + motor2 + sepeda2 + truk2 + bus2) + " kendaraan");
System.out.println("Total kederaan VIP \t\t : " + (mobil3 + motor3 + sepeda3 + truk3 + bus3) + " kendaraan");

double rataVIP = (double)(mobil3 + motor3 + sepeda3 + truk3 + bus3) / 5;
System.out.println("Rata-rata kendaraan di VIP \t : " + rataVIP + " kendaraan");

int totalPendapatan = (totalBus * roda4) + (totalTruk * roda4) + (totalMobil * roda4) + (totalMotor * roda2) + (totalSepeda * roda2);
System.out.println("Total pendapatan parkir hari ini : Rp " + totalPendapatan);

int kedaraanTerbanyak = Math.max(Math.max(Math.max(Math.max(totalBus, totalTruk), totalMobil), totalMotor), totalSepeda);  

String jenisKendaraan = "";
if (kedaraanTerbanyak == totalBus) {
    jenisKendaraan = "Bus";
} else if (kedaraanTerbanyak == totalTruk) {
    jenisKendaraan = "Truk";
} else if (kedaraanTerbanyak == totalMobil) {
    jenisKendaraan = "Mobil";
} else if (kedaraanTerbanyak == totalMotor) {
    jenisKendaraan = "Motor";
} else if (kedaraanTerbanyak == totalSepeda) {
    jenisKendaraan = "Sepeda";
}

System.out.println("Jenis kendaraan terbanyak adalah " + jenisKendaraan + " dengan jumlah " + kedaraanTerbanyak + " kendaraan.");

}
}