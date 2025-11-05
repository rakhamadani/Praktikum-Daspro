
import java.util.Scanner;

public class JumlahKuadrat {

public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int batasN;
System.out.print("Masukan nilai n = ");
batasN = sc.nextInt();
        
for (int n = 1; n <= batasN; n++) {
    int jumlahKuadrat = 0;
    String deret = "";

     for (int i = 1; i <= n; i++) {
         int kuadrat = i * i;
        jumlahKuadrat += kuadrat;
        deret += " + " + kuadrat;}

    System.out.println("n = "+ n +" > jumlah kuadrat = " + deret + " = " +jumlahKuadrat);
}
}
}
