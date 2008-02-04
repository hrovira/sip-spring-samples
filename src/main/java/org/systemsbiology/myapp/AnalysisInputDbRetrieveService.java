package org.systemsbiology.myapp;

import javax.sql.DataSource;

/**
 * @author: hrovira
 */
public class AnalysisInputDbRetrieveService implements RetrieveService<AnalysisInput, Integer> {
    private DataSource dataSource;

    /*
     * Dependency Injection
     */
    public AnalysisInputDbRetrieveService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public AnalysisInput retrieve(Integer id) {
        return null;
    }
}
