package oop.construtor;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",23);
        System.out.println("姓名："+stu1.name+"\n"+"年龄："+stu1.age);


        Student stu2 = new Student("李四",24);
        System.out.println("姓名："+stu2.name+"\n"+"年龄："+stu2.age);

    }
}
