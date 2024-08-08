/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.trefactoring2;

/**
 *
 * @author Kathy
 */
public class Direccion {
    private String callePrincipal;
    private String calleSecundaria;
    private char bloque;
    private String ciudad;
    private String codigoPostal;

    public Direccion(String callePrincipal, char bloque, String ciudad, String codigoPostal) {
        this.callePrincipal = callePrincipal;
        this.bloque = bloque;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }
    
    public String getCalleSecundaria() {
        return callePrincipal;
    }
    
    public void setCallePrincipal(String calle) {
        this.calleSecundaria = calleSecundaria;
    }

    public void setCalleSecundaria(String calle) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getCiudad() {
        return ciudad;
    }

    public char getBloque() {
        return bloque;
    }

    public void setBloque(char bloque) {
        this.bloque = bloque;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "Calle Principal = " + callePrincipal + '\'' +
                ", Ciudad = " + ciudad + '\'' +
                ", Código Postal = " + codigoPostal + '\'' +
                '}';
    }
}

