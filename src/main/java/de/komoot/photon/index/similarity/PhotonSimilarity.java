package de.komoot.photon.index.similarity;

import org.apache.lucene.search.similarities.DefaultSimilarity;
import org.apache.lucene.index.FieldInvertState;

/**
 * Custom similarity class
 * 
 * @author xq
 *
 */
public class PhotonSimilarity extends DefaultSimilarity {

	@Override
	public float idf(long docFreq, long numDocs) {
		return 1.0f;
	}

    @Override
    public float tf(float freq) {
        return 1.0f;
    }

    @Override
    public float lengthNorm(FieldInvertState state) {
        return 1.0f;
    }

}
