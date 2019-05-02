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
public class clsVuelo implements Serializable{
    String hora,pilotoAsignado,avionAsignado,puestosDisponibles,numeroVuelo,FechaVuelo,precio,horario,ruta;

    public clsVuelo(String hora, String pilotoAsignado, String avionAsignado, String puestosDisponibles, String numeroVuelo, String FechaVuelo, String precio, String horario, String ruta) {
        this.hora = hora;
        this.pilotoAsignado = pilotoAsignado;
        this.avionAsignado = avionAsignado;
        this.puestosDisponibles = puestosDisponibles;
        this.numeroVuelo = numeroVuelo;
        this.FechaVuelo = FechaVuelo;
        this.precio = precio;
        this.horario = horario;
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPilotoAsignado() {
        return pilotoAsignado;
    }

    public void setPilotoAsignado(String pilotoAsignado) {
        this.pilotoAsignado = pilotoAsignado;
    }

    public String getAvionAsignado() {
        return avionAsignado;
    }

    public void setAvionAsignado(String avionAsignado) {
        this.avionAsignado = avionAsignado;
    }

    public String getPuestosDisponibles() {
        return puestosDisponibles;
    }

    public void setPuestosDisponibles(String puestosDisponibles) {
        this.puestosDisponibles = puestosDisponibles;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getFechaVuelo() {
        return FechaVuelo;
    }

    public void setFechaVuelo(String FechaVuelo) {
        this.FechaVuelo = FechaVuelo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    
    
}
