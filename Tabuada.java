public class Tabuada {

    public static void main (String []args) {

        Scanner sc = new Scanner (Sytem.in);
        System.out.printl("Informe seu numero da Tabuada: ");
        int numero = sc.nextInt();
        for (int i = 0 ; i <= 10; i++) {
        System.out.printl(numero  = " x " + i , " = " + (numero*i))
        }
    }
}