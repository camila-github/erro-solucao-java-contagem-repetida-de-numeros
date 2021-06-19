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