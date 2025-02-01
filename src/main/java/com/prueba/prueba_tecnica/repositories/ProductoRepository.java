/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prueba_tecnica.repositories;

import com.prueba.prueba_tecnica.models.Producto;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jimmy
 */
@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer> {
    public abstract ArrayList<Producto> findByCodigo(String codigo);
    
}
