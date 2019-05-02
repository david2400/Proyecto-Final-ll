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
public class clsCliente implements Serializable{
    String nombre,apellido,fechaNacimiento,cedula,telefono,usuario,contrasena,correo;
    char genero;

    public clsCliente(String nombre, String apellido, String fechaNacimiento, String cedula, String telefono, String usuario, String contrasena, String correo, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.correo = correo;
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
}
