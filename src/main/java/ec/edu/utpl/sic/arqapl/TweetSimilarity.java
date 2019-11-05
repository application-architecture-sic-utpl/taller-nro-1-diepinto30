package ec.edu.utpl.sic.arqapl;

import ec.edu.utpl.sic.arqapl.metrics.Cosine;
import ec.edu.utpl.sic.arqapl.metrics.Jaccard;
import ec.edu.utpl.sic.arqapl.metrics.JardWinkleDistance;
import ec.edu.utpl.sic.arqapl.metrics.Similaritable;

import java.util.ArrayList;
import java.util.List;

public class TweetSimilarity {
    //private Similaritable algorithm;
    // se crea un ArrayList para ir almacenando en caso que se añade un nuevo algoritmo de similitud
    private ArrayList<Similaritable> algorithmAll = new ArrayList<Similaritable>();

    public TweetSimilarity() {
        // todos los algorithm que se estan añadiendo
        algorithmAll.add(new Jaccard());
        algorithmAll.add(new Cosine());
        algorithmAll.add(new JardWinkleDistance());
    }

    public double similarity(String tweet1, String tweet2, String typeAlgorithm) {
        // aqui usamos en el operador instanceof, sirve para conocer si un objeto es de un tipo determinado en una clase
        // interfaz (interface)
        double types = 0;
        for(Similaritable algorith : algorithmAll){
            if(typeAlgorithm.equals("jac")){
                if(algorith instanceof Jaccard){
                    types = algorith.similarity(tweet1, tweet2);
                }
            }else if(typeAlgorithm.equals("cos")){
                if(algorith instanceof Cosine){
                    types = algorith.similarity(tweet1, tweet2);
                }
            }else if(typeAlgorithm.equals("jard")){
                if(algorith instanceof JardWinkleDistance){
                    types = algorith.similarity(tweet1, tweet2);
                }
            }
        }
        return types;
    }
}


