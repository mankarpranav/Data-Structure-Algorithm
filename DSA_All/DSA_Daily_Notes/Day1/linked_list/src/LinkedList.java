public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }

    public boolean insert(int data) {
        //create and initialize the node
        Node newNode = new Node(data);

        /*The list is empty, so the newnode becomes the first node*/
        if(head == null) {
            head = newNode;
            return true;
        }

        /*the list is not empty so locate last node and link newnode to last node*/
        /*Never use head ref to iterate through the list, that way you would lose the linked list*/

        Node last = head;
        while(last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(newNode);

        return true;
    }

    public boolean insert(int data, int position) {
        if(position <= 0) {
            return false;
        }

        Node newNode = new Node(data);
        
        if(position == 1) {
            newNode.setNext(head);
            head = newNode;
            return true;
        }

        //position is not 1, locate the node at pos - 1
        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev == null) {
                return false; //position is invalid
            }

        }

        newNode.setNext(prev.getNext());
        prev.setNext(newNode);

        return true;

    }

    public void display() {
        Node temp = head;

        //while(temp.getNext() != null) { //this condition will not display last node
        while(temp != null) {
            System.out.print(temp.getData()  + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }


}
