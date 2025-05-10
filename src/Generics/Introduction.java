package Generics;

class Box<T>{
    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}

public class Introduction {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("Aryan");
        System.out.println(box.get());
    }
}
