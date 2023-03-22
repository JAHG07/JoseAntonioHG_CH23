import java.io.*;
import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for (int i = 0; i < numero; i++) {
            int numero1 = sc.nextInt();
            int numero2 = sc.nextInt();
            int numero3 = sc.nextInt();
            for (int j = 0; j < numero3; j++) {
                numero1 += numero2 * (int) Math.pow(2, j);
                System.out.print(numero1 + " ");
            }
            System.out.println();
        }
    }
}
