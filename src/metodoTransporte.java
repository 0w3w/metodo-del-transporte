
import java.util.LinkedList;
import lpsolve.LpSolve;
import lpsolve.LpSolveException;

/**
 *
 * @author 0w3w
 */
public class metodoTransporte {
    private LinkedList<suministro> suministros;
    private LinkedList<demanda> demandas;
    
    public metodoTransporte(){
        this.suministros = new LinkedList<>();
        this.demandas = new LinkedList<>();
    }
    
    public metodoTransporte(LinkedList<suministro> iSu, LinkedList<demanda> ide){
        this.suministros = iSu;
        this.demandas = ide;
    }
    
    private double[][] getMetodoMatrix(){
        suministro  suministroTmp;
        demanda     demandaTmp;
        double[][] matriz = new double[suministros.size()][demandas.size()];
        for(int i = 0; i < suministros.size(); i++){
            suministroTmp = suministros.get(i);
            for(int j = 0; j < demandas.size(); j++){
                demandaTmp = demandas.get(j);
                int indiceSuministro = demandaTmp.costoSuministro.indexOf(suministroTmp);
                if(indiceSuministro >= 0){
                    matriz[i][j] = ((costoSuministro) demandaTmp.costoSuministro.get(indiceSuministro)).costo;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }

    public String getResults(boolean debug){
        String resultado = "";
        String coeficientesFuncionObjetivo = "";
        double[][] matrizDeCostos = getMetodoMatrix();
        int variableNumber = this.suministros.size() * this.demandas.size();
        // Calcular Funcion Objetivo
        for(int i = 0; i < matrizDeCostos.length; i++){
            for(int j = 0; j < matrizDeCostos[i].length; j++){
                coeficientesFuncionObjetivo += matrizDeCostos[i][j] + " ";
            }
        }
        resultado += "DEBUG INFORMATION \n\n";
        resultado += "- Coeficientes de la funcion objetivo : "+coeficientesFuncionObjetivo + "\n";
        try {   
            // Crea un problema con 2 variables y 0 restricciones        
                LpSolve solver = LpSolve.makeLp(0, variableNumber);
            // Si es necesario indica que las variables son numeros enteros
                for(int i = 1; i <= variableNumber; i++){
                    solver.setInt(i, true);
                }
            // Asigna los valores de los coeficientes de la funcion objetivo, si fuera MAX multiplica los coeficientes por -1        
                solver.strSetObjFn(coeficientesFuncionObjetivo);
            // Asigna los valores de los coeficientes de las restricciones
                // Restricciones de Suministro LE
                resultado += "- Restricciones de Suministro LE: \n";
                String restriccionesSuministro;
                suministro  sumIt;
                suministro  suministroTmp;
                for(int cadaSuministro = 0; cadaSuministro < this.suministros.size(); cadaSuministro++){
                    sumIt = this.suministros.get(cadaSuministro);
                    restriccionesSuministro = "";
                    for(int i = 0; i < matrizDeCostos.length; i++){
                        suministroTmp = this.suministros.get(i);
                        for(int j = 0; j < matrizDeCostos[i].length; j++){
                            if(suministroTmp.equals(sumIt)){
                                restriccionesSuministro += "1 ";
                            }else{
                                restriccionesSuministro += "0 ";
                            }
                        }
                    }
                    resultado += "RS["+ cadaSuministro +"] : " + restriccionesSuministro + " <= " + sumIt.cantidad + "\n";
                    solver.strAddConstraint(restriccionesSuministro, LpSolve.LE, sumIt.cantidad);
                }
                // Restricciones de Demanda GE
                resultado += "- Restricciones de Demanda GE: \n";
                String restriccionesDemanda;
                demanda  demit;
                demanda  demTmp;
                for(int cadaDemanda = 0; cadaDemanda < this.demandas.size(); cadaDemanda++){
                    demit = this.demandas.get(cadaDemanda);
                    restriccionesDemanda = "";
                    for(int i = 0; i < matrizDeCostos.length; i++){
                        for(int j = 0; j < matrizDeCostos[i].length; j++){
                            demTmp = this.demandas.get(j);
                            if(demTmp.equals(demit)){
                                restriccionesDemanda += "1 ";
                            }else{
                                restriccionesDemanda += "0 ";
                            }
                        }
                    }
                    resultado += "RD["+ cadaDemanda +"] : " + restriccionesDemanda + " >= " + demit.cantidad + "\n";
                    solver.strAddConstraint(restriccionesDemanda, LpSolve.GE, demit.cantidad);
                }
            // Resuelve el problema de LP
                solver.solve();
            // Imprime Resultados
                resultado += "Valor de la función objetivo: " + solver.getObjective() + "\n";
                double[] var = solver.getPtrVariables();
                for (int i = 0; i < var.length; i++) {
                    resultado += "Valores de la variable[" + i + "] = " + var[i] + "\n";
                }
            // Libera la memoria
                solver.deleteLp();
        }catch (LpSolveException e) {
            e.printStackTrace();
        }
        return resultado;
    }
}
