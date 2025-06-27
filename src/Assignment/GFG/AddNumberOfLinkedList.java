package Assignment.GFG;

class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}


public class AddNumberOfLinkedList {
    public static void main(String[] args) {
        Node num1 = new Node(0);
        num1.next = new Node(0);
        num1.next.next = new Node(6);
        num1.next.next.next = new Node(3);

        Node num2 = new Node(0);
        num2.next = new Node(7);

        Node result = addTwoLists(num1,num2);
        while(result != null){
            System.out.print(result.val + "->");
            result = result.next;
        }
    }

    static Node addTwoLists(Node num1, Node num2) {
        Node removedZero1 = RemoveLeadingZeros(num1);
        Node removedZero2 = RemoveLeadingZeros(num2);

        Node rev1 = reverse(removedZero1);
        Node rev2 = reverse(removedZero2);

        Node ans = new Node(0);
        Node dummy = ans;
        int total = 0, carry = 0;

        while(rev1 != null || rev2 != null || carry != 0){
            total+=carry;

            if(rev1 != null){
                total+=rev1.val;
                rev1 = rev1.next;
            }

            if(rev2 != null){
                total+= rev2.val;
                rev2 = rev2.next;
            }

            int num = total % 10;
            dummy.next = new Node(num);
            carry = total /10;
            dummy = dummy.next;
            total = 0;
        }

        return reverse(ans.next);
    }

    static Node RemoveLeadingZeros(Node head){
        while(head != null && head.val == 0){
            head = head.next;
        }
        return head;
    }

    static Node reverse(Node head){
        Node current = head;
        Node prev = null;
        Node next;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
