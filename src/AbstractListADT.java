public abstract class AbstractListADT<E> implements ListADT<E>{
    protected E[] mylist;
    protected int numItems;
    protected int increment = 2; // default increment
    protected int capacity;

    //-----------INITIALIZATION SECTION ------------ //

    @SuppressWarnings("unchecked")
    protected void initialization(){
        numItems = 0;                        // Set Number of Items
        capacity = 10;                       // Set Default Capacity
        mylist = (E[]) new Object[capacity]; // Create new Array with Default Capacity
    }

    // Overload method to take CAPACITY at initialization
    @SuppressWarnings("unchecked")
    protected void initialization(int capacity){
        numItems = 0;
        this.capacity = capacity;
        mylist = (E[]) new Object[capacity]; // Create new Array with Default Capacity
    }

    // Overload method to take CAPACITY & INCREMENT at initialization
    @SuppressWarnings("unchecked")
    protected void initialization(int capacity, int increment){
        numItems = 0;
        this.capacity = capacity;
        this.increment = increment;
        mylist = (E[]) new Object[capacity]; // Create new Array with Default Capacity
    }

    //-----------CONSTRUCTORS SECTION ------------ //

    public AbstractListADT(){
        initialization();
      
        System.out.println("Initialized From AbstractListADT() ");
    }

    public AbstractListADT(int capacity){
        initialization(capacity);

        System.out.println("Initialized From AbstractListADT(int capacity) ");
    }

    public AbstractListADT(int capacity, int increment){
        initialization(capacity, increment);

        System.out.println("Initialized From AbstractListADT(int capacity, increment) ");
    };


}
