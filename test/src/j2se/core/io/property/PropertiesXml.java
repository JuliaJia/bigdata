package j2se.core.io.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropertiesXml {
    public PropertiesXml() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        String path = "F:/study/code/bigdata/java/J2seSample/txt/";
        Properties prop = new Properties();
        File input = new File(path + "config.xml");

        try {
            prop.loadFromXML(new FileInputStream(input));
            String e = prop.getProperty("admin_username");
            System.out.println(e);
            prop.setProperty("����", "�����");
            prop.setProperty("�Ա�", "�޷��ֱ�");
            prop.setProperty("����", "�������");
            File output = new File(path + "config.xml");
            prop.storeToXML(new FileOutputStream(output), "�����б�");
        } catch (InvalidPropertiesFormatException var6) {
            var6.printStackTrace();
        } catch (IOException var7) {
            var7.printStackTrace();
        }

    }
}
