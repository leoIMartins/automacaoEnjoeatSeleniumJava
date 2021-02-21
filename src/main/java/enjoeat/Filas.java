package enjoeat;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Filas {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Juliana");
		fila.add("Pedro");
		fila.add("Carlos");
		fila.add("Larissa");
		fila.add("João");
		
		Iterator<String> iteratorFila = fila.iterator();
		
		while (iteratorFila.hasNext()) {
			System.out.println("--->" + iteratorFila.next());
		}
		
		System.out.println("\nPrimeiro: " + fila.element());
		
		System.out.println("\nRemovido: " + fila.poll());
		
		fila.add("Daniel");
		
		for (String pessoa: fila) {
			System.out.println(pessoa);
		}
		
		System.out.println("\nTamanho: " + fila.size());
		System.out.println("\nFila vazia?: "+ fila.isEmpty());
		System.out.println("\nContém Carlos?: " + fila.contains("Carlos"));
	}

}
