package FinalTask.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestPropertiesYandex {
    private final Properties properties = new Properties();

    private static TestPropertiesYandex INSTANCE = null;

    private TestPropertiesYandex(){
        System.setProperty("environment", "application");
        try {
            properties.load(new FileInputStream(new File("./" + System.getProperty("environment") + ".properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static TestPropertiesYandex getInstance() {
        if (INSTANCE == null){
            INSTANCE = new TestPropertiesYandex();
        }
        return INSTANCE;
    }

    public Properties getProperties() {
        return properties;
    }
}
