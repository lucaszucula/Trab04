
package numero1;
import java.util.Vector;

/**
 *
 * @author Lucas
 */
public class Estatistica {
    /**
     * Metodo que calcula a media dos valores do vector
     * @param vector 
     * @param tamanho 
     * @return moda dos valores introduzidos no vector
     */
    public static double media(Vector<Integer> vector,int tamanho) {
        int soma = 0;
        for (Integer i : vector) {
            soma += i;
        }
        return soma / tamanho;
    }
    
    
    /**
     * Metodo que calcula a moda dos valores do vector
     * @param vector 
     * @param tamanho 
     * @return moda dos valores introduzidos no vector
     */
    public static double moda(Vector<Integer> vector,int tamanho) {
        Integer maior = 0;
        double cont = 0;
        for (int i = 0; i < tamanho; i++) {
            int incremento = 0;
            for (int j = i+1; j < tamanho; j++) {
                if(vector.elementAt(i) == vector.elementAt(j)) {
                    incremento++;
                }
            }
            if(incremento > maior) {
                cont = vector.elementAt(i);
            }
        }
        return cont;
    }
    
    
    /**
     * Metodo que calcula a mediana dos valores do vector
     * @param vector 
     * @param tamanho 
     * @return mediana dos valores introduzidos no vector
     */
    public static double mediana(Vector<Integer> vector,int tamanho) {
        return (tamanho % 2 == 0) ? vector.elementAt((tamanho / 2) - 1) : vector.elementAt(((tamanho + 1)/2) - 1);
    }
}

    
    
    

