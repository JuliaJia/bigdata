package j2se.core.io.file;

import j2se.core.io.file.Person;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class RandomAccessFileDemo {
    private static List<Long> pointer;

    public RandomAccessFileDemo() {
    }

    public static void main(String[] args) throws IOException {
        Person[] persons = new Person[]{new Person("one", 32, true), new Person("two", 31, false), new Person("three", 30, true), new Person("four", 29, false)};
        write(persons);
        Person p = read(2);
        System.out.println(p);
    }

    private static Person read(int i) throws IOException {
        RandomAccessFile file = new RandomAccessFile("data/store.dat", "r");
        long l = ((Long)pointer.get(i)).longValue();
        file.skipBytes((int)l);
        Person p = new Person();
        p.name = file.readUTF();
        p.age = file.readInt();
        p.sex = file.readBoolean();
        file.close();
        return p;
    }

    private static void write(Person[] persons) throws IOException {
        File _file = new File("data/store.dat");
        if(!_file.exists()) {
            File file = _file.getParentFile();
            file.mkdir();
        }

        RandomAccessFile var7 = new RandomAccessFile("data/store.dat", "rw");
        pointer = new ArrayList<Long>();
        Person[] var6 = persons;
        int var5 = persons.length;

        for(int var4 = 0; var4 < var5; ++var4) {
            Person p = var6[var4];
            pointer.add(Long.valueOf(var7.getFilePointer()));
            var7.writeUTF(p.name);
            System.out.println("name:" + var7.getFilePointer());
            var7.writeInt(p.age);
            System.out.println("age:" + var7.getFilePointer());
            var7.writeBoolean(p.sex);
            System.out.println("sex:" + var7.getFilePointer());
        }

        var7.close();
    }
}