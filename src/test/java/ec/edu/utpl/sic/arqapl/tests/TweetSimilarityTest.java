package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import static org.junit.Assert.*;

import ec.edu.utpl.sic.arqapl.metrics.Similaritable;
import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import org.junit.Test;

public class TweetSimilarityTest {
    public TweetSimilarityTest() {
    }

    @Test
    public void similar() {
        var tweet1 = "Hola mundo";
        var tweet2 = "Hola mundO";
        TweetSimilarity ts = new TweetSimilarity();
        var typeAlgorithm = "JAC";
        //var typeAlgorithm = "Cos";
        //var typeAlgorithm = "Jard";

        assertEquals(1.0, ts.similarity(tweet1.toLowerCase(), tweet2.toLowerCase(), typeAlgorithm.toLowerCase()), 1.0);

    }
}
