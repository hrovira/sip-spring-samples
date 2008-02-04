package org.systemsbiology.myapp;

/**
 * @author: hrovira
 */
public class AnalysisInputMockRetrieveService implements AnalysisInputRetrieveService {
    private AnalysisInput analysisInput;

    /*
     * Dependency Injection
     */
    public void setAnalysisInput(AnalysisInput analysisInput) {
        this.analysisInput = analysisInput;
    }

    public AnalysisInput retrieve(Integer id) {
        return analysisInput;
    }
}