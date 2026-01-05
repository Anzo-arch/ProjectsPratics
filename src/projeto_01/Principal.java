package projeto_01;

import java.util.Scanner;

public class Principal {

    // Códigos ANSI
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String CYAN = "\u001B[36m";
    private static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TarefaDiaria tarefaDia = new TarefaDiaria();

        while (true) {

            System.out.println(BLUE + "------------------" + RESET);
            System.out.println(BOLD + CYAN + " Sistema de Tarefas" + RESET);
            System.out.println(BLUE + "------------------" + RESET);

            System.out.println(GREEN + "1 - Inserir Nova Tarefa" + RESET);
            System.out.println(CYAN + "2 - Visualizar Tarefas" + RESET);
            System.out.println(YELLOW + "3 - Remover Tarefa" + RESET);
            System.out.println(BLUE + "4 - Ordenar Tarefas" + RESET);
            System.out.println(RED + "5 - Sair" + RESET);

            System.out.println(BLUE + "------------------" + RESET);
            System.out.print(BOLD + "Informe a opção desejada: " + RESET);

            int opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print(CYAN + "Informe uma nova tarefa: " + RESET);
                    String novaTarefa = sc.nextLine();
                    tarefaDia.adicionarTarefa(novaTarefa);
                    break;

                case 2:
                    tarefaDia.exibirTarefas();
                    break;

                case 3:
                    System.out.print(YELLOW + "Informe o número da tarefa para remover: " + RESET);
                    int indice = sc.nextInt();
                    sc.nextLine();
                    tarefaDia.removerTarefa(indice - 1);
                    break;

                case 4:
                    tarefaDia.ordenarTarefas();
                    break;

                case 5:
                    System.out.println(RED + "Saindo do sistema..." + RESET);
                    sc.close();
                    return;

                default:
                    System.out.println(RED + "Opção inválida!" + RESET);
                    break;
            }
        }
    }
}
