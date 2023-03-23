package com.generation.ch23.app.repos;

import java.util.*;
import org.springframework.stereotype.*;
import com.generation.ch23.app.model.Libro;

@Repository
public class LibrosRep {
	public List<Libro> listarLibros(){
		List<Libro> lista = new ArrayList<Libro>();
		lista.add(new Libro("SpringBoot","Luis","55211452"));
		lista.add(new Libro("Java","Roberto","8875111452"));
		lista.add(new Libro("C","Richard","7897888852"));
		lista.add(new Libro("JS","Gonzalo","4412255225"));
		return lista;
	}
}
