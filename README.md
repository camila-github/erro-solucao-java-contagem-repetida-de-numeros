## Exercicio (Java): Contagem repetida de números

O exercicio publicado é referente ao treinamento do Bootcamp Java - Aritméticos em Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Neste desafio sua tarefa será ler vários números e em seguida dizer quantas vezes cada número aparece, ou seja, deve-se escrever cada um dos valores distintos que aparecem na entrada por ordem crescente de valor.

#### Entrada: 

A primeira linha de entrada contem um único inteiro N, que indica a quantidade de valores que serão lidos para X (1 ≤ N ≤ 2000) logo em seguida. Com certeza cada número não aparecerá mais do que 20 vezes na entrada de dados.

#### Saída: 

Imprima a saída de acordo com o exemplo fornecido abaixo, indicando quantas vezes cada um deles aparece na entrada por ordem crescente de valor.

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
7 | 4 aparece 1 vez(es)
8 | 8 aparece 2 vez(es)
10 | 10 aparece 3 vez(es)
8 | 260 aparece 1 vez(es)
260
4
10
10 
 

#### Java　

```java
//SOLUCAO 1

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class ContagemRepetidaDeNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
		
		int entradaDados = sc.nextInt();
		
		while(entradaDados --> 0)	listaDeNumeros.add(sc.nextInt());
		
		SortedMap<Integer, Integer> contaQuantidade = new TreeMap<>();
		
		listaDeNumeros.forEach( numforEach -> 
		  contaQuantidade.compute(numforEach, (index , num) -> (num == null ? 1 : num  + 1))
		);
		
		contaQuantidade.entrySet().forEach( numforEach -> {
			System.out.printf("%d aparece %d vez(es)\n", numforEach.getKey(), numforEach.getValue());  
		});
		
		sc.close();
	}
}
```

