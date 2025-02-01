/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prueba_tecnica.controllers;

import com.prueba.prueba_tecnica.models.Producto;
import com.prueba.prueba_tecnica.services.ProductoService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Jimmy
 */
@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "*")
public class ProductoController {
    @Autowired
    ProductoService productoService;
    
    @GetMapping()
    public ArrayList<Producto> obtenerProducto(){
        return productoService.getProductos();
    }
    
    @GetMapping()
    @RequestMapping("/buscarPorCodigo")
    @CrossOrigin(origins = "*")
    public ArrayList<Producto> obtenerProductoPorCodigo(@RequestParam String codigo){
        return productoService.getProductosPorCodigo(codigo);
    }
    
    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto){
        return productoService.postProducto(producto);
    }
    
}
