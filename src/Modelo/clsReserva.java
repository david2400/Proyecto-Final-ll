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
public class clsReserva implements Serializable{
    String fechaIda,fechaRegreso,destino,claseEconomica,codigoReserva,horaVuelo,ubicacionSilla,Nombrepasajeros,origen;
    int cupos;
    boolean Asistir;     

    public clsReserva(String fechaIda, String fechaRegreso, String destino, String claseEconomica, String codigoReserva, String horaVuelo, String ubicacionSilla, String Nombrepasajeros, String origen, int cupos, boolean Asistir) {
        this.fechaIda = fechaIda;
        this.fechaRegreso = fechaRegreso;
        this.destino = destino;
        this.claseEconomica = claseEconomica;
        this.codigoReserva = codigoReserva;
        this.horaVuelo = horaVuelo;
        this.ubicacionSilla = ubicacionSilla;
        this.Nombrepasajeros = Nombrepasajeros;
        this.origen = origen;
        this.cupos = cupos;
        this.Asistir = Asistir;
    }

    public String getFechaIda() {
        return fechaIda;
    }

    public void setFechaIda(String fechaIda) {
        this.fechaIda = fechaIda;
    }

    public String getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getClaseEconomica() {
        return claseEconomica;
    }

    public void setClaseEconomica(String claseEconomica) {
        this.claseEconomica = claseEconomica;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getHoraVuelo() {
        return horaVuelo;
    }

    public void setHoraVuelo(String horaVuelo) {
        this.horaVuelo = horaVuelo;
    }

    public String getUbicacionSilla() {
        return ubicacionSilla;
    }

    public void setUbicacionSilla(String ubicacionSilla) {
        this.ubicacionSilla = ubicacionSilla;
    }

    public String getNombrepasajeros() {
        return Nombrepasajeros;
    }

    public void setNombrepasajeros(String Nombrepasajeros) {
        this.Nombrepasajeros = Nombrepasajeros;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public boolean isAsistir() {
        return Asistir;
    }

    public void setAsistir(boolean Asistir) {
        this.Asistir = Asistir;
    }
    
    
    
}
