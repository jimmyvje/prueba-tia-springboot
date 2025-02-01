/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prueba_tecnica.controllers;


import com.prueba.prueba_tecnica.models.ProductoSucursalStockModel;
import com.prueba.prueba_tecnica.models.StockSucursal;
import com.prueba.prueba_tecnica.services.StockSucursalService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jimmy
 */
@RestController
@RequestMapping("/stockSucursal")
@CrossOrigin(origins = "*")
public class StockSucursalController {
    @Autowired
    StockSucursalService stockSucursalControllerService;
    
    @GetMapping()
    public ArrayList<StockSucursal> obtenerStockSucursal(){
        return stockSucursalControllerService.getStockSucursals();
    }
    
    @PostMapping
    public StockSucursal guardarStockSucursal(@RequestBody StockSucursal stock){
        return stockSucursalControllerService.guardarOActualizarStock(stock);
    }
    
    @GetMapping("/listar")
    public List<ProductoSucursalStockModel> listarStockSucursal() {
        return  stockSucursalControllerService.obtenerStockSucursal();

    }
}
