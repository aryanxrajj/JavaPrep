package Chicki;

class Student{
    String name;
    int regno;

    public Student() {//Empty Constructor

    }

    public Student(String name, int regno) {//Parameterised Constructor
        this.name = name;
        this.regno = regno;
        System.out.println(name + " " + regno);
    }

    public void displayDetails(){
        System.out.println(name);
        System.out.println(regno);
    }
}

public class LearningOops {
    public static void main(String[] args) {
        Student chicky = new Student("Chicky",12304749);
    }
}
