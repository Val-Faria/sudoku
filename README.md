# 🧩 Desafio Sudoku em Java

Este projeto consiste em uma aplicação Java que simula um jogo de Sudoku. O jogador pode tentar inserir números no tabuleiro, e o sistema valida se a jogada é válida conforme as regras do jogo.

## ✅ Funcionalidades

- Exibição do tabuleiro inicial
- Inserção de números pelo jogador
- Validação automática:
  - Conflitos na linha
  - Conflitos na coluna
  - Conflitos no bloco 3x3
  - Posição já ocupada
- Mensagens informativas para jogadas válidas e inválidas

## 📁 Estrutura do Projeto

src/
├── br/com/dio/model/ // Classe Sudoku
├── br/com/dio/enum/ // Enum ResultadoJogada
└── br/com/dio/teste/ // Classe principal SudokuApp


## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/sudoku-java.git
2. Importe o projeto em uma IDE Java (como IntelliJ ou Eclipse).

3. Execute a classe SudokuApp.

##💡 Exemplo de saída
Tentando inserir 6 na posição (1, 2)...
❌ Jogada inválida: número conflita com regras do Sudoku.

## 🛠 Tecnologias
Java 20+

IDE: IntelliJ IDEA (recomendado)

