import java.util.Scanner;

public class Area {

    public  static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o raio do Circulo: ");
    double r = sc.nextDouble();
    double areaCirculo = Math.PI * (r*r);

    System.out.println("A area do Circulo  eh de %.6f" + areaCirculo);
    }
}