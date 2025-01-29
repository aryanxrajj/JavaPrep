package OOPS;

import java.util.Arrays;

public class Classes {

    static class Student{
        String name;
        int rollno;
        float marks;

        public Student() {
           this.name = "null";
           this.rollno = 0;
           this.marks = 0.0f;
        }

        public Student(String name, int rollno, float marks) {
            this.name = name;
            this.rollno = rollno;
            this.marks = marks;
        }

        void greeting(){
            System.out.println("Hello! my name is " + name);
        }
    }

    public static void main(String[] args) {
        Student[] aryan  = new Student[5];
        Student kunal  = new Student("kunal Kushwaha",13,88.0f);
        System.out.println(kunal.rollno);
        Student kittu = new Student();
        System.out.println(kittu.rollno);
        kunal.greeting();

        final int num = 10;
    }
}
