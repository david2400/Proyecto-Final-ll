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
public class clsAvion implements Serializable{
   String entidad,tamano,tipoAvion,NumeroAvion;
    int capacidad;

    public clsAvion(String entidad, String tamano, String tipoAvion, String NumeroAvion, int capacidad) {
        this.entidad = entidad;
        this.tamano = tamano;
        this.tipoAvion = tipoAvion;
        this.NumeroAvion = NumeroAvion;
        this.capacidad = capacidad;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public String getNumeroAvion() {
        return NumeroAvion;
    }

    public void setNumeroAvion(String NumeroAvion) {
        this.NumeroAvion = NumeroAvion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
    
    
    
}
