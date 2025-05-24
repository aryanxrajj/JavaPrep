package Paras;

class ClassesParas {
    String name ;
    int rank;
    char grade;

    public ClassesParas() {
    }

    ClassesParas(String name, int rank, char grade){
        this.name = name;
        this.rank = rank;
        this.grade = grade;
        System.out.println(rank*100);
    }

    void display(){
        System.out.println(name + " "+ rank + " "+ grade);
    }

    int getrank(int r){
        return r * 100;
    }
}

public class Classes{
    public static void main(String[] args) {
        ClassesParas paras = new ClassesParas("Paras",1,'O');
        ClassesParas aryan = new ClassesParas();
        System.out.println(aryan.getrank(10));
        paras.display();


    }
}


