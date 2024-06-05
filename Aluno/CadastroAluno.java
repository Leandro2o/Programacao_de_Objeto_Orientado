import java.util.Scanner;

public class CadastroAluno {

    //validação de variaveis
    static Aluno[] arrayAluno = new Aluno[40];
    static int qtdAluno = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {

            //menu para o cliente conseguir mexer
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Alterar Aluno");
            System.out.println("3 - Excluir Aluno");
            System.out.println("4 - Listar Aluno");
            System.out.println("5 - Pesquisar Aluno");
            System.out.println("6 - Sair do Sistema");
            System.out.println("");
            System.out.println("Escolha uma opção");
            opcao = sc.nextInt();
            sc.nextLine();

            //switch para usar os sistemas
            switch (opcao) {
                case 1:
                    cadastrarAluno(sc);
                    break;
                case 2:
                    alterarAluno(sc);
                    break;
                case 3:
                    // ExcluirAluno();
                    break;
                case 4:
                    listarAluno();
                    break;
                case 5:
                    // PesquisarAluno();
                    break;
                case 6:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 6);
    }    
    //sistema para cadastrar akunos
    static void cadastrarAluno(Scanner sc) {
        System.out.println("Cadastro de Aluno");
        System.out.println("_______________________________");
        System.out.println("Informe o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Informe a turma: ");
        String turma = sc.nextLine();
        System.out.print("Informe a idade do aluno: ");
        int idade = sc.nextInt();
        sc.nextLine(); // Limpa o buffer
        System.out.print("Informe a cidade do aluno: ");
        String cidade = sc.nextLine();

        Aluno aluno = new Aluno();
        aluno.nome = nome;
        aluno.turma = turma;
        aluno.idade = idade;
        aluno.cidade = cidade;

        arrayAluno[qtdAluno] = aluno;
        qtdAluno++;
        System.out.println("Aluno cadastrado com sucesso!");
    }

    //sistema para listar os alunos
    static void listarAluno() {
        System.out.println("Lista de alunos cadastrados");
        for (int i = 0; i < qtdAluno; i++) {
            System.out.println("_____________________________");
            System.out.println(" Aluno " + i
                    + " - Nome: " + arrayAluno[i].nome
                    + ", Turma: " + arrayAluno[i].turma
                    + ", Idade: " + arrayAluno[i].idade
                    + ", Cidade: " + arrayAluno[i].cidade);
        }
    }

    //sistema para listar os alunos
    static void listarAluno(int i) {
        System.out.println("_________________________");
        System.out.println("Aluno " + i
                + " - Nome: " + arrayAluno[i].nome
                + ", - Turma: " + arrayAluno[i].turma
                + ", - Idade: " + arrayAluno[i].idade
                + ", - Cidade: " + arrayAluno[i].cidade
        );
    }

    //sistema para alterar o aluno
    static void alterarAluno(Scanner sc ){
      System.out.println("Alterando um cadastro...");
        listarAluno();
        System.out.println("Informe o aluno que deseja alterar:");
        int alterar = sc.nextInt();
        sc.nextLine();

        if (alterar < qtdAluno){
          String resposta;
          System.ou.println("Deseja altear o nome do aluno: (sim/nao)");
          resposta = sc.nextLine();
          if (resposta.toLowerCase().equal("s") || 
              resposta.toLowerCase().equal("sim") ) {
                String nome = sc.nextLine();
                arrayAluno[alterar].nome = nome;
                resposta = null;
              }

            System.out.println("Deseja alterar a turma do aluno: (Sim|Não)");
            resposta = sc.nextLine();
            if (resposta.toLowerCase().equal("s") || 
              resposta.toLowerCase().equal("sim") ) {
                String nome = sc.nextLine();
                arrayAluno[alterar].turma = turma;
                resposta = null;
            }

            System.out.println("Deseja alterar a idade do aluno: (Sim|Não)");
            resposta = sc.nextLine();
            if (resposta.toLowerCase().equal("s") || 
              resposta.toLowerCase().equal("sim") ) {
                String nome = sc.nextLine();
                arrayAluno[alterar].idade = idade;
                resposta = null;
            }

            System.out.println("Deseja alterar a cidade do aluno: (Sim|Não)");
            resposta = sc.nextLine();
            if (resposta.toLowerCase().equal("s") || 
              resposta.toLowerCase().equal("sim") ) {
                String nome = sc.nextLine();
                arrayAluno[alterar].cidade = cidade;
                resposta = null;
            }

            System.out.println("Aluno alterado com sucesso");

            listarAluno(alterar);
        } else {
            System.out.println("Codigo invalido");
        }
        }

        //sistema para Pesquisa Alunos
        static void PesquisarAluno(Scanner sc) {
            System.out.println("Pesquisa de Aluno");
            System.out.println("Digite a sua pesquisa: ");

            String pesquisa = sc.nextLine();

            for(int i = 0; i < qtdAluno; i++){
                if(arrayAluno[i].nome.equals(pesquisa) ||
                    arrayAluno[i].turma.equals(pesquisa) ||
                    integer.toString(i).equals(pesquisa).contains(pesquisa)||
                    arrayAluno[i].cidade.equals(pesquisa) ) {
                        listarAluno(i);
                        achouPesquisa = true;
                        break;  
                    }
            }

            if(achouPesquisa) {
                System.out.println("Nenhum dado emcomtrado com essa pesquisa");
            }
        }
        //Sistema para Excluir Alunos
        static void excluirAluno(Scanner sc) {
            System.out.println("Alterando um cadastro...");
            listarAluno();
            System.out.println("Informe o aluno que deseja: ");
            int excluir = sc.nextInt();
            sc.nextLine();

            if(excluir < qtdAluno) {
                for(int i = excluir; i < qtdAluno; i++){
                    arrayAluno[i] = arrayAluno[i + 1];
            }
            qtdAluno++;

            System.out.println("Aluno excluido com sucesso!");
        } else {
            System.out.println("Aluno nao encontrado para exclusao");
        }
        }
    }