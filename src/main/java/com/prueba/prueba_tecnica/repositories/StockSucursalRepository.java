/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prueba_tecnica.repositories;

import com.prueba.prueba_tecnica.models.ProductoSucursalStockModel;
import com.prueba.prueba_tecnica.models.StockSucursal;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jimmy
 */
public interface StockSucursalRepository extends CrudRepository<StockSucursal, Integer> {
    Optional<StockSucursal> findByProductoIdAndSucursalId(Integer productoId, Integer sucursalId);
    
    @Query("SELECT new com.prueba.prueba_tecnica.models.ProductoSucursalStockModel(" +
           "p.codigo, p.descripcion, s.descripcion,s.direccion, ss.cantidad) " +
           "FROM StockSucursal ss " +
           "JOIN ss.producto p " +
           "JOIN ss.sucursal s")
    List<ProductoSucursalStockModel> findAllStockSucursal();
}
