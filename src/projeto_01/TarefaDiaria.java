package projeto_01;

import java.util.ArrayList;
import java.util.Collections;

public class TarefaDiaria {

    private ArrayList<String> tarefas;

    // Códigos ANSI
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String CYAN = "\u001B[36m";
    private static final String BOLD = "\u001B[1m";

    public TarefaDiaria() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
        System.out.println(GREEN + "✔ Tarefa adicionada com sucesso!" + RESET);
    }

    public void exibirTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println(YELLOW + "⚠ Nenhuma tarefa cadastrada." + RESET);
            return;
        }

        System.out.println(BOLD + BLUE + "\n📋 Lista de Tarefas:" + RESET);
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(CYAN + (i + 1) + " - " + RESET + tarefas.get(i));
        }
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            String removida = tarefas.remove(indice);
            System.out.println(RED + "🗑 Tarefa \"" + removida + "\" removida com sucesso!" + RESET);
        } else {
            System.out.println(RED + "✖ Índice inválido. Nenhuma tarefa removida." + RESET);
        }
    }

    public void ordenarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println(YELLOW + "⚠ Nenhuma tarefa para ordenar." + RESET);
            return;
        }

        Collections.sort(tarefas);
        System.out.println(GREEN + "🔤 Tarefas ordenadas em ordem alfabética." + RESET);
    }
}
