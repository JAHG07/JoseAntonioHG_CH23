package com.generation.jahg.mains;

import com.generation.jagh.clases.AreaPerimetro;
import com.generation.jagh.clases.GeometricFigure;

public class TestAP {

	public static void main(String[] args) {
		AreaPerimetro ap = new AreaPerimetro();
		GeometricFigure fg = new GeometricFigure();
		fg.setArea(ap.area(5));
		System.out.println("--->" + fg.getArea());
		ap.areaTri(5, 5);
		ap.permTri(5, 5, 5);
		fg.setArea(ap.areaCirculo(5));
		System.out.println("--->" + fg.getArea());
	}

}
