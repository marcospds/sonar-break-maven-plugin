package com.sgoertzen.sonarbreak.model;

/**
 * Created by sgoertzen on 12/14/15.
 */
public class QualityGateQuery {

    private String resource;
    private String version;

    public QualityGateQuery(String resource, String version){
        setResource(resource);
        setVersion(version);
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
