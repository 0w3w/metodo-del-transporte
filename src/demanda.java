
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0w3w
 */
public class demanda {
    public String nombre;
    public double cantidad;
    LinkedList<suministro> costoSuministro;
    
    public demanda(String n, double c, LinkedList<suministro> cs){
        this.nombre = n;
        this.cantidad = c;
        this.costoSuministro = cs;
    }
    @Override
    public String toString(){
        return this.nombre + " - (" + this.cantidad + ")";
    }
    
    @Override
    public boolean equals(Object other){
        if (other == null) return false;
        if (other == this) return true;
        if (!(other instanceof demanda))return false;
        demanda otherDemanda = (demanda)other;
        return this.nombre.equals(otherDemanda.nombre);
    }
}
