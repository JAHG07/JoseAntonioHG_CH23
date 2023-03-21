
public class Auxiliar {
	 static boolean isNumeric(String a, String b,String c){
	        try {
	                Integer.parseInt(a);
	                Integer.parseInt(b);
	                Integer.parseInt(c);
	                return true;
	        } catch (NumberFormatException nfe){
	                return false;
	        }
	    }
}
