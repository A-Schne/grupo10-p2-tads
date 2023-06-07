package Queue.Entities;

public class Node<Tipo> {
    private Tipo value;
    private Linked_List.Entities.Node next;
    private Linked_List.Entities.Node prev;

    public Tipo getValue() {
        return value;
    }

    public void setValue(Tipo value) {
        this.value = value;
    }

    public Linked_List.Entities.Node getNext() {
        return next;
    }

    public void setNext(Linked_List.Entities.Node next) {
        this.next = next;
    }

    public Linked_List.Entities.Node getPrev() {
        return prev;
    }

    public void setPrev(Linked_List.Entities.Node prev) {
        this.prev = prev;
    }

    public Node(Tipo value){
        this.value = value;
        this.next = null;
    }
}