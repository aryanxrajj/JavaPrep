package DSA.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();
//        queue.insert(10);
//        queue.insert(20);
//        queue.insert(30);
//        queue.insert(40);

        queue.display();

        queue.removed();
        queue.display();
    }
}
