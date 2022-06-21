public class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;
        next=null;
    }
    Node(T data,Node<T> next){
this.data=data;
this.next=next;
    }
}
