package Task4.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties4 {
    private final Properties properties = new Properties();

    private static TestProperties4 INSTANCE = null;

    private TestProperties4(){
        System.setProperty("environment", "application");
        try {
            properties.load(new FileInputStream(new File("./" + System.getProperty("environment") + ".properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static TestProperties4 getInstance() {
        if (INSTANCE == null){
            INSTANCE = new TestProperties4();
        }
        return INSTANCE;
    }

    public Properties getProperties() {
        return properties;
    }
}
