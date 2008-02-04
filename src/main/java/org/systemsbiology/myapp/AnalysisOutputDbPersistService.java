package org.systemsbiology.myapp;

import javax.sql.DataSource;

/**
 * @author: hrovira
 */
public class AnalysisOutputDbPersistService implements AnalysisOutputPersistService {
    private DataSource dataSource;

    public AnalysisOutputDbPersistService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void persist(AnalysisOutput analysisOutput) throws Exception {
        // open connection
        // translate object into insert sql statement
        // execute sql statement
    }

    public void delete(AnalysisOutput analysisOutput) throws Exception {
        // open connection
        // translate object into delete sql statement
        // execute sql statement
    }
}
