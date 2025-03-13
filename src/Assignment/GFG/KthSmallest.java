package Assignment.GFG;

import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        System.out.println(kthSmallest(arr,3));
    }

    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int num : arr){
            queue.add(num);
        }

        for(int i = 0; i < k - 1; i++){
            queue.poll();
        }

        return queue.peek();
    }
}
