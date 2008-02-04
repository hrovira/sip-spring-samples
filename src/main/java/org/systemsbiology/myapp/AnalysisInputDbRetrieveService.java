package org.systemsbiology.myapp;

import javax.sql.DataSource;

/**
 * @author: hrovira
 */
public class AnalysisInputDbRetrieveService implements AnalysisInputRetrieveService {
    private DataSource dataSource;

    /*
     * Dependency Injection
     */
    public AnalysisInputDbRetrieveService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public AnalysisInput retrieve(Integer id) {
        // open connection
        // execute select statement
        // build object from result set row
        // return AnalysisInput
        return null;
    }
}
