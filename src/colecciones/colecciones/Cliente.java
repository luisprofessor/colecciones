/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.colecciones;

/**
 *
 * @author usuario2
 */
public class Cliente {
    private int nroCuenta;
    private String apellido;

    public Cliente(int nroCuenta, String apellido) {
        this.nroCuenta = nroCuenta;
        this.apellido = apellido;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if(o!=null && o instanceof Cliente){
                    Cliente otro=(Cliente)o;
                    if (nroCuenta==otro.nroCuenta){
                    
                        return true;
                    }else {
                    
                        return false;
                    }
        
        
        }
         return false;
    }

    @Override
    public int hashCode() {
        return nroCuenta;
    }
    
    
    
}
