/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero3;

import java.util.Vector;

/**
 *
 * @author Lucas
 */
public class Comparacao {

    /**
     * Metodo que compara se dois vectores sao iguais ou nao
     * @return boolean dependendo do resultado da comparacao
     * @param v1 
     * @param v2 
     */
    public boolean compare(Vector<Boolean> v1, Vector<Boolean> v2) {
        if (v1.size() == v2.size()) {
            for (int i = 0; i < v1.size(); i++) {
                return (v1.get(i) == v2.get(i)) ? true : false;
            }
        }
        return false;
    }
}
