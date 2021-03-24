public abstract class AbstractListADT<E> implements ListADT<E>{
    protected E[] mylist;
    protected int size;
    protected int increment = 2; // default increment
    protected int capacity;
    protected String id = "Program 5, Bijan Mirfakhrai";

    public int getCapacity(){
        return capacity;
    }

    public String getId(){
        return id;
    }

    public int getIncrement(){
        return increment;
    }

    protected void initialization(){
        size = 0;
        mylist = (E[]) new Object[capacity]; // Create new Array with Default Capacity
    }

    public AbstractListADT(){
        // initialize variables
        capacity = 10;  // Default Capacity
        initialization();
    }


    public AbstractListADT(int capacity){
        this.capacity = capacity;
        initialization();
    }

    public AbstractListADT(int capacity, int increment){
        this.capacity = capacity;
        this.increment = increment;
        initialization();
    };





}
