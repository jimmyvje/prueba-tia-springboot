/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prueba_tecnica.controllers;


import com.prueba.prueba_tecnica.models.Sucursal;
import com.prueba.prueba_tecnica.services.SucursalService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/sucursal")
@CrossOrigin(origins = "*")
public class SucursalController {
    @Autowired
    SucursalService sucursalService;
    
    @GetMapping()
    public ArrayList<Sucursal> obtenerSucursal(){
        return sucursalService.getSucursales();
    }
    
    @PostMapping
    public Sucursal guardarSucursal(@RequestBody Sucursal sucursal){
        return sucursalService.postSucursal(sucursal);
    }
}
