package com.generation.ch23.jpa.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ch23.jpa.models.UsuarioModel;
import com.generation.ch23.jpa.repo.UsuarioRepo;

@Service
public class UsusariosServices {
	@Autowired
	UsuarioRepo usuarioRepositorio;
	public boolean eliminarUsuario(Long id) {
		try {
			usuarioRepositorio.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public ArrayList<UsuarioModel> busquedaPrioridad (Integer prioridad){
		return usuarioRepositorio.findByPrioridad(prioridad);
	}
	public ArrayList<UsuarioModel> listarUsuarios(){
		return (ArrayList<UsuarioModel>) usuarioRepositorio.findAll();
	}
	public UsuarioModel guardarUsuario(UsuarioModel ususario) {
		return usuarioRepositorio.save(ususario);
	}
	public Optional<UsuarioModel> obtenerPorID(Long id){
		return usuarioRepositorio.findById(id);
	}
}
