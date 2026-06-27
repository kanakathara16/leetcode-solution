// Last updated: 27/06/2026, 09:10:12
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13
14        ListNode preTail = null;        // stores the tail node of previous LL.
15        ListNode curHead = head;        // stores the head node of current LL
16        ListNode curTail = head;        // stores the tail node of current LL
17
18        ListNode nextHead = null;       // stores the head node of next LL
19
20        while(curHead != null)
21        {
22            // initialize count from 1
23            int count = 1;
24
25            // iterate the LL untill count becomes k or we reach the last node.
26            while(curTail.next != null && count < k)
27            {
28                curTail = curTail.next;
29                count++;
30            }
31
32            if(count != k)
33            {
34                break;
35            }
36            
37            // set the nextHead pointer to the head of the next LL.
38            nextHead = curTail.next;
39
40
41            // detach the RHS of the current LL.
42            curTail.next = null;
43
44            // detach the LHS of the current LL.
45            if(preTail != null)
46            {
47                preTail.next = null;
48            }
49
50            // after reversing the current LL, curHead becomes the new tail.
51            // and curTail becomes the new head.
52
53            curTail = reverse(curHead);
54
55            // attach the LHS
56            if(preTail != null)
57            {
58                preTail.next = curTail;
59            }
60            else
61            {
62                // if preTail is null then we have reversed the first LL
63                // so store the reference of curHead in original head pointer.
64                head = curTail;
65            }
66
67            // attach the RHS
68            curHead.next = nextHead;
69            
70            // update the pointer
71            preTail = curHead;
72            curHead = nextHead;
73            curTail = nextHead;
74        }
75
76        return head;
77        
78    }
79    private ListNode reverse(ListNode head)
80    {
81        ListNode preNode = null;
82        ListNode curNode = head;
83
84        ListNode nextNode = head;
85
86        while(curNode != null)
87        {
88            nextNode = nextNode.next;
89            
90            curNode.next = preNode;
91
92            preNode = curNode;
93            curNode = nextNode;
94        }
95        return preNode;
96    }
97}