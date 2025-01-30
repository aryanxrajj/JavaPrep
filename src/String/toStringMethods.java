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
    }
}
