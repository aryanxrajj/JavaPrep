package ComparableAndCompartor;

import java.util.Comparator;
import java.util.TreeSet;

class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}


public class TreeSetUsingComparator {
    public static void main(String[] args) {
        Comparator<Animal> animal = new Comparator<Animal>() {
            public int compare(Animal s1, Animal s2) {
                return s1.name.compareTo(s2.name);
            }
        };

        TreeSet<Animal> set = new TreeSet<>(animal);
        set.add(new Animal("Aryan"));
        set.add(new Animal("Ayush"));

        for(Animal s : set){
            System.out.println(s);
        }
    }
}
