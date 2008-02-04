package org.systemsbiology.myapp;

/**
 * @author: hrovira
 */
public class MyPojo {
    private RetrieveService<AnalysisInput, Integer> retrieveService;
    private PersistService<AnalysisOutput> persistService;
    private Integer analysisTargetId;
    private boolean outputResultToConsole;

    /*
     * Dependency Injection
     */
    public void setRetrieveService(RetrieveService<AnalysisInput, Integer> svc) {
        this.retrieveService = svc;
    }

    public void setPersistService(PersistService<AnalysisOutput> svc) {
        this.persistService = svc;
    }

    public void setAnalysisTargetId(Integer value) {
        this.analysisTargetId = value;
    }

    public void setOutputResultToConsole(boolean flag) {
        this.outputResultToConsole = flag;
    }

    /*
     * Public Methods
     */
    public void performAnalysis() throws Exception {
        AnalysisInput input = retrieveService.retrieve(analysisTargetId);

        int resultValue = input.getX() * input.getY();

        AnalysisOutput output = new AnalysisOutput();
        output.setAnalysisInput(input);
        output.setAnalysisResult(resultValue);

        if (outputResultToConsole) {
            System.out.println("MyPojo.performAnalysis: " + analysisTargetId + ": " + resultValue);
        }

        persistService.persist(output);
    }
}