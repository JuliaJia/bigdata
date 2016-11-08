package j2se.core.io.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
    public PropertiesFile() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        String path = "F:/study/code/bigdata/java/J2seSample/txt/";
        Properties prop = new Properties();
        File input = new File(path + "config.properties");

        try {
            prop.load(new FileInputStream(input));
            System.out.println(prop.getProperty("admin_username"));
            prop.setProperty("key", "value");
            File e = new File(path + "config.properties");
            prop.store(new FileOutputStream(e), " Ù–‘¡–±Ì√Ë ˆ");
        } catch (IOException var5) {
            var5.printStackTrace();
        }

    }
}