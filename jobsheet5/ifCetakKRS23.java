package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS23 {
   public static void main(String[] args) {  
   Scanner sc = new Scanner(System.in);
   
   int nilai;
   System.out.println("Masukkan Nilai Anda : ");
   nilai = sc.nextInt();

   if (nilai >= 50) {
       System.out.println("Tuntas");
   } else {
       System.out.println("Tidak Tuntas");
   }
   if ("tuntas".equals("Tuntas")) {
       System.out.println("Selamat Anda Lulus");
   } else {
       System.out.println("Silahkan Mengulang");
   }
   
   }

   }

