package br.com.dio;

class Sudoku {
    private int[][] tabuleiro = {
            {1, 0, 0, 4, 8, 9, 0, 0, 6},
            {7, 3, 0, 0, 0, 0, 0, 4, 0},
            {0, 0, 0, 0, 0, 1, 2, 9, 5},
            {0, 0, 7, 1, 2, 0, 6, 0, 0},
            {5, 0, 0, 7, 0, 3, 0, 0, 8},
            {0, 0, 6, 0, 9, 5, 7, 0, 0},
            {9, 1, 4, 6, 0, 0, 0, 0, 0},
            {0, 2, 0, 0, 0, 0, 0, 3, 7},
            {8, 0, 0, 5, 1, 2, 0, 0, 4}
    };


    public ResultadoJogada inserirNumero(int linha, int coluna, int valor) {

        if (tabuleiro[linha][coluna] != 0) {
            return ResultadoJogada.POSICAO_OCUPADA;
        }

        if (podeInserirNumero(linha, coluna, valor)) {
            tabuleiro[linha][coluna] = valor;
            return ResultadoJogada.SUCESSO;
        } else {
            return ResultadoJogada.JOGADA_INVALIDA;
        }
    }

    public boolean podeInserirNumero(int linha, int coluna, int valor) {
        // Verifica a linha
        for (int j = 0; j < 9; j++) {
            if (tabuleiro[linha][j] == valor) {
                return false;
            }
        }

        // Verifica a coluna
        for (int i = 0; i < 9; i++) {
            if (tabuleiro[i][coluna] == valor) {
                return false;
            }
        }

        // Verifica o quadrante 3x3
        int inicioLinha = (linha / 3) * 3;
        int inicioColuna = (coluna / 3) * 3;

        for (int i = inicioLinha; i < inicioLinha + 3; i++) {
            for (int j = inicioColuna; j < inicioColuna + 3; j++) {
                if (tabuleiro[i][j] == valor) {
                    return false;
                }
            }
        }

        return true;
    }

    public void imprimirTabuleiro() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("------+-------+------");
            }

            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }

                if (tabuleiro[i][j] == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print(tabuleiro[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}