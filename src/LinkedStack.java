public class LinkedStack implements Stack {
    private Node head;
    private int size;

    private class Node {
        private Object value;
        private Node next;


        private Node(Node next, Object value){
            this.next = next;
            this.value = value;
        }
    }
    public void push(Object element) {
        size++;
        head = new Node(head, element);
    }
    public Object pop(){
        if (head == null){
            return null;
        }
        Object value = head.value;
        head = head.next;
        size--;
        return value;
    }
    public Object peek(){
        if (head == null){
            return null;
        }

        return head.value;
    }
    public int size(){
        return size;
    }
}

