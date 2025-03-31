package LinkedList;

public class LL {

    Node head;
    private int size;

    LL(){
        size=0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        
        if(newNode == null){
            head = newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
        size++;
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    //Remove From First
    public void removeFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;

    }

    //Remove Last
    public void removeLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    public void printList(){
        Node currNode = head;

        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public int getSize(){
        return size;
    }

    // public void reverseIterate(){
    //     if(head==null || head.next==null){
    //         return;
    //     }

    //     Node currNode = head;
    //     Node nextNode = head
    // }
    public static void main(String[] args) {
        LL list = new LL(); 
        list.addFirst("all");
        list.addFirst("list");
        list.addLast("Anky");
        list.printList();
        System.out.println(list.getSize());
        list.removeFirst();
        list.printList();
        System.out.println(list.getSize());
        list.removeLast();
        list.printList();
        System.out.println(list.getSize());

    }
}
