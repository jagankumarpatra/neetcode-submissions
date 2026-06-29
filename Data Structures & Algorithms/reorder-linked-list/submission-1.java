class Solution {
    public void reorderList(Main.ListNode head) {
        if (head == null || head.next == null) return;

        // Step 1: Find middle
        Main.ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Main.ListNode prev = null, curr = slow.next;
        slow.next = null; // cut the list
        while (curr != null) {
            Main.ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        // Step 3: Merge two halves
        Main.ListNode first = head, second = prev;
        while (second != null) {
            Main.ListNode tmp1 = first.next, tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }
}