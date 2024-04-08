import java.util.Scanner;

public class opcao {

  public  static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int op;

    do {
    System.out.println("--------------------------------------");
    System.out.println("|                Menu                |");
    System.out.println("--------------------------------------");
    System.out.println("1 - Garrafa");
    System.out.println("2 - Mochila");
    System.out.println("3 - Lapis");
    System.out.println("Escolha o codigo do produto(digite 0 para sair)\n");
    op = sc.nextInt();

    switch(op){
      case 1:
        System.out.println("Voce escolheu garrafa");
        break;
      case 2:
        System.out.println("Voce escolheu Mochila");
        break;
      case 3:
        System.out.println("Voce escolheu Lapis");
        break;
        default:
        System.out.println("Opcao invalida!");
    }
    } while(op != 0);
    System.out.println("Obrigado por comprar conosco! Volte sempre!");
  }
}