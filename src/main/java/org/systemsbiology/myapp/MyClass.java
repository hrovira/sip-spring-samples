package org.systemsbiology.myapp;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * @author: hrovira
 */
public class MyClass {
    private AnalysisInputRetrieveService retrieveService;
    private AnalysisOutputPersistService persistService;
    private Integer analysisTargetId;

    public static void main(String[] args) throws Exception {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://mydb.isb.org:3322");
        dataSource.setUsername("anon");
        dataSource.setPassword("pwd");

        MyClass myClass = new MyClass();
        myClass.retrieveService = new AnalysisInputDbRetrieveService(dataSource);
        myClass.persistService = new AnalysisOutputDbPersistService(dataSource);
        myClass.analysisTargetId = Integer.parseInt(args[0]);
        myClass.performAnalysis();
    }

    public void performAnalysis() throws Exception {
        AnalysisInput input = retrieveService.retrieve(analysisTargetId);

        int resultValue = input.getX() * input.getY();

        AnalysisOutput output = new AnalysisOutput();
        output.setAnalysisInput(input);
        output.setAnalysisResult(resultValue);

        persistService.persist(output);
    }
}
