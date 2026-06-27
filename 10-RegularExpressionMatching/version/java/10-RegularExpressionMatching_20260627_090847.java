// Last updated: 27/06/2026, 09:08:47
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public static ListNode merge(ListNode head1,ListNode head2){
13        ListNode mergedLL = new ListNode(-1);
14        ListNode temp = mergedLL;
15        while(head1 !=null && head2!=null){
16            if(head1.val <= head2.val){
17                temp.next=head1;
18                temp=temp.next;
19                head1=head1.next;
20            }
21            else{
22                temp.next=head2;
23                temp=temp.next;
24                head2=head2.next;
25            }
26        }
27        while(head1 != null){
28            temp.next=head1;
29            temp=temp.next;
30            head1=head1.next;
31        }
32        while(head2 != null){
33            temp.next=head2;
34            temp=temp.next;
35            head2=head2.next;
36        }
37        return mergedLL.next;
38    }
39    public ListNode sortList(ListNode head) {
40        if(head == null || head.next == null){
41            return head;
42        }
43        ListNode slow = head;
44        ListNode fast = head.next;
45        while(fast.next != null && fast.next.next != null){
46            slow = slow.next;
47            fast = fast.next.next;
48        }
49        ListNode right = slow.next;
50        slow.next = null;
51        ListNode newLeft = sortList(head);
52        ListNode newRight = sortList(right);
53        return merge(newLeft , newRight);
54    }
55    public ListNode mergeKLists(ListNode[] lists) {
56        int n = lists.length;
57        ListNode head = new ListNode(0);
58        ListNode temp = head;
59        for (int i=0; i < n; i++) {
60            temp.next = lists[i];
61            while(temp.next != null){
62                temp = temp.next;
63            }
64        }
65        return sortList(head.next);
66    }
67}