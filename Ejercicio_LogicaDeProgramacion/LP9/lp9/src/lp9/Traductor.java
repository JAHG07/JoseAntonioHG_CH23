package lp9;
import java.util.*;

public class Traductor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> Translate = new HashMap<>();
		Boolean val = false;
		Translate.put("Gato", "cat");
		Translate.put("Perro", "dog");
		Translate.put("Rata", "rat");
		Translate.put("Conejo", "rabbit");
		Translate.put("Elefante", "elephant");
		Translate.put("Caballo", "Horse");
		Translate.put("Pollo", "chiken");
		Translate.put("Pajaro", "parrot");
		Translate.put("Gallina", "hen");
		Translate.put("Vaca", "cow");
		Translate.put("Toro", "bull");
		Translate.put("Zorro", "fox");
		Translate.put("Ballena", "whale");
		Translate.put("Burro", "donkey");
		do {
			System.out.println("Dame una palabra :");
			String dato = sc.next();
			if(Translate.containsKey(dato)) {
				System.out.println(Translate.get(dato));
				val = false;
			}else {
				val = true;
				System.out.println("La palabra no esta prro");
			}
		}while(val);
		
		sc.close();
	}

}
