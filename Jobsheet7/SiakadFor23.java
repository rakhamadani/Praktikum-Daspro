package Jobsheet7;

import java.util.Scanner;

public class SiakadFor23 
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int Lulus = 0, TidakLulus = 0;
double nilai, tertinggi = 0, terendah = 100, nilaiMinimal = 60;

for (int i = 1; i <= 10; i++) {
    System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
    nilai = sc.nextDouble();
    if ( nilai > tertinggi ) {
        tertinggi = nilai;
    }
    if ( nilai < terendah ) {
        terendah = nilai;
    }
    if ( nilai >= nilaiMinimal ) {
    Lulus++;
    } else {
    TidakLulus++;}
}
System.out.println("Nilai tertinggi: " + tertinggi);
System.out.println("Nilai terendah: " + terendah);
System.out.println("Jumlah mahasiswa yang lulus: " + Lulus + "Orang");
System.out.println("Jumlah mahasiswa yang tidak lulus: " + TidakLulus + "Orang");
}
    } 
 