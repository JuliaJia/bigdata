package j2se.core.io.file;

class Person {
    String name;
    int age;
    boolean sex;

    public Person() {
    }

    public Person(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String toString() {
        return "Person [age=" + this.age + ", name=" + this.name + ", sex=" + this.sex + "]";
    }
}

