import java.util.Scanner;

public class LP7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String d;
		String h;
		String m;
		boolean val = false;
		do{
			System.out.println("Dame el dia L-V(en numero): ");
			d = sc.next();
			System.out.println("Dame la hora en 24 hr :");
			h = sc.next();
			System.out.println("Dame los minutos :");
			m = sc.next();
			int dia = Integer.parseInt(d);
            int hora = Integer.parseInt(h);
            int minuto = Integer.parseInt(m);
            int total = 0;
            int fin = 8100;
            if(dia<=5 && hora<=24 && minuto<60) {
            	total = (dia*24*60)+(hora*60)+(minuto);
                System.out.println("Faltan :"+(fin-total)+" Para el fin de semana");
                val = false;
            }
            else {
            	val = true;
            }
            
		}while(!Auxiliar.isNumeric(d,h,m)||val==true);
		sc.close();
	}
}
