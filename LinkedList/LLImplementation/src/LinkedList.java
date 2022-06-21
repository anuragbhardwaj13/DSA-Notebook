public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    public LinkedList(){
        head=tail=null;
        this.size=0;

    }

    public void addFirst(T data){
        Node<T> node=new Node<T>(data);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void addLast(T data){
        if(tail==null){
            addFirst(data);
            return;
        }
        Node<T> node=new Node<T>(data);
       tail=node;
       tail.next=null;
       size++;
    }

    public void print(Node<T> head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

}
