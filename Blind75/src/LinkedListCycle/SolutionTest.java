package LinkedListCycle;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void testNoRepeats() {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2; // creates cycle

        Solution llc = new Solution();
        assertTrue(llc.hasCycle(n1));
    }

    @Test
    public void testNoCycle() {
        LinkedListCycle.ListNode n1 = new LinkedListCycle.ListNode(1);
        LinkedListCycle.ListNode n2 = new LinkedListCycle.ListNode(2);
        n1.next = n2;

        Solution llc = new Solution();
        assertFalse(llc.hasCycle(n1));
    }
    @Test
    public void custom() {
     LinkedListCycle.ListNode n1  = new LinkedListCycle.ListNode(-1);
        LinkedListCycle.ListNode n2  = new LinkedListCycle.ListNode(-7);
        LinkedListCycle.ListNode n3  = new LinkedListCycle.ListNode(7);
        LinkedListCycle.ListNode n4  = new LinkedListCycle.ListNode(-4);
        LinkedListCycle.ListNode n5  = new LinkedListCycle.ListNode(19);
        LinkedListCycle.ListNode n6  = new LinkedListCycle.ListNode(6);
        LinkedListCycle.ListNode n7  = new LinkedListCycle.ListNode(-9);
        LinkedListCycle.ListNode n8  = new LinkedListCycle.ListNode(-5);
        LinkedListCycle.ListNode n9  = new LinkedListCycle.ListNode(-2);
        LinkedListCycle.ListNode n10 = new LinkedListCycle.ListNode(-5);

        n1.next  = n2;
        n2.next  = n3;
        n3.next  = n4;
        n4.next  = n5;
        n5.next  = n6;
        n6.next  = n7;
        n7.next  = n8;
        n8.next  = n9;
        n9.next  = n10;

// Optional: create cycle (example: pos = 2 → connect last node to n3)
        n10.next = n3; // remove this line if no cycle


        Solution llc = new Solution();
        assertTrue(llc.hasCycle(n1));
    }

}