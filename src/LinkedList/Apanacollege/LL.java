package LinkedList.Apanacollege;

public class LL {
    Node head; private int size;

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=next;
        }

    }

    //add-first,last
    public void addFirst(String data){
            Node newNode=new Node(data);  
            if (head==null) {
                head=newNode;
                return;
            } 
            newNode.next=head;
            head=newNode;
    }
   
    public void addLast(String data){
        Node newNode=new Node(data);  
        if (head==null) {
            head=newNode;
            return;
        } 
        Node currNode=head;
        while (currNode.next!=null) {
            currNode=currNode.next;
        }
        currNode.next=newNode;
}

//print
    public void printList(){
        if (head==null) {
            System.out.println("list is empty");
            return;
        }
      Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data+"->");
        currNode=currNode.next;
    }
        System.out.println("NULL");
}
public void removeFirst() {
    if(head == null) {
        System.out.println("Empty List, nothing to delete");
        return;
    }

    head = this.head.next;
    size--;
}

public void removeLast() {
    if(head == null) {
        System.out.println("Empty List, nothing to delete");
        return;
    }

    size--;
    if(head.next == null) {
        head = null;
        return;
    }

    Node currNode = head;
    Node lastNode = head.next;
    while(lastNode.next != null) {
        currNode = currNode.next;
        lastNode = lastNode.next;
    }

    currNode.next = null;
}

public int getSize() {
    return size;
}

    
    
   
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");

        list.printList();

        list.addFirst("this");
        list.printList();
       
        
    }
}
