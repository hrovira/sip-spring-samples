package org.systemsbiology.myapp;

import java.io.File;
import java.util.Properties;
import java.util.Map;
import java.util.List;

/**
 * @author: hrovira
 */
public class MySample {
    private String myBeanName;
    private Integer startSequence;
    private File tempDir;
    private MySample secondaryBean;
    private Map usefulMap;
    private List usefulList;
    private Properties usefulProperties;
    private MyEnumeration myEnumeration;
    private MyEnumeration[] myEnumerations;

    /*
     * Dependency Injection
     */
    public void setMyBeanName(String myBeanName) {
        this.myBeanName = myBeanName;
    }

    public void setStartSequence(Integer startSequence) {
        this.startSequence = startSequence;
    }

    public void setTempDir(File tempDir) {
        this.tempDir = tempDir;
    }

    public void setSecondaryBean(MySample secondaryBean) {
        this.secondaryBean = secondaryBean;
    }

    public void setUsefulMap(Map usefulMap) {
        this.usefulMap = usefulMap;
    }

    public void setUsefulList(List usefulList) {
        this.usefulList = usefulList;
    }

    public void setUsefulProperties(Properties usefulProperties) {
        this.usefulProperties = usefulProperties;
    }

    public void setMyEnumeration(MyEnumeration myEnumeration) {
        this.myEnumeration = myEnumeration;
    }

    public void setMyEnumerations(MyEnumeration[] myEnumerations) {
        this.myEnumerations = myEnumerations;
    }

    /*
     * Public Methods
     */
    public void startSampling() {
        System.out.println("MySampleFactory.startSampling");
        System.out.println("myBeanName=" + myBeanName);
        System.out.println("startSequence=" + startSequence);
        System.out.println("tempDir=" + tempDir);
        System.out.println("secondaryBean=" + secondaryBean);
        System.out.println("usefulMap=" + usefulMap);
        System.out.println("usefulList=" + usefulList);
        System.out.println("usefulProperties=" + usefulProperties);
        System.out.println("myEnumeration=" + myEnumeration);
        System.out.println("myEnumerations=" + myEnumerations);
    }

    public void endSampling() {
        System.out.println("MySampleFactory.endSampling");
    }    
}
