package enjoeat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Listas {
	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		nomes.set(2, "Roberto");
		
		for (String nome : nomes) {
			System.out.println("-----" + nome);
		}
		
		System.out.println(nomes.get(0));
		nomes.remove(3);
		
		for (String nome : nomes) {
			System.out.println("-----" + nome);
		}
		
		nomes.remove("João");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("Quantidade de nomes: " + nomes.size());
		
		System.out.println("\nJuliano existe na lista?: " + nomes.contains("Juliano"));
		
		List<String> nomes2 = new ArrayList<>();
		nomes2.add("Ismael");
		nomes2.add("Rodrigo");

		for (String nome : nomes2) {
			System.out.println(nome);
		}

		nomes.addAll(nomes2);
		
		for (String nome : nomes) {
			System.out.println("-----" + nome);
		}
		
		Collections.sort(nomes);
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("A lista está vazia?: " + nomes.isEmpty());
		nomes.set(3, "Larissa");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		nomes.addAll(nomes);
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
}
