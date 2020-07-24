package Photogram.restful.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

/*
Notice the prefix = "storage" attribute in the above annotation. It instructs 
@ConfigurationProperties to bind all the properties that start with storage 
prefix to their corresponding attributes of POJO class when the application 
is started.
*/
@ConfigurationProperties(prefix = "storage")
public class StorageProperties {
    private String location;

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}