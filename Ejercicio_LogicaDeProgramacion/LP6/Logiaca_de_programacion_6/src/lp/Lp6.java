package lp;

import java.util.Scanner;

public class Lp6 {
	public static void main(String[] args) {
		System.out.println("Dame un dato : ");
		Scanner sc = new Scanner(System.in);
		String dato = sc.next();
		String cadenainverdida = "";
		for(int i = dato.length()-1 ; i>=0 ; i--) {
			cadenainverdida += dato.charAt(i); 
		}
		System.out.println(cadenainverdida);
		sc.close();
	}
}
