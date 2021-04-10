package Task3.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties3 {
    private final Properties properties = new Properties();

    private static TestProperties3 INSTANCE = null;

    private TestProperties3(){
        System.setProperty("environment", "application");
        try {
            properties.load(new FileInputStream(new File("./" + System.getProperty("environment") + ".properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static TestProperties3 getInstance() {
        if (INSTANCE == null){
            INSTANCE = new TestProperties3();
        }
        return INSTANCE;
    }

    public Properties getProperties() {
        return properties;
    }
}
