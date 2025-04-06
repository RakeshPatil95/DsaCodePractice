package leetCode;

public class ReverseLl {

    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        Node newHead = reverseLl(head);
        while(newHead != null){
            System.out.print(newHead.data+"  ");
            newHead = newHead.next;
        }


    }

    private static Node reverseLl(Node head) {
        Node prev = null;
        Node curr = head;
        while(curr != null){
        Node temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
        }
        return prev;
    }
}
