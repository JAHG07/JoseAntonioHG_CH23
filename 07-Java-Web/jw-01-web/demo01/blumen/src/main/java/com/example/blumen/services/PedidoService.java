package com.example.blumen.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blumen.models.PedidoModel;
import com.example.blumen.repositories.PedidoRepository;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;
    
    public boolean eliminarPedido(Long id) {
    	try {
    		pedidoRepository.deleteById(id);
        	return true; 
		} catch (Exception e) {
			return false;
		}
    }

    public ArrayList<PedidoModel> listarPedidos() {
        return (ArrayList<PedidoModel>) pedidoRepository.findAll();
    }
    
    public PedidoModel realizarPedido(PedidoModel pedido) {
        return pedidoRepository.save(pedido);
    }
    
     public ArrayList<PedidoModel> obtenerPorEstatus (String estatus) {
      return pedidoRepository.findByEstatus(estatus); 
      }
     
     public Optional<PedidoModel> obtenerPorId (Long id){
         return pedidoRepository.findById(id);
     }
}
