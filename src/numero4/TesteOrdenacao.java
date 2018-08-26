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
public class TesteOrdenacao {
    
    /**
     * Metodo que testa a classe Ordenacao
     * @param args 
     */
    public static void main(String[] args) {
        Ordenacao o = new Ordenacao();
        
        Vector<Integer> v1 = new Vector();

        v1.add(10);
        v1.add(7);
        v1.add(16);
        v1.add(45);
        v1.add(98);
        v1.add(-4);
        
        for(Integer i : o.sort(v1)) {
            System.out.println(i);
        }
    }
}
