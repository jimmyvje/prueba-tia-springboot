/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prueba_tecnica.repositories;


import com.prueba.prueba_tecnica.models.Sucursal;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jimmy
 */
public interface SucursalRepository extends CrudRepository<Sucursal, Integer> {
    public abstract ArrayList<Sucursal> findByCodigo(String codigo);
}
