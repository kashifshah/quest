/**
 *
 */
package shef.mt.tools.stf;

import java.util.HashSet;

import shef.mt.features.impl.Feature;
import shef.mt.features.util.Sentence;

/**
 * absolute difference between the number of PP phrases in the source and target
 * normalised by the total number of phrasal tags in the sentence
 *
 * @author Catalina Hallett
 *
 *
 */
public class Feature1105 extends Feature {

    public Feature1105() {
        setIndex("1105");
        setDescription("absolute difference between the number of PP phrases in the source and target normalised by the total number of phrasal tags in the sentence");
        HashSet res = new HashSet();
        //requires named entities
        res.add("stf");
        setResources(res);
    }

    /* (non-Javadoc)
     * @see wlv.mt.features.impl.Feature#run(wlv.mt.features.util.Sentence, wlv.mt.features.util.Sentence)
     */
    @Override
    public void run(Sentence source, Sentence target) {
        float sourcePP = (Float) source.getValue("PP");
        float phrasesSource = (Float) source.getValue("phrase_tags");
        float targetPP = (Float) target.getValue("PP");
        float phrasesTarget = (Float) source.getValue("phrase_tags");

        float sourceNorm = phrasesSource == 0 ? 0 : sourcePP / phrasesSource;
        float targetNorm = phrasesTarget == 0 ? 0 : targetPP / phrasesTarget;
        setValue(Math.abs(sourceNorm - targetNorm));

    }
}