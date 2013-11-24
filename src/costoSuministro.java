/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0w3w
 */
public class costoSuministro {
    public String nombre;
    public double costo;
    public int indiceSuministro;
    public costoSuministro(String n, double c, int i){
        this.nombre = n;
        this.costo = c;
        this.indiceSuministro = i;
    }
    @Override
    public String toString(){
        return this.nombre + " - ( $" + this.costo + ")[" + this.indiceSuministro + "]";
    }
}
