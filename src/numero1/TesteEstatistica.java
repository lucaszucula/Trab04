
package numero1;

import java.util.Vector;

/**
 *
 * @author Lucas
 */
public class TesteEstatistica {
    
    /**
     * Metodo que testa a classe Estatistica
     * @param args 
     */
    public static void main(String[] args) {
        
        Vector<Integer> vector = new Vector(3);
        vector.add(11);
        vector.add(18);
        vector.add(15);
        vector.add(2);
        vector.add(12);
        vector.add(12);
        
        System.out.println("A media e : " +Estatistica.media(vector, vector.size()));
        System.out.println("A moda e : " +Estatistica.moda(vector, vector.size()));
        System.out.println("A mediana e : " +Estatistica.mediana(vector, vector.size()));
    }
}

