package stackUsingLinkedlist;

public class StackUsingLinkedList {
    public static void main(String[] args) {
        SLLOperations list = new SLLOperations();
        list.push(list,70);
        list.push(list,30);
        list.push(list,56);

        list.pop(list);
        list.peek(list);

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

    public SLLOperations push(SLLOperations myList, int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next = newNode;
        }
        return myList;
    }

    public SLLOperations pop(SLLOperations myList){
        Node temp=head;
        int test=0;
        while(temp.next!=null) {
            temp=temp.next;
            test++;
        }
        Node temp2=head;
        for (int i = 0; i < test-1; i++) {
            temp2=temp2.next;
        }
        temp2.next=null;
        return myList;
    }

    public SLLOperations peek(SLLOperations myList){
        Node temp=head;
        while(temp.next!=null) {
            temp=temp.next;
        }
        System.out.println("Peek Value in Stack is : " + temp.data);
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