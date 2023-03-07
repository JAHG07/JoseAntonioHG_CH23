package com.generation.jahg.mains;
import com.generation.jagh.clases.Taco;
import com.generation.jagh.clases.TacoMth;

public class TestTaco {
	public static void main(String[] args) {
	
		Taco tc = new Taco();
		Taco ts = new Taco();
		
		tc.setTipoTaco("Pastor");
		tc.setGuisado("NEL");
		tc.setNumTortillas(2);
		tc.setTamTort("Grande");
		tc.setPrecio(18);
		
		ts.setTipoTaco("adobada");
		ts.setGuisado("NEL");
		ts.setNumTortillas(1);
		ts.setTamTort("Mediano");
		ts.setPrecio(15);
		
		System.out.println("Guisado :"+tc.getGuisado()+" Tipo de taco :"+tc.getTipoTaco()+" Numero de tortillas "+tc.getNumTortillas()+" Precio :"+tc.getPrecio());
		System.out.println("Guisado :"+ts.getGuisado()+" Tipo de taco :"+ts.getTipoTaco()+" Numero de tortillas "+ts.getNumTortillas()+" Precio :"+ts.getPrecio());
		
		TacoMth tm = new TacoMth();
		tm.preparar("Choriso");
		System.out.println(tc.getTipoTaco());
		
	}
}
