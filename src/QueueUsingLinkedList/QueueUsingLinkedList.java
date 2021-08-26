package QueueUsingLinkedList;

public class QueueUsingLinkedList {
    public static void main(String[] args) {

        SLLOperations list = new SLLOperations();
        list.enqueue(list,56);
        list.enqueue(list,30);
        list.enqueue(list,70);

        list.dequeue(list);

        list.display(list);

    }

}

class Node {
    int data;
    Node next;
    public Node(int ele) {
        data = ele;
        next = null;
    }
}

class SLLOperations {

    Node head;

    public SLLOperations enqueue(SLLOperations myList, int element) {
        Node newNode = new Node(element);
        if(head == null) {
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next = newNode;
        }
        return myList;
    }

    public SLLOperations dequeue(SLLOperations myList) {
        head = head.next;
        return myList;
    }

    public void display(SLLOperations myList) {
        if (head == null) {
            System.out.println("Linked list is Empty");
        } else {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

}