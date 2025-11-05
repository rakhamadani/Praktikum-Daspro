public class JumlahKuadrat {

public static void main(String[] args) {
int batasN = 5;
        
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
