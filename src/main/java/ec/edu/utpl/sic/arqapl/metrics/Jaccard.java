package ec.edu.utpl.sic.arqapl.metrics;

import smile.math.distance.JaccardDistance;

public class Jaccard implements Similaritable {
    @Override
    public double similarity(String text1, String text2) {
        var jaccard = new JaccardDistance<String>();
        var similarity = 1.0 - jaccard.d(text1.split("\\s"),
                text2.split("\\s"));
        if(similarity == 1.0){
            System.out.println("Los dos textos son similares en un: " + similarity);
        } else if(similarity != 1.0) {
            System.out.println("No son similares en un: " + similarity);
        }


        return similarity;
    }
}
