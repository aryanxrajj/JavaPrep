package OOPS;
class Box{
    double width;
    double height;
    double depth;
    //Defaut Constructor
    public Box() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }
    //Parameterised Constructor to assign whd
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    //Copy Constructor
    public Box(Box old){
        this.width = old.width;
        this.height = old.height;
        this.depth = old.depth;
    }
    //Side of the Length
    public Box(double len){
        width = height = depth = len;
    }
    //Calculate the volume of the length
    double volume(){
        return width * height * depth;
    }
}

class BoxWeight extends Box{
    double weight;

    public BoxWeight(double width, double height, double depth, double weight) {
        super(width,height,depth);
        this.weight = weight;
    }
}

class BoxColor extends BoxWeight{
    String color;

    public BoxColor(double width, double height, double depth, double weight,String color) {
        super(width, height, depth, weight);
        this.color = color;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        BoxWeight box1  = new BoxWeight(10,20,30,40);
        double vol;
        vol = box1.volume();
        System.out.println("Volume of Cube is : "+vol);
        System.out.println("The weight of Cube is: "+box1.weight);

        BoxColor box2 = new BoxColor(10,20,30,40,"Yellow");
        System.out.println("The Color of the Box is : "+ box2.color);
        System.out.println("It's time to sleep so good night");
    }
}
