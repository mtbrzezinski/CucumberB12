package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String readProperty(String key){
        //File class assign given file to the Java object
        File file = new File("configuration.properties");
        Properties properties = new Properties();
        //properties object will read the properties file
        try {
            properties.load((new FileInputStream(file)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //more actions surround by try and catch
        return properties.getProperty(key);
    }


}
