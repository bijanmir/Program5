import java.util.Arrays;

public class Vector<E> extends AbstractListADT {


    private boolean resizeList(){
        capacity *= increment;

        //copy old array to this array
        mylist = Arrays.copyOf(mylist, capacity);
        return mylist != null;
    }

    @Override
    public boolean add(Object data) {
        // Check if full
        if (size == capacity - 1)
            resizeList();

        mylist[size++] = (E)data;
        System.out.println();
        return true;
    }


    @Override
    public boolean insert(int index, Object data) {
        return false;
    }

    @Override
    public boolean contains(Object data) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object data) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object data) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object trimToSize(int size) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}