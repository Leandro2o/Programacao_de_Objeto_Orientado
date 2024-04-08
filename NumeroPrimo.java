import java.util.Scanner;

public class NumeroPrimo {

    public  static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe un numero: ");
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("O numero" + n + "nao eh primo");
        } else{
            System.out.println("O numero" + n + "eh primo");
        }
    }
}