/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0w3w
 */
import java.util.Comparator;

public class costoSuministroComparador implements Comparator<costoSuministro>{
    @Override
    public int compare(costoSuministro x, costoSuministro y){
        // Assume neither string is null. Real code should
        // probably be more robust
        if (x.indiceSuministro < y.indiceSuministro){
            return -1;
        }
        if (x.indiceSuministro > y.indiceSuministro){
            return 1;
        }
        return 0;
    }
}