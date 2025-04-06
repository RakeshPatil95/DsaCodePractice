package leetCode;


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode());
        list1.val = 1;
        list1.next = new ListNode(2, new ListNode());
        list1.next.next.val = 4;

        ListNode list2 = new ListNode(1, new ListNode());
        list2.val = 1;
        list2.next = new ListNode(3, new ListNode());
        list2.next.next.val = 4;
        System.out.println(mergeTwoLists(list1, list2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode  result= null;
        int list1Length = 0;
        ListNode temp1 = list1;
        while (temp1 != null) {
            list1Length++;
            temp1 = temp1.next;
        }
        int list2Length = 0;
        ListNode temp2 = list2;
        while (temp2 != null) {
            list2Length++;
            temp2 = temp2.next;
        }

        int itr = Math.min(list2Length, list1Length);
        while (itr != 0) {
            if (list1.val >= list2.val) {
                ListNode newNode = new ListNode(list1.val);
                if (result == null) {
                    result = newNode;
                } else {
                    result.next = newNode;
                }
                list1 = list1.next;
            } else {
                ListNode newNode = new ListNode(list2.val);
                if (result == null) {
                    result = newNode;
                } else {
                    result.next = newNode;
                }
                list2 = list2.next;
            }
            itr--;
        }
        ListNode temp = result;
        while (temp != null) {
            System.out.print(" " + temp.val);
            temp = temp.next;
        }
        return result;
    }
}
