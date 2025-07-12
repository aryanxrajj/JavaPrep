package Misty;

class Box{
    double width;
    double height;
    double depth;

    Box(){
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(Box obj){
        this.width = obj.width;
        this.depth  = obj.depth;
        this.height = obj.height;

    }

    public double volume(){
        return width*depth*height;
    }
}

class BoxWeight extends Box{
    double weight;

    public BoxWeight(double width, double height, double depth, double weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }
}

public class Inheritance {
    public static void main(String[] args){
        BoxWeight box1 = new BoxWeight(10,20,30,40);
        Box box2 = new Box();
        System.out.println("The volume of the ox is: "+ box2.volume());
//        System.out.println("The weight of the box is : "+box2.weight);
    }
}
