import java.util.Scanner;
import java.util.Random;

public class ParImpar {

    public  static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Random rand = new Random();
    int num, contPar=0,contImpar=0;
    System.out.println("Ingrese un numero: ");
    num = sc.nextInt();
    while (num != 0){
        if (num%2 == 0 ){
            System.out.println ("eh par");
            contPar++;
    }
    else{
        System.out.println ("eh impar");
        }
        System.out.println ("Desea continuar? s/n");
        char resp = 's';
        resp = sc.next().charAt(0);
        if (resp=='s'){
            System.out.println("Ingrese otro numero 0 para salir");
            num = sc.nextInt();
            }else{
                num=0;
        }
        
     }
    System.out.println("Numero de numeros pares "+ contPar + "de impares"+ contImpar);
    }
}