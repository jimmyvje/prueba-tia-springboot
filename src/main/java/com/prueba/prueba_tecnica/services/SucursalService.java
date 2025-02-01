/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prueba_tecnica.services;


import com.prueba.prueba_tecnica.models.Sucursal;
import com.prueba.prueba_tecnica.repositories.SucursalRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jimmy
 */
@Service
public class SucursalService {
    @Autowired
    SucursalRepository sucursalRepository;
    
    public ArrayList<Sucursal> getSucursales(){
        return (ArrayList<Sucursal>) sucursalRepository.findAll();
    }
    
    public Sucursal postSucursal(Sucursal sucursal){
        return sucursalRepository.save(sucursal);
    }
    
    public ArrayList<Sucursal> getSucursalesPorCodigo(String codigo){
        return sucursalRepository.findByCodigo(codigo);
    }
    
    public boolean deleteSucursal(Sucursal sucursal){
        try {
            sucursalRepository.delete(sucursal);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
}
