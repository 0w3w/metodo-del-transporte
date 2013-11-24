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
}
