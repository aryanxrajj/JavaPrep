package OOPS;

class BoxInfo{
    private double width;
    private double height;
    private double depth;

    //Construct clone of the object
    BoxInfo(BoxInfo obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    //Constructor when all dimension are specified
    public BoxInfo(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //Constructor when all dimension are not specified
    public BoxInfo(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //Constructor when cube is created
    public BoxInfo(double len){
        width = height = depth = len;
    }

    //Compute and return Volume
    double volume(){
        return width * depth * height;
    }
}

class BoxWeightInfo extends BoxInfo{
    double weight;

    public BoxWeightInfo(BoxWeightInfo obj) {
        super(obj);
        weight = obj.weight;
    }

    public BoxWeightInfo(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public BoxWeightInfo() {
        super();
        weight = -1;
    }

    public BoxWeightInfo(double len, double weight) {
        super(len);
        this.weight = weight;
    }
}

class Shipment extends BoxWeightInfo{
    double cost;

    public Shipment(Shipment obj, double cost) {
        super(obj);
        cost = obj.cost;
    }

    public Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }

    public Shipment(){
        super();
        cost = -1;
    }

    public Shipment(double len, double weight, double cost) {
        super(len, weight);
        this.cost = cost;
    }
}

public class MultilevelHierarchy {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println("The volume of shipment1 is "+ vol);
        System.out.println("The weight of shipment1 is "+shipment1.weight);
        System.out.println("The cost of the shipment1 is "+shipment1.cost);

        System.out.println();

        vol = shipment2.volume();
        System.out.println("The volume of shipment1 is "+ vol);
        System.out.println("The weight of shipment1 is "+shipment2.weight);
        System.out.println("The cost of the shipment1 is "+shipment2.cost);

    }
}
