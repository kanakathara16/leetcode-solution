// Last updated: 22/07/2026, 18:58:01
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        if (head == null) return null;
19
20        // **First Pass: Interweave original and copied nodes**
21        Node temp = head;
22        while (temp != null) {
23            Node node = new Node(temp.val);
24            node.next = temp.next;
25            temp.next = node;
26            temp = node.next;
27        }
28
29        // **Second Pass: Assign random pointers**
30        temp = head;
31        while (temp != null) {
32            Node node = temp.next; // The copy
33            // The copy's random pointer points to the next of the original's random pointer
34            node.random = temp.random != null ? temp.random.next : null;
35            temp = node.next; // Move to the next original node
36        }
37
38        // **Third Pass: Separate the two lists**
39        temp = head;
40        Node newHead = head.next;
41        while (temp != null) {
42            Node node = temp.next;
43            // Restore original list's next pointer
44            temp.next = node.next; 
45            
46            // Set copied list's next pointer
47            if (node.next != null) {
48                node.next = node.next.next;
49            }
50            
51            // Move to the next original node
52            temp = temp.next; 
53        }
54        
55        return newHead;
56    }
57}