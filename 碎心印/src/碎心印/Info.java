package 碎心印;

public class Info {
    public Info() {
    }

    public static void main(String[] args) {
        Person sb = new Person();
        sb.eat();
        sb.name = "傻逼";
        sb.setAge(20);
        sb.gender = "不男不女";
        sb.eat(sb.getAge(), sb.gender, sb.name);
        Person mdzz = new Person("碎心印");
        mdzz.setAge(0);
        mdzz.gender = "男";
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
        System.out.println("印左使是一个不知道姓名不知道性别也不知道年龄的SB！");
    }

    public void eat(int age, String gender, String name) {
        System.out.println("这是一个年龄" + age + gender + "的" + name + "，他只知道吃!!!!");
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}