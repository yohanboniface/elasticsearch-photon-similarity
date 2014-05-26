package de.komoot.photon.index.similarity;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.similarity.AbstractSimilarityProvider;

public class PhotonSimilarityProvider extends AbstractSimilarityProvider {

	private PhotonSimilarity similarity;

	@Inject
	public PhotonSimilarityProvider(@Assisted String name, @Assisted Settings settings) {
		super(name);
		this.similarity = new PhotonSimilarity();
	}
	
	

	public PhotonSimilarity get() {
		return similarity;
	}
}
