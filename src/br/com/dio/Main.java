package br.com.dio;

public class Main {
    public static void main(String[] args) {
        Sudoku jogo = new Sudoku();

        System.out.println("Tabuleiro inicial:");
        jogo.imprimirTabuleiro();

        // Jogadas de teste
        realizarJogada(jogo, 2, 1, 6); // válida
        realizarJogada(jogo, 0, 1, 1); // inválida
//        realizarJogada(jogo, 1, 1, 7); // inválida
//        realizarJogada(jogo, 2, 0, 7); // inválida
//        realizarJogada(jogo, 4, 4, 2); // inválida
//        realizarJogada(jogo, 5, 0, 4); // válida
//        realizarJogada(jogo, 6, 5, 3); // válida
//        realizarJogada(jogo, 8, 6, 9); // válida

    }

    private static void realizarJogada(Sudoku jogo, int linha, int coluna, int valor) {
        System.out.printf("Tentando inserir %d na posição (%d, %d)...%n", valor, linha, coluna);
        ResultadoJogada resultado = jogo.inserirNumero(linha, coluna, valor);
        exibirResultado(resultado);

        if (resultado == ResultadoJogada.SUCESSO) {
            jogo.imprimirTabuleiro(); // Mostrar o tabuleiro atualizado
        }
    }

    private static void exibirResultado(ResultadoJogada resultado) {
        switch (resultado) {
            case SUCESSO:
                System.out.println("✅ Número inserido com sucesso!");
                break;
            case POSICAO_OCUPADA:
                System.out.println("❌ Não é possível inserir: posição já preenchida.");
                break;
            case JOGADA_INVALIDA:
                System.out.println("❌ Jogada inválida: número conflita com regras do Sudoku.");
                break;
        }
        System.out.println("--------------------------------------------------\n");
    }
}
