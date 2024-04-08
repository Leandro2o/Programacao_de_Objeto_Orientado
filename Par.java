import java.util.Scanner;

public class Par {

public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);

System.out.print("Digite o primeiro Valor: ");
int num1 = scanner.nextInt();

System.out.print("Digite o segundo Valor: ");
int num2 = scanner.nextInt();

int sum = num1 + num2;

if (sum % 2 == 0) { 
    System.out.println("A soma de " + num1 + " and " + num2 + " é par."); 
}
else { 
    System.out.println("A soma de  " + num1 + " and " + num2 + " é impar."); 
} 
} 
}