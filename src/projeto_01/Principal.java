package projeto_01;

import java.util.Scanner;

public class Principal {

    // Cores
    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String RED = "\u001B[31m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TarefaDiaria tarefaDia = new TarefaDiaria();

        while (true) {

            Animacao.titulo();

            System.out.println(GREEN + "1 - Inserir Nova Tarefa" + RESET);
            System.out.println(BLUE + "2 - Visualizar Tarefas" + RESET);
            System.out.println(YELLOW + "3 - Remover Tarefa" + RESET);
            System.out.println(BLUE + "4 - Ordenar Tarefas" + RESET);
            System.out.println(RED + "5 - Sair" + RESET);
            System.out.println("--------------------------");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a nova tarefa: ");
                    tarefaDia.adicionarTarefa(sc.nextLine());
                    pausa();
                    break;

                case 2:
                    tarefaDia.exibirTarefas();
                    pausa();
                    break;

                case 3:
                    System.out.print("Número da tarefa: ");
                    tarefaDia.removerTarefa(sc.nextInt() - 1);
                    sc.nextLine();
                    pausa();
                    break;

                case 4:
                    tarefaDia.ordenarTarefas();
                    pausa();
                    break;

                case 5:
                    System.out.println(RED + "Encerrando o sistema..." + RESET);
                    sc.close();
                    return;

                default:
                    System.out.println(RED + "Opção inválida!" + RESET);
                    pausa();
            }
        }
    }

    private static void pausa() {
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
