package DSA.Queue;

public class CustomQueue {
    protected int[] data;
    public static final int DEFAULT_SIZE = 10;

    int ptr = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Behen di phuddi jagah ich nhi hai!!");
        }
        data[ptr++] = item;
        return true;
    }

    public int  removed() throws Exception{
        if(isEmpty()){
            throw new Exception("Behen dii phuddi ye toh khali hai");
        }
        int remove = data[0];
        for (int i = 1; i < ptr; i++) {
            data[i-1] = data[i];
        }
        ptr--;
        return remove;
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Behen dii phuddi ye toh khali hai");
        }
        for(int i=0;i<ptr;i++){
            System.out.print(data[i]+" -> ");
        }
        System.out.println("END");
    }

    public boolean isFull(){
        return ptr == data.length;
    }

    public boolean isEmpty(){
        return ptr == 0;
    }
}
