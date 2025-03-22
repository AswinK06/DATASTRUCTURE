import java.util.*;
import java.util.ArrayList;
import java.util.Stack;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
    public static int[] nextLargerNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        int n = values.size();
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && values.get(i) > values.get(stack.peek())) {
                int index = stack.pop();
                result[index] = values.get(i);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            result[stack.pop()] = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(5);

        System.out.println(Arrays.toString(nextLargerNodes(head1)));

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(7);
        head2.next.next = new ListNode(4);
        head2.next.next.next = new ListNode(3);
        head2.next.next.next.next = new ListNode(5);

        System.out.println(Arrays.toString(nextLargerNodes(head2)));
    }
}

