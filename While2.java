import java.util.Scanner;
import java.util.Random;

public class While2 {

    public static void main(String[] args) {
        Random rand = new Random();
        int counter = 0;
        
        System.out.println("Informe um numero entre 0 a 100: ");
        int num1 = scanner.nextInt();

        do {
            num1 = rand.nextInt(100); // gera um número aleatório de 0 a 100
            counter++; //incrementa o contador
        } while (counter != num1); // loopa cinco vezes
            if (counter == num1){
                System.out.println("Voce acertou! Voce tentou " + counter + " vezes");
            }
    }
}