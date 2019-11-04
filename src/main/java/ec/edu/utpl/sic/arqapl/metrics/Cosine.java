package ec.edu.utpl.sic.arqapl.metrics;

import org.apache.commons.text.similarity.CosineDistance;

public class Cosine implements Similaritable {
    @Override
    public double similarity(String text1, String text2) {
        var cosine = new CosineDistance();
        var similarity = 1.0 - cosine.apply(text1, text2);

        if(similarity == 1.0){
            System.out.println("Los dos textos son similares en un: " + similarity);
        } else if(similarity != 1.0) {
            System.out.println("No son similares en un: " + similarity);
        }
        return similarity;
    }
}
