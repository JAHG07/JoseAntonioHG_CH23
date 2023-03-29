package com.generation.ch23.jpa.models;

import java.util.ArrayList;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "usuario")

public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String email;
    private Integer prioridad;
    
    @OneToMany(mappedBy = "usuario")
    private ArrayList<ProductModel> productos;
    
    @OneToMany(mappedBy = "usuario")
    private ArrayList<OrderModel> ordenes;
    
    public UsuarioModel(Long id, String nombre, String email, Integer prioridad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.prioridad = prioridad;
	}
    
	public UsuarioModel() {
		super();
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

	public ArrayList<ProductModel> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<ProductModel> productos) {
		this.productos = productos;
	}

	public ArrayList<OrderModel> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(ArrayList<OrderModel> ordenes) {
		this.ordenes = ordenes;
	}

	
    
}