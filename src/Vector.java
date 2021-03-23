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

    @Override
    public boolean add(Object data) {
        // Check if full
        if (isFull())
            resizeList();

        mylist[numItems++] = (E)data; // add item to the list usin
        System.out.println(Arrays.toString(mylist));
        System.out.printf("Size = %d", numItems);
        return true;
    }


    @Override
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
        for(var item : mylist)
            if(item == data)
                return true;
        return false;
    }

    @Override
    public E get(int index) {

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
        return false;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E trimToSize(int size) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}