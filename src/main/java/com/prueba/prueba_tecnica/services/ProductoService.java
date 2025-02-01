/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prueba_tecnica.services;

import com.prueba.prueba_tecnica.models.Producto;
import com.prueba.prueba_tecnica.repositories.ProductoRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jimmy
 */
@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;
    
    public ArrayList<Producto> getProductos(){
        return (ArrayList<Producto>) productoRepository.findAll();
    }
    
    public Producto postProducto(Producto producto){
        return productoRepository.save(producto);
    }
    
    public ArrayList<Producto> getProductosPorCodigo(String codigo){
        System.out.println("codigo "+codigo);
        return productoRepository.findByCodigo(codigo);
    }
    
    public boolean deleteProducto(Producto producto){
        try {
            productoRepository.delete(producto);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
}
