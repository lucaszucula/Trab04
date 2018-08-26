
package numero2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Lucas
 */
public class Teste {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        System.out.print("Introduza o numero total de estudantes :");
        int total = e.nextInt();
        
        Estudante estudante = new Estudante();
        Vector<Double> vectorNotas = new Vector<>(3);
        Vector<Estudante> vectorEstudante = new Vector<>(total);

        for (int i = 0; i < total; i++) {

            System.out.print("Introduza o nome :");
            String nome = e.next();

            double soma = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduza a nota :");
                vectorNotas.add(e.nextDouble());
                soma += vectorNotas.get(j);
            }
            double media = soma / 3;

            estudante.setNome(nome);
            estudante.setMedia(media);
            estudante.setNotas(vectorNotas);
            
            vectorEstudante.insertElementAt(estudante, i);
            
            System.out.println("----------------------------------------------------");
        }
        
        System.out.println("========================================================================");
        
        for (Estudante es : vectorEstudante) {
            System.out.println(es.getNome());
            System.out.println(es.getMedia());
            System.out.println(es.getNotas());
            System.out.println("---------------------------------------------------------");
        }
        
        Collections.sort(vectorEstudante, new Comparator<Estudante>() {
            @Override
            public int compare(Estudante e1, Estudante e2) {
                return Double.toString(e1.getMedia()).compareTo(Double.toString(e2.getMedia()));
            }
        });
        
        System.out.println("A melhor media e :"+ vectorEstudante.lastElement());
    }
}

