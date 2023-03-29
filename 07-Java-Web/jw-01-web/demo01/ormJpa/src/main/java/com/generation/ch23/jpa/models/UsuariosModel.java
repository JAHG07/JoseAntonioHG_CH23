package com.generation.ch23.jpa.models;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "usuarios")

public class UsuariosModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
	@Column(nullable = false)
    private String nombre;
	@Column(nullable = false)
    private String apellidoP;
	@Column(nullable = false)
    private String apellidoM;
	@Column(nullable = false)
    private String correo;
	@Column(nullable = false)
    private String password;
	@Column(nullable = false)
    private String estatus;
	public UsuariosModel() {
		super();
	}
	public UsuariosModel(Long id, String nombre, String apellidoP, String apellidoM, String correo, String password,
			String estatus) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.correo = correo;
		this.password = password;
		this.estatus = estatus;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoP() {
		return apellidoP;
	}
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	public String getApellidoM() {
		return apellidoM;
	}
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
}
