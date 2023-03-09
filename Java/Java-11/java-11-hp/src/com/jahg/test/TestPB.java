package com.jahg.test;
import com.jahg.clases.AlumnoB;
import com.jahg.clases.PersonaP;

public class TestPB {
	public static void main(String[] args) {
		AlumnoB a = new AlumnoB(123,8.5,"Armando",20);
		PersonaP p = new PersonaP("maria",33);
		System.out.println(p.getEdad());
		System.out.println(p.getNombre());
		System.out.println(a.getEdad());
		System.out.println(a.getMatricula());
	}
}
