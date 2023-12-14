# Dia 1
https://adventofcode.com/2023/day/1

## Parte 1 - Explicação
Objetivo do programa: ler diversas cadeias de texto com caracteres e números misturados, e ler apenas o último e o primeiro número de cada. Caso exista apenas um número ele repete duas vezes. Após ter feito isso em cada linha dessas sequências, some todos e você terá o resultado correto.

Exemplo dado:
1abc2
pqr3stu8vwx
a1b2c3d4e5f
treb7uchet

Como ele deve ser lido (e somado após):
1abc2 -----> 12
pqr3stu8vwx -----> 38
a1b2c3d4e5f ---------> 15
treb7uchet ----------> 77 (existe apenas um número 7, então ele repete como o primeiro da cadeia de caracteres e o último também)

Soma total: 12 + 38 + 15 + 77 = 142

Faça isso com a entrada dada do quebra-cabeça (o arquivo input).

Dica 1: seria mais simples criar um código que resolva o exemplo acima, e após diversos testes e apropriadas modificações, aplicá-lo ao problema dado.

## Parte 2 - Explicação
Com a primeira parte do problema feita, o objetivo agora é achar também os números literais (em inglês) digitados de acima.
Números em literal (em inglês) que devem ser considerados agora: one, two, three, four, five, six, seven, eight, e nine também contam como "digitos" válidos.

Exemplo dado:
two1nine
eightwothree
abcone2threexyz
xtwone3four
4nineeightseven2
zoneight234
7pqrstsixteen

Nesse exemplo a maneira pela qual os valores deveriam ser lidos seria:
two1nine			-> two + nine = 29 
eightwothree		-> eight + three = 83
abcone2threexyz 	-> one + three = 13
xtwone3four			-> two + four = 24
4nineeightseven2	-> 4 + 2 = 42
zoneight234			-> one + 4 = 14
7pqrstsixteen		-> 7 + 6 = 76
			Total	-> 281

Em exemplos de literais concatenados como "eighthree" e "sevenine" seriam 8, 3, e 7, 9. Os dois são considerados, tanto no começo, como no fim.

## Resultado
RESULTADO CORRETO DO MEU INPUT NA PARTE 1: ***55621***
RESULTADO CORRETO DO MEU INPUT NA PARTE 2: ***53592***