package com.ra.quotes.SpringQuotes.datamodel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.invoke.MethodHandles;

@Component
public class About {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Value("${main.springquotes.version}")
    private String appVersion;
    private String javaVersion;
    private String javaVendor;
    private String osArch;
    private String osName;
    private String osVersion;

    @PostConstruct
    public void init() {
        javaVersion = Runtime.version().toString();
        javaVendor = System.getProperty("java.vendor");
        osArch = System.getProperty("os.arch");
        osName = System.getProperty("os.name");
        osVersion = System.getProperty("os.version");
        LOGGER.info("************************ RUNNING WITH THE FOLLOWING ARGS *********************");
        LOGGER.info("" + this + "");

    }

    public AboutInfos toAboutInfos() {
        return new AboutInfos(this.appVersion, this.javaVersion, this.javaVendor, this.osArch, this.osName, this.osVersion);
    }
    @Override
    public String toString() {
        return "About{" +
                "appVersion='" + appVersion + '\'' +
                ", javaVersion='" + javaVersion + '\'' +
                ", javaVendor='" + javaVendor + '\'' +
                ", osArch='" + osArch + '\'' +
                ", osName='" + osName + '\'' +
                ", osVersion='" + osVersion + '\'' +
                '}';
    }
}
