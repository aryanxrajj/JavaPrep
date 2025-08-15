package DSA.Recursion;

import java.util.ArrayList;

public class PermutationArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        ArrayList<Integer> unprocessed = new ArrayList<>();
        for (int num : arr) {
            unprocessed.add(num);
        }
        permutation(new ArrayList<>(), unprocessed);
    }

    public static void permutation(ArrayList<Integer> p, ArrayList<Integer> up) {
        // Base Case: If the unprocessed list is empty, we have a full permutation
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        // Take the first element from the unprocessed list
        int element = up.remove(0);

        // Recursively insert the element at all possible positions in the processed list
        for (int i = 0; i <= p.size(); i++) {
            ArrayList<Integer> newP = new ArrayList<>(p);
            newP.add(i, element);
            permutation(newP, new ArrayList<>(up));
        }
    }
}
