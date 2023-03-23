package com.generation.ch23.app.control;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.generation.ch23.app.model.Libro;
import com.generation.ch23.app.repos.LibrosRep;

@RestController
public class LibroContr {
	@Autowired
	LibrosRep libroRepo;
	@RequestMapping("/libros")
	List<Libro> listarTodo(){
		return libroRepo.listarLibros();
	}
}
