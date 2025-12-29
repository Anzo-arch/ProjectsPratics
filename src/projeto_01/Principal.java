package projeto_01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TarefaDiaria tarefaDia = new TarefaDiaria();

        while (true) {
            System.out.println("------------------");
            System.out.println("Sistema de Tarefas");
            System.out.println("------------------");
            System.out.println("1 - Inserir Nova Tarefa");
            System.out.println("2 - Visualizar Tarefas");
            System.out.println("3 - Remover Tarefa");
            System.out.println("4 - Ordenar Tarefas");
            System.out.println("5 - Sair");
            System.out.println("------------------");
            System.out.print("Informe a opção desejada: ");

            int opcao = sc.nextInt();
            sc.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Informe uma nova tarefa: ");
                    String novaTarefa = sc.nextLine();
                    tarefaDia.adicionarTarefa(novaTarefa);
                    break;

                case 2:
                    tarefaDia.exibirTarefas();
                    break;

                case 3:
                    System.out.print("Informe o número da tarefa para remover: ");
                    int indice = sc.nextInt();
                    sc.nextLine();
                    tarefaDia.removerTarefa(indice - 1);
                    break;

                case 4:
                    tarefaDia.ordenarTarefas();
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
