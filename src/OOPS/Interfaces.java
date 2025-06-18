package OOPS;

interface printer{
    static void printstatus(){
        System.out.println("Printer Ready");
    }
}

class LaserPrinter implements printer{
    void showstatus(){
        printer.printstatus();
    }
}

interface Name{
    static void display(){
        System.out.println("aryan");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        LaserPrinter laserPrinter = new LaserPrinter();
        laserPrinter.showstatus();

        Name.display();
    }
}
