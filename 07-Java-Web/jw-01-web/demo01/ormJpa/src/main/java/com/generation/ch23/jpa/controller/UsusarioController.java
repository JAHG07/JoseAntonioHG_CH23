package com.generation.ch23.jpa.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.generation.ch23.jpa.models.UsuarioModel;
import com.generation.ch23.jpa.services.UsusariosServices;


@RestController
@RequestMapping("/usuario")
public class UsusarioController {
	@Autowired
	UsusariosServices usuariosService;
	@DeleteMapping(path = "{id}")
	public String eliminarUsuario(@PathVariable ("id") Long id) {
		boolean eliminar = usuariosService.eliminarUsuario(id);
		if(eliminar) {
			return "Se elinimo el usuario";
		}
		else { return "No se elinimo el usuario";}
	}
	
	@GetMapping()
	public ArrayList<UsuarioModel> listarUsuarios(){
		return usuariosService.listarUsuarios();
	}
	@PostMapping()
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuarioModelo) {
		return usuariosService.guardarUsuario(usuarioModelo);
	}
	@GetMapping("/query")
	public ArrayList<UsuarioModel> obtenerPrioridad(@RequestParam ("prioridad") Integer prioridad){
		return usuariosService.busquedaPrioridad(prioridad);
	}
	@GetMapping(path = "{id}")
	public Optional<UsuarioModel> obtenerPorID(@PathVariable ("id") Long id){
		return usuariosService.obtenerPorID(id);
	}	
	
}