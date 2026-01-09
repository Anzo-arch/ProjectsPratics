package projeto_01;

public class Animacao {

    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    public static final String BOLD = "\u001B[1m";

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void digitarTexto(String texto, int delay) {
        for (char c : texto.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    public static void titulo() {
        limparTela();
        System.out.println(BOLD + CYAN);
        digitarTexto("=== Sistema de Tarefas ===", 60);
        System.out.println(RESET);
    }
}
