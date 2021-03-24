import java.util.Arrays;

public class Vector<E> extends AbstractListADT<E> {


    private boolean resizeList(){
        capacity *= increment;  // Increase the capacity by the increment value

        //copy old array to this array
        mylist = Arrays.copyOf(mylist, capacity);
        return mylist != null;     // returns true if list is not empty : false if list is empty
    }

    private boolean isFull(){
        return numItems == capacity - 1;
    }

    private boolean isFull(){
       return numItems >= capacity - 1;
    }

    private boolean willBeFull(int amount){
        return (numItems + amount) >= capacity - 1;
    }

    @Override
    public boolean add(Object data) {
        // Check if full
        if (isFull())
            resizeList();


        mylist[numItems++] = (E)data;

        mylist[numItems++] = (E)data; // add item to the list usin
        System.out.println(Arrays.toString(mylist));
        System.out.printf("Size = %d", numItems);

        return true;
    }


    @Override

    public boolean insert(int index, Object data) {
        if(willBeFull(1)){
            resizeList();
        }
        E[] temp = (E[]) Arrays.copyOfRange(mylist, index, numItems - 1);
        mylist[index] = (E)data;
        System.arraycopy(temp, 0, mylist, index + 1, temp.length);
        numItems++;
        return false;

    public boolean insert(int index, E data) {
        // if the list is empty
        if (isEmpty())
            return false;

        var result = new Object[numItems + 1]; // create a new list with 1 more space than the original array

        for (int i = 0; i < index; i++){   // copy first half of the array to result array
            result[i] = mylist[i];
        }

        result[index] = data;

        for (int i = index; i < result.length; i++){
            result[i] = mylist[i];
        }

        mylist = (E[]) result;

        return true;

    }

    @Override
    public boolean contains(Object data) {

        for(int i = 0; i < numItems; i++){
            if((E) data == mylist[i]){
                return true;
            }
        }

        for(var item : mylist)
            if(item == data)
                return true;

        return false;
    }

    @Override
    public E get(int index) {

        return (E) mylist[index];
    }

    @Override
    public int indexOf(Object data) {
        for(int i = 0; i < numItems; i++){
            if((E) data == mylist[i])
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object data) {
        int index = -1;
        for(int i = numItems - 1; i > 0; --i){
            if(mylist[numItems] == (E) data){
                index = i;
            }
        }
        return index;


        return null;
    }

    @Override
    public int indexOf(E data) {
        return 0;
    }

    @Override
    public int lastIndexOf(E data) {
        return 0;

    }

    @Override
    public boolean isEmpty() {
        return (numItems > 0);
    }

    @Override
    public E remove(int index) {

        if(index < numItems && index > 0)
            return null;

        E[] temp = (E[])Arrays.copyOfRange(mylist, index + 1, numItems - 1);
        System.arraycopy(temp, 0, mylist, index, temp.length);
        mylist[numItems - 1] = null;
        numItems--;
        return (E) mylist;
    }

    @Override
    public Object[] trimSize() {
        capacity = numItems;
        mylist = Arrays.copyOf(mylist, capacity);
        return mylist;

        return null;
    }

    @Override
    public E trimToSize(int size) {
        return null;

    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public void printArray(){
        System.out.println(Arrays.toString(mylist));
    }
}