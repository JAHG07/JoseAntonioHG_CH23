package com.example.blumen.repositories;

import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.blumen.models.PedidoModel;

@Repository
public interface PedidoRepository extends CrudRepository<PedidoModel, Long>{
    public ArrayList<PedidoModel> findByEstatus (String estatus);
}
