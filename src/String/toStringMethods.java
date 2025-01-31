package String;

class Box{
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Dimesions are: "+ width +" by "+ depth+" by "+height+".";
    }
}
public class toStringMethods {
    public static void main(String[] args) {
        Box b = new Box(10,12,14);
        String s = "Box b: " + b;

        System.out.println(b);

        byte[] ascii = {65,66,67,68,69};//Taking ascii character as Byte code
        //Converting Ascii Code to String
        String name = new String(ascii);
        System.out.println(name);
        //In this we are passing the offset and length of string we want.
        String name1 = new String(ascii,2,3);
        System.out.println(name1);
    }
}
