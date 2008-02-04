package org.systemsbiology.myapp;

import org.junit.Assert;

/**
 * @author: hrovira
 */
public class AnalysisOutputMockPersistService implements AnalysisOutputPersistService {
    private AnalysisOutput expectedOutput;

    /*
     * Dependency Injection
     */
    public void setExpectedOutput(AnalysisOutput expectedOutput) {
        this.expectedOutput = expectedOutput;
    }

    public void persist(AnalysisOutput analysisOutput) throws Exception {
        Assert.assertEquals(analysisOutput.getAnalysisResult(), expectedOutput.getAnalysisResult());
    }

    public void delete(AnalysisOutput analysisOutput) throws Exception {
    }
}