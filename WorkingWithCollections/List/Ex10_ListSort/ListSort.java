package WorkingWithCollections.List.Ex10_ListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort{
	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>(){{
			add(new Gato("Jon", 18, "preto"));
			add(new Gato("Simba", 6, "marrom"));
			add(new Gato("Jon", 12, "amarela"));
		}};
		
		System.out.println("--|Imprimir por ordem de inserção|--");
		System.out.println(meusGatos);
		
		System.out.println("--|Imprimir em ordem aleatoria|--");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);

		System.out.println("Mostre os gatos em ordem alfabética");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);

		System.out.println("Mostre os gatos por ordem de idade");
		Collections.sort(meusGatos, new ComparatorIdade()); //recebe a lista e o comparator
		//meusGatos.sort(ComparatorIdade());
		System.out.println(meusGatos);

		System.out.println("Por ordem de cor");
		Collections.sort(meusGatos, new ComparatorCor());
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);

		System.out.println("Por ordem de nome/cor/idade");
		Collections.sort(meusGatos, new ComparatorNomeCorIdade());
		//meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
	}
}
