import java.util.Scanner;

public class  Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        int num1 = sc.nextInt();
        System.out.println("Informe o segundo numero:");
        int num2 = sc.nextInt();
        System.out.println("\nEscolha a operação desejada (+,-,*,/): ");
        int operacao = sc.nextInt();

        int resultado = 0;

        switch(operacao){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida!");    
            }
            System.out.println("O resultado eh: " + resultado);
    }
}