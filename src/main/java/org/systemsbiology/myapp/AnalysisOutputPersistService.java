package org.systemsbiology.myapp;

/**
 * @author: hrovira
 */
public interface AnalysisOutputPersistService {
    public void persist(AnalysisOutput analysisOutput) throws Exception;

    public void delete(AnalysisOutput analysisOutput) throws Exception;
}
