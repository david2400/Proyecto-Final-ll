/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Hataraku
 */
public class clsMaleta implements Serializable{
    double peso,totalprecio;
    int cantidad;
    String cedula;

    public clsMaleta(double peso, double totalprecio, int cantidad, String cedula) {
        this.peso = peso;
        this.totalprecio = totalprecio;
        this.cantidad = cantidad;
        this.cedula = cedula;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTotalprecio() {
        return totalprecio;
    }

    public void setTotalprecio(double totalprecio) {
        this.totalprecio = totalprecio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
    
    
    
    
    
    
    
    
}
