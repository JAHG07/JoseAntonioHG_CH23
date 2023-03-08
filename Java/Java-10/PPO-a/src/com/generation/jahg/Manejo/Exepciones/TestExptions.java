package com.generation.jahg.Manejo.Exepciones;

public class TestExptions {
	public static void main(String[] args) {
		try {
			Sivision d = new Sivision(4, 2);
		}catch(OpExceptions e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		//System.out.println("Continua la ejecucion");
	}
}
