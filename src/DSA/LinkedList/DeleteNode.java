package DSA;

    public class DeleteNode {

        private Node head;
        private Node tail;
        private int size;

        public DeleteNode(){
            this.size = 0;
        }

        public void Deletefirst(){
            head = head.next;
            size--;
        }

        public Node get(int index){
            Node node = head;
            for(int i = 1;i<index;i++){
                node = node.next;
            }
            return node;
        }

        public void deletep(){
            Node prev = get(2);
            prev.next = prev.next.next;
            size--;

        }

        public void deleteLast(){
            Node secondlast = get(size-1);
            secondlast.next = null;
            tail = secondlast;
        }

        void inserthead(int value){
            Node node = new Node(value);
            node.next = head;
            head = node;

            if(tail == null){
                tail = head;
            }
            size++;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.value+" -> ");
                temp = temp.next;
            }
            System.out.println("END");
        }

        class Node{
            int value;
            Node next;

            public Node(int value){
                this.value = value;
            }
            public Node(int value, Node next){
                this.value = value;
                this.next = next;
            }
        }

        public static void main(String[] args) {
            DeleteNode list  = new DeleteNode();
            list.inserthead(10);
            list.inserthead(20);
            list.inserthead(30);
            list.inserthead(40);
            list.inserthead(50);
            list.display();
            list.deletep();
            list.display();
        }
    }
