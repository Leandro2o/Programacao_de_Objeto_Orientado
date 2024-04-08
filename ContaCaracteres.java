import java.util.Scanner;

public class ContaCaracteres {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println(" Digite uma frase:");
        String Frase = Scanner.nextLine();
        int Vazio=0, LetraMaiuscula=0,LetraMinuscula=0, Espaco=0;
        for (int i = 0; i < Frase.length(); i++) {
            char Caractere = Frase. charAt(i);
            if (Caractere == '  ') {Espaco++;}
            else if (Caractere >= ' A' && Caractere <= 'Z'){LetraMaiuscula++;}
            else if (Caractere >= '  a' && Caractere <= 'z'){LetraMinuscula++;}
            }
        System.out.printf ("A quant idade de letras maiusculas eh %d\n", LetraMaiuscula);
        System.out.printf ("A quantidade de espacos eh %d\n", Espaco);
        System.out.printf ("A quantidade de letras minusculas eh %d\n", LetraMinuscula);
        }}