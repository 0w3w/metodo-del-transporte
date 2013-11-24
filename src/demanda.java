
import java.util.Comparator;
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
    PriorityQueue<costoSuministro> suministrosPQueue;
    
    public demanda(String n, double c, int capacity){
        Comparator<costoSuministro> comparador = new costoSuministroComparador();
        this.nombre = n;
        this.cantidad = c;
        this.suministrosPQueue  = new PriorityQueue<costoSuministro>(capacity, comparador);
    }
    @Override
    public String toString(){
        return this.nombre + " - (" + this.cantidad + ")";
    }
}
