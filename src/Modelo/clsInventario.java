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
public class clsInventario implements Serializable{
   String nombreObjeto,TipoObjeto,NumeroAvion,Costo;

    public clsInventario(String nombreObjeto, String TipoObjeto, String NumeroAvion, String Costo) {
        this.nombreObjeto = nombreObjeto;
        this.TipoObjeto = TipoObjeto;
        this.NumeroAvion = NumeroAvion;
        this.Costo = Costo;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public String getTipoObjeto() {
        return TipoObjeto;
    }

    public void setTipoObjeto(String TipoObjeto) {
        this.TipoObjeto = TipoObjeto;
    }

    public String getNumeroAvion() {
        return NumeroAvion;
    }

    public void setNumeroAvion(String NumeroAvion) {
        this.NumeroAvion = NumeroAvion;
    }

    public String getCosto() {
        return Costo;
    }

    public void setCosto(String Costo) {
        this.Costo = Costo;
    }
       
}
