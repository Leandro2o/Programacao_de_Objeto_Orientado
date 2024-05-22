import java.util.Scanner;

public class AlunoDados {

  public static void main (String[] args) {
    //bliblioteca para ler dados do teclado
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("--------------------------------");
      System.out.println("1 - Cadastrar Aluno");
      System.out.println("2 - Alterar ");
      System.out.println("3 - Excluir Aluno");
      System.out.println("4 - Listar Aluno");
      System.out.println("5 - Pesquisar Aluno");
      int opcao = sc.nextInt();

    switch(opcao){
  case 1:
    CadastrarAluno();
    break;
  case 2:
    CadastrarAluno();
    break;
  case 3:
    CadastrarAluno();
    break;
  case 4:
    CadastrarAluno();
    break;
  case 5:
    CadastrarAluno();
    break;
    case 6:
      System.out.println("Saindo do Sistema");
      break;
    default:
      System.out.println("Opção inválida");
}
    System.out.println("Informe quantos alunos deseja cadastrar ");
    int qtdAlunos = sc.nextInt();
    Aluno[] aluno = new Aluno(qtdAlunos);  

    //Declaração de variaveis
for(int i = 0; i < aluno.lenght; i++){
  aluno[i] = new Aluno();
  System.out.println("Digite o nome do aluno: ");
  aluno[i].nome = sc.nextLine();
  System.out.println("Digite o nome da cidade: ");
  sc.nextLine();
  aluno[i].cidade = sc.nextLine();
  System.out.println("Digite o nome da turma: ");
  aluno[i].turma = sc.nextLine();
  System.out.println("Digite a sua idade: ");
  aluno[i].idade = sc.nextInt();
}

System.out.println("Imprimindo os alunos cadastrados");
    //Resultados
  for(int i = 0; i < aluno.lenght; i++){
    System.out.print("________________________________________");
    System.out.print("Nome: " +aluno[i].nome);
    System.out.print("Cidade: " +aluno[i].cidade);
    System.out.print("Turma: " +aluno[i].turma);
    System.out.print("Idade: " +aluno[i].idade);
  }
}
}