# Dia 3

## Parte 1

### Explicação
Somar todos os números emaranhados entre os pontos, que estejam ao lado, seja horizontal, vertical ou diagonal à um símbolo.
Exemplo:

467..114..
...*......
..35..633.
......#...
617*......
.....+.58.
..592.....
......755.
...$.*....
.664.598..

Nesse exemplo, dois números não podem ser somados pois eles não estão adjacentes à um símbolo: 114 (no topo à direita) e 58 (no centro à direita). Todos os outros números estão adjacentes à um símbolo, pois então, são adicionados a soma; o resultado final é 4361.

Dica: O tamanho do input é 140x140; o tamanho do input de exemplo é 10x10.

### Resultado (e tentativas incorretas)
531932 É O CORRETO.

## Parte 2

### Explicação
Multiplicar e somar partes de números adjacentes a engrenagens. Engrenagens são asteriscos (\*) adjacentes à duas partes de números. Pegando o exemplo anterior:

467..114..
...*......
..35..633.
......#...
617*......
.....+.58.
..592.....
......755.
...$.*....
.664.598..

O resultado seria 16.345 (467 * 35) + 451.490 (755 * 598) = 467.835

### Resultado
