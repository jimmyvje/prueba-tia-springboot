/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prueba_tecnica.services;

import com.prueba.prueba_tecnica.models.ProductoSucursalStockModel;
import com.prueba.prueba_tecnica.models.StockSucursal;
import com.prueba.prueba_tecnica.repositories.StockSucursalRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jimmy
 */
@Service
public class StockSucursalService {
    @Autowired
    StockSucursalRepository stockSucursalRepository;
    
    public ArrayList<StockSucursal> getStockSucursals(){
        return (ArrayList<StockSucursal>) stockSucursalRepository.findAll();
    }
    
    public boolean deleteStockSucursal(StockSucursal stock){
        try {
            stockSucursalRepository.delete(stock);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public StockSucursal guardarOActualizarStock(StockSucursal stockSucursal) {
        // Buscar si ya existe un registro con el mismo producto_id y sucursal_id
        Optional<StockSucursal> existingStock = stockSucursalRepository
                .findByProductoIdAndSucursalId(stockSucursal.getProducto().getId(), stockSucursal.getSucursal().getId());

        if (existingStock.isPresent()) {
            // Si existe, sumar la cantidad al registro existente
            StockSucursal stockExistente = existingStock.get();
            stockExistente.setCantidad(stockExistente.getCantidad() + stockSucursal.getCantidad());
            return stockSucursalRepository.save(stockExistente);
        } else {
            // Si no existe, guardar el nuevo registro
            return stockSucursalRepository.save(stockSucursal);
        }
    }
    
    public List<ProductoSucursalStockModel> obtenerStockSucursal() {
        return stockSucursalRepository.findAllStockSucursal();
    }
}

