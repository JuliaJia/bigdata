package j2se.core.io.property;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Map.Entry;

public class SystemProperties {
    public SystemProperties() {
    }

    public static void main(String[] args) {
        Properties prop = System.getProperties();
        Iterator names = prop.entrySet().iterator();

        while(names.hasNext()) {
            Entry version = (Entry)names.next();
            System.out.println("KEY: " + version.getKey() + "\t");
            System.out.println("VALUE: " + version.getValue());
        }

        String version1 = prop.getProperty("java.version");
        System.out.println(version1);
        setProperty("mykey", "myvalue");
        System.out.println(prop.getProperty("mykey", "default"));
        Enumeration names1 = prop.propertyNames();

        while(names1.hasMoreElements()) {
            String s = (String)names1.nextElement();
            System.out.println(s);
        }

    }

    private static void setProperty(String key, String value) {
        Properties prop = System.getProperties();
        prop.setProperty(key, value);
    }
}
