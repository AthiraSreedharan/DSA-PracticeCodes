public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList linkedlist=new LinkedList();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.remove(1);
        linkedlist.getList();
    }
}

class Node{

    private int data;
    private Node next;

    public Node()
    {

    }

    public Node(int data){
        this.data=data;
    }
    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    public void setData(int data) {
        this.data=data;
    }
    public int getData(){
        return data;
    }
    public void setNext(Node next) {
        this.next=next;
    }
    public Node getNext() {
        return next;
    }
}
class LinkedList{
    Node head;
    public LinkedList()
    {

    }

    public LinkedList(Node head){
        this.head=head;
    }

    public void add(int val){
        Node toAdd=new Node(val);
        if(head==null) {
            head = toAdd;
        }
        else{
            Node temp=head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(toAdd);
        }

    }
    public void remove(int index){
        int counter=0;
        Node toDelete=new Node();
        if(index==0){
            head=head.getNext();
        }
        else{
            Node temp=head;
            while(counter<index-1){
                temp=temp.getNext();
                counter++;
            }
            toDelete=temp.getNext();
            temp.setNext(toDelete.getNext());
        }

    }
    public void getList(){
        Node temp=head;
        while(temp.getNext()!=null)
        {
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
        System.out.println(temp.getData());
    }
}

