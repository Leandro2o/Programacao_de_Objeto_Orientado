import java.util.Scanner;

public class Caracteres {

    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma frase:");
        String frase = sc.nextLine();
        char letra1,letra2;
        int cont=0;
        System.out.println("\nQual caractere voce deseja encontrar? ");
        letra1 = sc.next().charAt(0);
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra1){
                cont++;
                System.out.println("A letra '" + letra1 + "' foi encontrada na posicao " + (i+1));
            }
        }
    }
}