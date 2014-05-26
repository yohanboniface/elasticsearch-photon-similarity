package de.komoot.photon.plugin.similarity;

import org.elasticsearch.common.inject.Module;
import de.komoot.photon.index.similarity.PhotonSimilarityProvider;
import org.elasticsearch.index.similarity.SimilarityModule;
import org.elasticsearch.plugins.AbstractPlugin;


public class PhotonSimilarityPlugin extends AbstractPlugin {

    @Override public String name() {
        return "photon-similarity";
    }


    @Override public String description() {
        return "photon similarity";
    }


    @Override public void processModule(Module module) {
        if (module instanceof SimilarityModule) {
        	SimilarityModule similarityModule = (SimilarityModule) module;
        	similarityModule.addSimilarity("photon-similarity", PhotonSimilarityProvider.class);
        }
    }
}
