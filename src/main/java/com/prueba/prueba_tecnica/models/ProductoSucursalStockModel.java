/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prueba_tecnica.models;

/**
 *
 * @author Jimmy
 */
public class ProductoSucursalStockModel {
    private String codigoProducto;
    private String descripcionProducto;
    private String descripcionSucursal;
    private String direccionSucursal;
    private int cantidad;

    public ProductoSucursalStockModel(String codigoProducto, String descripcionProducto, String descripcionSucursal, String direccionSucursal, int cantidad) {
        this.codigoProducto = codigoProducto;
        this.descripcionProducto = descripcionProducto;
        this.descripcionSucursal = descripcionSucursal;
        this.direccionSucursal = direccionSucursal;
        this.cantidad = cantidad;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getDescripcionSucursal() {
        return descripcionSucursal;
    }

    public void setDescripcionSucursal(String descripcionSucursal) {
        this.descripcionSucursal = descripcionSucursal;
    }

    public String getDireccionSucursal() {
        return direccionSucursal;
    }

    public void setDireccionSucursal(String direccionSucursal) {
        this.direccionSucursal = direccionSucursal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
