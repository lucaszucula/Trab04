/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero4;

import java.util.Vector;

/**
 *
 * @author Lucas
 */
public class Ordenacao {
    
    /**
     * Metodo que ordena os elementos de um vector
     * @param vector 
     * @return um vector ordenado decrescentemente
     */
    public Vector<Integer> sort(Vector<Integer> vector ) {
        Vector<Integer> novoVector = new Vector<>();
        Integer aux = 0;
        
        for (int i = 0; i < vector.size(); i++) {
            for (int j = i+1; j < vector.size(); j++) {
                if(vector.elementAt(j) > vector.elementAt(i)) {
                    aux = vector.elementAt(j);
                }
            }
            novoVector.add(aux);
        }
        return novoVector;
    }
    
}

