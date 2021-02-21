package enjoeat;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {

		Map<String, String> estados = new HashMap<>();
		
		estados.put("SP", "São Paulo");
		estados.put("RJ", "Rio de Janeiro");
		estados.put("MG", "Minas Gerais");
		estados.put("DF", "Distrito Federal");
		estados.put("MS", "Mato Grosso do Sul");
		estados.put("SC", "Santa Catarina");
		estados.put("MA", "Maranhão");
		
		for (String key : estados.keySet()) {
			System.out.println(key + "--" + estados.get(key));
		}
		
		estados.remove("MG");
		
		for (String key : estados.keySet()) {
			System.out.println("--" + key + "--" + estados.get(key));
		}
		
		System.out.println("\nTamanho: " + estados.size());
		
		estados.remove("MS", "Mato Grosso do Sul");
		
		for (String key : estados.keySet()) {
			System.out.println("--" + key + "--" + estados.get(key));
		}
		System.out.println();
		for (String key : estados.keySet()) {
			System.out.println(estados.get(key) + "(" + key + ")");
		}
		
		System.out.println("SC existe?: " + estados.containsKey("SC"));
		System.out.println("Maranhão existe?: " + estados.containsValue("Maranhão"));
		System.out.println(estados.get("Maranhão"));
	}

}
