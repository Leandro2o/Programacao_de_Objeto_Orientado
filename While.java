import java.util.Random;

public class While {

    public static void main(String[] args) {
        Random rand = new Random();
        int n1;
        int counter = 0;

        do {
            n1 = rand.nextInt(20); // gera um número aleatório de 0 a 19
            System.out.println("O numero gerado eh: " + n1);
            counter++;
        } while (counter != n1); // loopa cinco vezes
    }
}