/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Q302 {
    private static String[][] cadastro = new String[10][3]; // Matriz para armazenar até 10 pessoas
    private static int contador = 0; // Contador para o número de pessoas cadastradas

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Inserir pessoa");
            System.out.println("2. Alterar dados da pessoa");
            System.out.println("3. Consultar dados da pessoa");
            System.out.println("4. Excluir dados da pessoa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    inserirPessoa(scanner);
                    break;
                case 2:
                    alterarPessoa(scanner);
                    break;
                case 3:
                    consultarPessoa(scanner);
                    break;
                case 4:
                    excluirPessoa(scanner);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    // Inserir uma pessoa
    private static void inserirPessoa(Scanner scanner) {
        if (contador >= 10) {
            System.out.println("Cadastro cheio!");
            return;
        }

        System.out.print("ID da pessoa: ");
        cadastro[contador][0] = scanner.nextLine();
        System.out.print("Nome da pessoa: ");
        cadastro[contador][1] = scanner.nextLine();
        System.out.print("Data de nascimento (dd/mm/aaaa): ");
        cadastro[contador][2] = scanner.nextLine();
        contador++;
        System.out.println("Cadastro concluído.");
    }

    // Alterar os dados
    private static void alterarPessoa(Scanner scanner) {
        System.out.print("Digite o ID da pessoa: ");
        String id = scanner.nextLine();
        for (int i = 0; i < contador; i++) {
            if (cadastro[i][0].equals(id)) {
                System.out.print("Novo nome: ");
                cadastro[i][1] = scanner.nextLine();
                System.out.print("Nova data de nascimento (dd/mm/aaaa): ");
                cadastro[i][2] = scanner.nextLine();
                System.out.println("Dados alterados com sucesso.");
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }

    // Consultar os dados
    private static void consultarPessoa(Scanner scanner) {
        System.out.print("Digite o ID da pessoa: ");
        String id = scanner.nextLine();
        for (int i = 0; i < contador; i++) {
            if (cadastro[i][0].equals(id)) {
                System.out.println("ID: " + cadastro[i][0]);
                System.out.println("Nome: " + cadastro[i][1]);
                System.out.println("Data de Nascimento: " + cadastro[i][2]);
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }

    // Excluir os dados
    private static void excluirPessoa(Scanner scanner) {
        System.out.print("Informe o ID da pessoa a ser excluída: ");
        String id = scanner.nextLine();
        for (int i = 0; i < contador; i++) {
            if (cadastro[i][0].equals(id)) {
                // Move os dados para cima para preencher o espaço
                for (int j = i; j < contador - 1; j++) {
                    cadastro[j] = cadastro[j + 1];
                }
                cadastro[contador - 1] = null; // Limpa a última posição
                contador--;
                System.out.println("Dados excluídos com sucesso.");
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }
}
