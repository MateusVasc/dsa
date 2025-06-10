#  Recursão (⌐■_■)

## Introdução (´｡• ᵕ •｡`)

Recursão é uma técnica de programação onde uma função chama a si mesma para resolver subproblemas menores de um problema maior. Em vez de usar estruturas iterativas como `for` ou `while`, a recursão resolve problemas através de repetições implícitas via chamadas de função.


Exemplos típicos: cálculo de fatorial, sequência de Fibonacci, algoritmos de ordenação como *merge sort*, problemas de backtracking como o das N-Rainhas.

---

## Como funciona a recursão (☞ﾟヮﾟ)☞

Para que uma função recursiva funcione corretamente, ela precisa de dois componentes:

1. **Caso base** – a condição de parada, que não faz uma chamada recursiva.
2. **Caso recursivo** – onde a função se chama novamente, movendo-se em direção ao caso base.

Exemplo em pseudocódigo – *Fatorial*:

```text
fatorial(n):
    se n == 0:
        retorne 1
    senão:
        retorne n * fatorial(n - 1)
```

Chamadas aninhadas formam uma `pilha de execução (call stack)`. Cada chamada fica "em pausa" até que a seguinte termine.

## Tracing de Funções Recursivas (⊙﹏⊙)

Quando executamos uma função recursiva, é essencial entender como ela entra e sai de cada chamada. Isso é chamado de `tracing`.

Durante o tracing, o fluxo recursivo tem dois momentos importantes:

- 🕐 Calling Time: quando a função chama a si mesma, avançando para o caso base.
- 🕑 Returning Time: quando a função volta das chamadas anteriores, resolvendo os resultados e retornando os valores.

Esses dois momentos acontecem em ordens opostas:

| Etapa          | Descrição                                          | Ordem de execução |
|----------------|----------------------------------------------------|-------------------|
| Calling Time   | Descendo na recursão (função chama a si mesma)     | Topo → fundo      |
| Returning Time | Subindo da recursão (retornos começam a acontecer) | Fundo → topo      |

## Desenho do fluxo recursivo (pauzinhos style) (งツ)ว

Traçando o fluxo de chamadas para fatorial(3):

```css
Chamada:           Ação:
fatorial(3)  --->  3 * fatorial(2)
  |
  v
fatorial(2)  --->  2 * fatorial(1)
  |
  v
fatorial(1)  --->  1 * fatorial(0)
  |
  v
fatorial(0)  --->  1 (caso base) ⬅️ ⬅️ ⬅️ ⬅️

⤴️ Retornos começam aqui!

fatorial(1)  = 1 * 1   = 1
fatorial(2)  = 2 * 1   = 2
fatorial(3)  = 3 * 2   = 6
```

Em formato de árvore:

```css
fatorial(3)
│
└── fatorial(2)
    │
    └── fatorial(1)
        │
        └── fatorial(0)

```

Calling e Returning:

```css
Calling time:
  fatorial(3)
    ↓
  fatorial(2)
    ↓
  fatorial(1)
    ↓
  fatorial(0)

Returning time:
  fatorial(0) → 1
  fatorial(1) → 1 * 1 = 1
  fatorial(2) → 2 * 1 = 2
  fatorial(3) → 3 * 2 = 6
```