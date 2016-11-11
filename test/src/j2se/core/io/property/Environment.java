package j2se.core.io.property;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Environment {
    public Environment() {
    }

    public static void main(String[] args) {
        Map env = System.getenv();
        Iterator var3 = env.entrySet().iterator();

        while(var3.hasNext()) {
            Entry s = (Entry)var3.next();
            System.out.println("KEY: " + (String)s.getKey() + "\t");
            System.out.println("VALUE: " + (String)s.getValue());
        }

        String s1 = System.getenv("JAVA_HOME");
        System.out.println(s1);
    }
}
