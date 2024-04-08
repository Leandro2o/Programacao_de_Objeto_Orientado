import java.util.Scanner;

public class Aluno {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        System.out.println("Seu nome é "+ args[0]);

        System.out.println("Informe o primeiro valor:  ");
        int n1 = sc.nextInt();
        System.out.println("Informe o segundo valor:  ");
        int n2 = sc.nextInt();
        System.out.println("Informe o terceiro valor: ");
        int n3 = sc.nextInt();
        System.out.println("Informe o quarto valor:  ");
        int n4 = sc.nextInt();


        double media =  (n1 + n2 + n3 +n4)/4;
        if (media >= 7){
            System.out.println ("Aprovado com nota "+ media);
    }
    else{
         System.out.println ("Reprovado com nota "+ media);
    }
    }
}