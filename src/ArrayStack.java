public class ArrayStack implements Stack {
    private Object[] elements = new Object[0];
    private int size;



    public int size(){
        return size;
    }

    public void push(Object value){
        ensureCapacity(size + 1);
        elements[size++] = value;
    }
    public void PutIn(int pos, Object value) {
        push(elements[size]);
        Object temp = elements[pos];
        elements[pos]=value;
        for( int i = size - 1; i > pos; i--)
        {
            elements[i]=elements[i-1];
        }
        elements[pos+1]=temp;
    }
    public void ensureCapacity(int capacity){
        if (elements.length >= capacity ) {
            return;
        }
        Object[] newElements = new Object[capacity * 2];
        for (int i=0; i < size; i++){
            newElements[i] = elements[i];
        }
        elements = newElements;
    }
    public Object pop(){
        if(size==0){
            return null;
        }
        return elements[--size];
    }
    public Object peek(){
        if( size == 0){
            return null;
        }
        return elements[size - 1];
    }

    public void OutA() {
        System.out.println("\nArray:");
        for (int i=0; i<size ; i++)
        {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
