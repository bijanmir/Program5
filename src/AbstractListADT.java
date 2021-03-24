public abstract class AbstractListADT<E> implements ListADT<E>{
    protected E[] mylist;
    protected int size;
    protected int increment = 5; // default increment
    protected int capacity;
    protected String id = "Program 5, Bijan Mirfakhrai";

    public void clear(){
        E[] temp = (E[]) new Object[capacity];
        mylist = temp;
        size = 0;
    }

    public int getCapacity(){
        return capacity;
    }

    public String getID(){
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
