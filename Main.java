import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n,i,result=0;
        System.out.println("Sayi Gir: ");
        n = input.nextDouble();

        for(i=1; i<=n; i++){

            result += (1/i);

        }
        System.out.println("Sonuc: "+ result);

    }
}