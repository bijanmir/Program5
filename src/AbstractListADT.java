public abstract class AbstractListADT<E> implements ListADT<E>{
    protected int size;


    @Override
    public boolean add(E data) {
        return false;
    }

    @Override
    public boolean insert(int index, E data) {
        return false;
    }

    @Override
    public boolean contains(E data) {
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
    public boolean isEmpty(E data) {
        return this.size == 0;
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
        return this.size;
    }
}
