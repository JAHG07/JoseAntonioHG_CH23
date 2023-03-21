package lp8;

import java.util.Scanner;
import java.util.*;

public class Lp8 {
	public static<T> List<T> reverseList(List<T> list)
    {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }

	public static void main(String[] args) {
		int vector[]=new int [10];
		//int vetorPrim[] = new int [10];
		LinkedList<Integer> li = new LinkedList<>();
		LinkedList<Integer> lis = new LinkedList<>();
		LinkedList<Integer> lista = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Hoal parsero");
		for (int i = 0; i < vector.length; i++) {
			System.out.print("Dame un numeo");
		    vector[i] = sc.nextInt();
		}
		 for(int i=0; i< vector.length ; i++){
			 int div = 0;
			 for(int j = 1 ; j <= vector[i] ; j++) {
				 if(vector[i]%j==0) {div++;}
			 }
			 if(div==2) {
				 System.out.println("Numero primo : "+vector[i]);
				 li.push(vector[i]);
				 }else {lis.push(vector[i]);}
			 
	     }
		 List<Integer> reverse = reverseList(li);
		 List<Integer> reverses = reverseList(lis);
		 System.out.println(reverse);
		 System.out.println(reverses);
		 lista.addAll(reverse);
		 lista.addAll(reverses);
		 System.out.println(lista);
		sc.close();
	}

}
