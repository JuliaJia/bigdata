package ����ӡ;

public class Info {
    public Info() {
    }

    public static void main(String[] args) {
        Person sb = new Person();
        sb.eat();
        sb.name = "ɵ��";
        sb.setAge(20);
        sb.gender = "���в�Ů";
        sb.eat(sb.getAge(), sb.gender, sb.name);
        Person mdzz = new Person("����ӡ");
        mdzz.setAge(0);
        mdzz.gender = "��";
        mdzz.eat(mdzz.getAge(), mdzz.gender, mdzz.name);
    }
}
class Person {
    public String name;
    public String gender;
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 130) {
            this.age = age;
        } else {
            System.out.println("Wrong Age!");
            this.age = 18;
        }
    }

    public void see(String name) {
        System.out.println(name + " see something!!!!");
    }

    public void pay(String name) {
        System.out.println(name + " pay for anything!!!");
    }

    public void eat() {
        System.out.println("ӡ��ʹ��һ����֪��������֪���Ա�Ҳ��֪�������SB��");
    }

    public void eat(int age, String gender, String name) {
        System.out.println("����һ������" + age + gender + "��" + name + "����ֻ֪����!!!!");
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}