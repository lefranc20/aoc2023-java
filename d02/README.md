# Dia 2
https://adventofcode.com/2023/day/2

## Parte 1 - Explicação
Objetivo: um código que pegue a gravação de uma quantia de jogos fictícios de cubos e imprima a soma das IDs dos jogos possíveis.
Os cubos são de cores: vermelho (red), verde (green) e azul (blue).
As IDs são os números acompanhados pelos jogos (Game): Game 1 = 1, Game 2 = 2...
Cada jogo, possui uma quantidade sets, que são combinações separadas por ";".
A condição é de cada jogo não ultrapassar a quantia de: 12 cubos vermelhos, 13 cubos verdes e 14 cubos azuis.

Os jogos aparentam assim:
```
Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
```

No jogo 1 (Game 1), três combinações de cubo (sets) são revelados de uma mochila e colocados dentro dela novamente.

No exemplo acima, apenas os jogos 1, 2 e 5. Jogo 3 seria impossível, pois em um momento foram exibidos 20 cubos vermelhos; e jogo 4 também pois em um momentos foram mostrados 15 cubos azuis.
Após isso, adicionando a soma dos IDs dos jogos possíveis, você possui o resultado = 8

Agora, o objetivo é de realizar o mesmo com o input dado.

### Resposta(s)
Resposta incorreta: 1683 (VALOR MUITO BAIXO)
Resposta correta: 2377

Exemplo de código utilizando regex para destacar padrões. Tirado da página 441 de "The Java Workshop - A practical, no-nonsense guide to Java. (2020, Packt) (1).pdf"
``` java
package com.packt.java.chapter12;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Exercise2 {
	public static void main(String[] args) {
		String url = "https://www.packtpub.com/application-development/mastering-java-9";

		String regex = "(http[s])(?:://)([w]{0,3}\\.?[a-zA-Z]+\\.[a-zA-Z]{2,3})(?:[/])(.*)";
		System.out.println(regex);
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(url);
		boolean foundMatches = matcher.find();

		if (foundMatches) {
			String protocol = matcher.group(1);
			String domain = matcher.group(2);
			String path = matcher.group(3);	

			System.out.println("Protocol: " + protocol);
			System.out.println("domain: " + domain);
			System.out.println("Path: " + path);
		}
	}
}
```

## Parte 2 - Explicação
Objetivo: verificar em cada jogo jogado, a menor quantia de cubos de cada cor que poderiam estar dentro da mochila para fazer o jogo possível.

```
Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
```

- Jogo 1: o jogo poderia ter sido possível jogado com uma quantia mínima de 4 vermelhos, 2 verdes, e 6 cubos azuis. Se qualquer cor fosse menor que apenas 1 cubo, o jogo seria impossível.
- Jogo 2: poderia ser jogado com um mínimo de 1 vermelho, 3 verdes e 4 cubos azuis
- Jogo 3: poderia ser jogado com no mínimo 20 vermelhos, 13 verdes e 6 cubos azuis.
- Jogo 4: requer no mínimo 14 vermelho, 3 verdes, e 15 cubos azuis.
- Jogo 5: mínimo de 6 vermelhos, 3 verdes, e 2 cubos azuis na mochila

O **poder** de um set de cubos é igual ao número de vermelho, verde e azuis (da menor quantidade do jogo possível) multiplicados juntos. O poder mínimo de um set de cubos no primeiro jogo é 48 (4 vermemelhos * 6 azuis * 2 verdes). Nos jogos de 2-5 foram, respectivamente: 12, 1560, 630 e 36. Adicionando esses 5 poderes nos totalizam com a soma de 2286.

Para cada jogo, encontre o set mínimo de cubos que poderiam estar presentes. Qual a soma do poder desses sets?

Objetivo simplificado: ver qual a ***maior*** quantia de cada tipo de cor de cubo em um jogo, multiplicar os seus valores e armazenar em um vetor **poder**. Feito isso com todos os jogos, fazer um repetidor que armazena a soma de um vetor com todos esses valores inteiros.
 
Nota: Os jogos **NÃO** precisam ser ganháveis para o cálculo do poder de cada. Também não é necessário mostrar a resposta da primeira parte.
 
### Resposta(s)

Resposta Incorreta: 12078 (valor demasiado baixo)
Resposta Correta (no meu input): 71220