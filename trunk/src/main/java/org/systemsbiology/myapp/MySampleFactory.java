package org.systemsbiology.myapp;

/**
 * @author: hrovira
 */
public class MySampleFactory {
    private String defaultBeanName;
    private Integer globalStartSequence;

    /*
     * Dependency Injection
     */
    public void setDefaultBeanName(String defaultBeanName) {
        this.defaultBeanName = defaultBeanName;
    }

    public void setGlobalStartSequence(Integer globalStartSequence) {
        this.globalStartSequence = globalStartSequence;
    }

    /*
     * Public Methods
     */
    public MySample createNewSample() {
        MySample mySample = new MySample();
        mySample.setMyBeanName(defaultBeanName);
        mySample.setStartSequence(globalStartSequence++);
        return mySample;
    }
}
