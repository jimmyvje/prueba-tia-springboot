/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prueba_tecnica.models;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author Jimmy
 */
@Entity
@Table(name = "stock_sucursal")
@NamedQueries({
    @NamedQuery(name = "StockSucursal.findAll", query = "SELECT s FROM StockSucursal s"),
    @NamedQuery(name = "StockSucursal.findById", query = "SELECT s FROM StockSucursal s WHERE s.id = :id"),
    @NamedQuery(name = "StockSucursal.findByCantidad", query = "SELECT s FROM StockSucursal s WHERE s.cantidad = :cantidad")})
public class StockSucursal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @ManyToOne(optional = false)
    @JoinColumn(name = "producto_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Producto producto;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sucursal_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Sucursal sucursal;

    public StockSucursal() {
    }

    public StockSucursal(Integer id) {
        this.id = id;
    }

    public StockSucursal(Integer id, int cantidad, Producto producto, Sucursal sucursal) {
        this.id = id;
        this.cantidad = cantidad;
        this.producto = producto;
        this.sucursal = sucursal;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StockSucursal)) {
            return false;
        }
        StockSucursal other = (StockSucursal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.prueba_tecnica.models.StockSucursal[ id=" + id + " ]";
    }
    
}
