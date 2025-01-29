package OOPS;

public class RefSubclassObject {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5,6,9);
        Box plainbox = new Box();
        double vol;
        vol = weightbox.volume();
        System.out.println("Volume of the weightbox: "+vol);
        System.out.println("Weight of the box is : "+weightbox.weight);

        //assign BoxWeigth reference to Box reference
        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("Volume of plainbox is "+vol);

//      Here, In this we can not access to the weight because
//      we have assign a subclass to the superclass so we have access
//      to those which are defined in superclass;
//      System.out.println("Weight of plainbox is "+plainbox.weight);
    }
}
