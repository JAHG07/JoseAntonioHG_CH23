package com.jahg.clases;

public class AlumnoB {
	private int matricula;
	private double promedio;
	public AlumnoB() {
		super();
	}
	public AlumnoB(int matricula, double promedio) {
		super();
		this.matricula = matricula;
		this.promedio = promedio;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	@Override
	public String toString() {
		return "AlumnoB [matricula=" + matricula + ", promedio=" + promedio + "]";
	}
	
}
