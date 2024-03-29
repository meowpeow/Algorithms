package algorithms.datastructures;

class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // firstNode = null;

    public void append(int d) {

        // Stage A. Creating node if list is empty.
        if (head == null) {             // in case of empty linked list
            head = new Node(d);         // we gonna create head(first) element
            return;
        }
        // Stage B. Creating a new node for not empty list.
        Node newNode = new Node(d);     // NextNode assigned, getting data d
        newNode.next = null;            // and null address of next node.

        // Stage C. Connecting newNode to preLast node(node before that one we added), by assigning newNode address.
        Node preLast = head;                // iterate FROM head

        while (preLast.next != null) {      // TO prelast(object we have just created) element (who still has next NULL)
            preLast = preLast.next;         // and make new head(for a time being).
        }

        preLast.next = newNode;             // and finally CONNECT them by assigning address of new Node to prelast node.
    }

    public static void printList(LinkedList list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }
}

public class LinkedListTest2 {
    public static void main(String[] args) {
        int inputValue = 5;

//        define constructor
        LinkedList ll1 = new LinkedList();
//        define methods we implemented
        ll1.append(1);
        ll1.append(2);
        ll1.append(3);
        ll1.append(4);
        ll1.append(5);
        ll1.append(6);

        ll1.printList(ll1);

    }
}
