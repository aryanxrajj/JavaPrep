package Recursion;

public class Introduction {
    static int count = 0;
    public static void main(String[] args) {
        print();//Calling the function
    }

    public static void print(){
        //Base Condition to stop the recursion
        if(count == 3){
            return;
        }
        System.out.println(count);
        count++;
        print();
    }
}
