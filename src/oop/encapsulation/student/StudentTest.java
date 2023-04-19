package oop.encapsulation.student;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setAge(101);

        int age = stu1.getAge();
        System.out.println(age);
    }
}
