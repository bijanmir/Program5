import java.util.Arrays;

public class Vector<E> extends AbstractListADT<E> {

    //TODO: Make sure that your vector grows dynamically. -- Compilation failed
    //TODO: Test that add(E data) and remove(int index) work correctly. Your outpuT //java.lang.IllegalArgumentException: 1 > 0

    public Vector(){
        super();
    }

    public Vector(int capacity){
       super(capacity);
    }

    public Vector(int capacity, int increment){
        super(capacity, increment);
    };

    private boolean resizeList(){
        capacity *= increment;

        //copy old array to this array
        mylist = Arrays.copyOf(mylist, capacity);
        return mylist != null;
    }

    private boolean isFull(){
       return numItems >= capacity - 1;
    }

    private boolean willBeFull(int amount){
        return (numItems + amount) >= capacity - 1;
    }

    public void clear(){

    }

    @Override
    public boolean add(Object data) {
        // Check if full
        if (isFull())
            resizeList();

        mylist[numItems++] = (E)data;
        return true;
    }


    @Override
    public boolean add(int index, Object data) throws IllegalArgumentException {
        if(willBeFull(1)){
            resizeList();
        }
        E[] temp = (E[]) Arrays.copyOfRange(mylist, index, numItems - 1);
        mylist[index] = (E)data;
        System.arraycopy(temp, 0, mylist, index + 1, temp.length);
        numItems++;
        return false;
    }

    @Override
    public boolean contains(Object data) {
        for(int i = 0; i < numItems; i++){
            if(data.equals(mylist[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        return (E) mylist[index];
    }

    @Override
    public int indexOf(E data) {
        for(int i = 0; i < size(); i++){
            if (data.equals(mylist[i]))
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object data) {
        int index = -1;
        for(int i = numItems - 1; i > 0; --i){
            if(data.equals(mylist[i])){
                index = i;
            }
        }
        return index;
    }

    @Override
    public boolean isEmpty() {
        return (numItems == 0);
    }

    @Override
    public E remove(int index) {
        if(index >= numItems && index < 0)
            return null;

        var removedItem = mylist[index];

        if(index == numItems -1) {
            mylist[index] = null;
            numItems--;
            return removedItem;
        }

        E[] temp = (E[])Arrays.copyOfRange(mylist, index + 1, numItems - 1);
        System.arraycopy(temp, 0, mylist, index, temp.length);
        mylist[numItems - 1] = null;
        numItems--;

        return removedItem;
    }

    @Override
    public E trimToSize(int size) {
        capacity = numItems;
        mylist = Arrays.copyOf(mylist, capacity);
        return (E)mylist;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public String toString(){
        return Arrays.toString(mylist);
    }
}