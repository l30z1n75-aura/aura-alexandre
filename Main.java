import java.util.Scanner;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

        Aluno[] alunos = new Aluno[100];
        int totalAlunos = 0;

        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE CADASTRO DE ALUNOS ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar aluno por matrícula");
            System.out.println("4 - Mostrar alunos aprovados");
            System.out.println("5 - Mostrar alunos reprovados");
            System.out.println("6 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();

                    System.out.print("Curso: ");
                    String curso = sc.nextLine();

                    System.out.print("Nota 1: ");
                    double nota1 = sc.nextDouble();

                    System.out.print("Nota 2: ");
                    double nota2 = sc.nextDouble();

                    alunos[totalAlunos] = new Aluno(nome, matricula, curso, nota1, nota2);
                    totalAlunos++;

                    System.out.println("Aluno cadastrado com sucesso!");
        }

                case 2 -> {
                    if (totalAlunos == 0) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (int i = 0; i < totalAlunos; i++) {
                            System.out.println("\nNome: " + alunos[i].getNome());
                            System.out.println("Matrícula: " + alunos[i].getMatricula());
                            System.out.println("Curso: " + alunos[i].getCurso());
                            System.out.println("Média: " + alunos[i].calcularMedia());
                        }
                    }
        }

                case 3 -> {
                    System.out.print("Digite a matrícula: ");
                    String busca = sc.nextLine();

                    boolean encontrado = false;

                    for (int i = 0; i < totalAlunos; i++) {
                        if (alunos[i].getMatricula().equals(busca)) {
                            System.out.println("\nAluno encontrado:");
                            System.out.println("Nome: " + alunos[i].getNome());
                            System.out.println("Curso: " + alunos[i].getCurso());
                            System.out.println("Média: " + alunos[i].calcularMedia());
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Aluno não encontrado.");
                    }
        }

                case 4 -> {
                    System.out.println("\n=== APROVADOS ===");

                    for (int i = 0; i < totalAlunos; i++) {
                        if (alunos[i].aprovado()) {
                            System.out.println(alunos[i].getNome() +
                                    " - Média: " + alunos[i].calcularMedia());
                        }
                    }
        }

                case 5 -> {
                    System.out.println("\n=== REPROVADOS ===");

                    for (int i = 0; i < totalAlunos; i++) {
                        if (!alunos[i].aprovado()) {
                            System.out.println(alunos[i].getNome() +
                                    " - Média: " + alunos[i].calcularMedia());
                        }
                    }
        }

                case 6 -> System.out.println("Encerrando sistema...");

                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 6);

        sc.close();
    }
}