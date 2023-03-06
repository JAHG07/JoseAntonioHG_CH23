package colecciones.jahg;
import java.util.*;
public class MCJ {
 public static void main(String[] args) {
	//MisCollection c = new Miscollection();
	wrapperClass();
	listas();
	setcollection();
	mapCollection();
}
 
 static Set setcollection() {
	 Set miSet = new HashSet();
	 miSet.add("uno");
	 miSet.add("dos");
	 miSet.add("tres");
	 miSet.add("cuatro");
	 miSet.add("cinco");
	 System.out.println(miSet.isEmpty());
	 Object a[] = miSet.toArray();
	 System.out.println(a);
	return miSet;
 }
 
 static List listas() {
	 List miLista = new ArrayList();
	 System.out.println("Tmano de lista " + miLista);
	 miLista.add(1);
	 miLista.add(2);
	 miLista.add(3);
	 miLista.add(0,"Pato");
	 System.out.println("Tmano de lista " + miLista);
	 System.out.println(miLista.size());
	 miLista.set(0, miLista);
	 miLista.remove(0);
	 System.out.println(miLista);
	 return miLista;
	 
 }
 
 private static Map mapCollection() {
	 Map miMap = new HashMap();
	 miMap.put("valor1", "Juan");
	 miMap.put("valor2", "Maria");
	 miMap.put("valor3", "Pedro");
	 miMap.put("valor4", "Jose");
	 System.out.println(miMap);
	 System.out.println(miMap.values());
	 System.out.println(miMap.keySet());
	 miMap.remove("valor3");
	 return miMap;
 }
 
 private static void imprimir(Collection collection) {	
	 for(Object elementos : collection) {
		 System.out.println("elementos " + elementos);
		 
	 }
 }
 
 
 static void wrapperClass() {
	 /*
	 //byte numero = 127;
	 System.out.println("Tamaño del byte "+Byte.SIZE);
	 System.out.println("Valor maximmo " + Byte.MAX_VALUE);
	 System.out.println("Valor maximmo " + Byte.MIN_VALUE);
	 //int numeroI = -2147483648;
	 System.out.println("Tamaño del Integer "+Integer.BYTES);
	 System.out.println("Tamaño del Integer "+Integer.SIZE);
	 System.out.println("Valor maximmo " + Integer.MAX_VALUE);
	 System.out.println("Valor maximmo " + Integer.MIN_VALUE);
	 
	 System.out.println("Tamaño del Short "+Short.BYTES);
	 System.out.println("Tamaño del Short "+Short.SIZE);
	 System.out.println("Valor maximmo " + Short.MAX_VALUE);
	 System.out.println("Valor maximmo " + Short.MIN_VALUE);
	 
	 System.out.println("Tamaño del Long "+Long.BYTES);
	 System.out.println("Tamaño del Long "+Long.SIZE);
	 System.out.println("Valor maximmo " + Long.MAX_VALUE);
	 System.out.println("Valor maximmo " + Long.MIN_VALUE);
	 
	 System.out.println("Tamaño del Float "+Float.BYTES);
	 System.out.println("Tamaño del Float "+Float.SIZE);
	 System.out.println("Valor maximmo " + Float.MAX_VALUE);
	 System.out.println("Valor maximmo " + Float.MIN_VALUE);
	 
	 System.out.println("Tamaño del Double "+Double.BYTES);
	 System.out.println("Tamaño del Double " + Double.SIZE);
	 System.out.println("Valor maximmo " + Double.MAX_VALUE);
	 System.out.println("Valor maximmo " + Double.MIN_VALUE);
	 */
}
}
