package projeto_01;

import java.util.ArrayList;
import java.util.Collections;

public class TarefaDiaria {

    private ArrayList<String> tarefas;

    public TarefaDiaria() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
        System.out.println("✅ Tarefa adicionada com sucesso!");
    }

    public void exibirTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("📭 Nenhuma tarefa cadastrada.");
            return;
        }

        System.out.println("📋 Lista de Tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + " - " + tarefas.get(i));
        }
    }

    public void removerTarefa(int indice) {
        if (indice < 0 || indice >= tarefas.size()) {
            System.out.println("❌ Número de tarefa inválido!");
            return;
        }

        tarefas.remove(indice);
        System.out.println("🗑️ Tarefa removida com sucesso!");
    }

    public void ordenarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("⚠️ Não há tarefas para ordenar.");
            return;
        }

        Collections.sort(tarefas);
        System.out.println("🔤 Tarefas ordenadas com sucesso!");
    }
}
