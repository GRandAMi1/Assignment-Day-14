public class LinkedList {
    public static void main(String[] args) {
        SLLOperations list = new SLLOperations();

        list.Add(list,56);
        list.Add(list,30);
        list.Add(list,70);
        list.RemoveFirst(list);


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
    public SLLOperations AddFirst(SLLOperations myList, int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return myList;
    }
    public SLLOperations Add(SLLOperations myList, int element) {
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

    public SLLOperations Append(SLLOperations myList, int element) {
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

    public SLLOperations Addnthposition(SLLOperations myList, int element, int position){
        Node newNode = new Node(element);
        if (head==null){
            System.out.println("Your Linked list is Empty plz use AddFirst method to get started");
        }
        else {
            if (position==1){
                AddFirst(myList,element);
            }
            else {
                int counter = 1;
                Node temp = head;
                while (counter < position - 1) {
                    temp = temp.next;
                    counter++;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
        return myList;
    }

    public SLLOperations Removenthposition(SLLOperations myList, int position){
        if (head==null){
            System.out.println("Your Linked list is Empty !!!");
        }
        else {
            if (position==1){
                RemoveFirst(myList);
            }
            else {
                int counter = 1;
                Node temp = head;
                while (counter < position - 1) {
                    temp = temp.next;
                    counter++;
                }
                Node temp2=temp;
                temp2 = temp2.next;

                temp.next=temp2.next;
                temp2.next=null;

            }
        }
        return myList;
    }
    public SLLOperations RemoveFirst(SLLOperations myList){
        head=head.next;
        return myList;
    }

    public SLLOperations RemoveLast(SLLOperations myList){
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
//        System.out.println("Total Nodes available : " + (test+1));
        return myList;
    }

    public void display(SLLOperations myList) {
        if (head == null) {
            System.out.println("Linked list is Empty");
        } else {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
}

