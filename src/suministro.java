/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0w3w
 */
public class suministro {
    public String nombre;
    public double cantidad;
    public suministro(String n, double c){
        this.nombre = n;
        this.cantidad = c;
    }
    @Override
    public String toString(){
        return this.nombre + " - (" + this.cantidad + ")";
    }
    
    @Override
    public boolean equals(Object other){
        if (other == null) return false;
        if (other == this) return true;
        if (!(other instanceof suministro))return false;
        suministro otherSuministro = (suministro)other;
        return this.nombre.equals(otherSuministro.nombre);
    }
}
