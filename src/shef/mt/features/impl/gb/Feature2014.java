/**
 *
 */
package shef.mt.features.impl.gb;

import shef.mt.features.impl.Feature;
import shef.mt.features.util.Sentence;
import java.util.*;

/**
 * MOSES: distortion feature 1
 *
 * @author cat
 *
 */
public class Feature2014 extends Feature {

    public Feature2014() {
        setIndex("2014");
        setDescription("dist_feat_1");
        HashSet<String> res = new HashSet<String>();
        res.add("dist_feat_1");
        setResources(res);
    }

    /* (non-Javadoc)
     * @see wlv.mt.features.impl.Feature#run(wlv.mt.features.util.Sentence, wlv.mt.features.util.Sentence)
     */
    @Override
    public void run(Sentence source, Sentence target) {
        // TODO Auto-generated method stub
        float value = Float.parseFloat(source.getTranslationAttribute("dist_feat_1"));
        setValue(value);
    }
}
