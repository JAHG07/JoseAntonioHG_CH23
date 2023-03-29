package com.generation.ch23.jpa.models;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "producto")
public class ProductModel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombreProducto;
    
    @ManyToOne
    private UsuarioModel usuario;
    @OneToOne(mappedBy="producto")
    private OrderDetailModel detalle;
    
	    
		public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

		public ProductModel() {
		super();
	}
		
		public ProductModel(Long id, String nombreProducto, Long usuarioId) {
			super();
			this.id = id;
			this.nombreProducto = nombreProducto;
			//this.usuarioId = usuarioId;
		}


		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombreProducto() {
			return nombreProducto;
		}
		public void setNombreProducto(String nombreProducto) {
			this.nombreProducto = nombreProducto;
		}
}
