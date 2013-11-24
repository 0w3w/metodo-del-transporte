/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0w3w
 */
public class costoSuministro extends suministro {
    public double costo;
    public costoSuministro(String n, double ca, double co){
        super(n,ca);
        this.costo = co;
    }
    @Override
    public String toString(){
        return this.nombre + " - (" + this.cantidad + ")" + "[ $" + this.costo + "]";
    }
}
