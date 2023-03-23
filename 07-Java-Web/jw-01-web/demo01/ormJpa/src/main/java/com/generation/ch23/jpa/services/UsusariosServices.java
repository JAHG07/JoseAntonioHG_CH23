package com.generation.ch23.jpa.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ch23.jpa.models.UsuarioModel;
import com.generation.ch23.jpa.repo.UsuarioRepo;

@Service
public class UsusariosServices {
	@Autowired
	UsuarioRepo usuarioRepositorio;
	public ArrayList<UsuarioModel> busquedaPrioridad (Integer prioridad){
		return usuarioRepositorio.busquedaPrioridad(prioridad);
	}
	public ArrayList<UsuarioModel> ListarUsuarios(){
		return (ArrayList<UsuarioModel>) usuarioRepositorio.findAll();
	}
}
