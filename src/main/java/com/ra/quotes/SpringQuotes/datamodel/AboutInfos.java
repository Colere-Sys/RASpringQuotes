package com.ra.quotes.SpringQuotes.datamodel;


public class AboutInfos {
    private String appVersion;
    private String javaVersion;
    private String javaVendor;
    private String osArch;
    private String osName;
    private String osVersion;

    public AboutInfos(String appVersion, String javaVersion, String javaVendor, String osArch, String osName, String osVersion) {
        this.appVersion = appVersion;
        this.javaVersion = javaVersion;
        this.javaVendor = javaVendor;
        this.osArch = osArch;
        this.osName = osName;
        this.osVersion = osVersion;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public String getJavaVendor() {
        return javaVendor;
    }

    public void setJavaVendor(String javaVendor) {
        this.javaVendor = javaVendor;
    }

    public String getOsArch() {
        return osArch;
    }

    public void setOsArch(String osArch) {
        this.osArch = osArch;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
}
