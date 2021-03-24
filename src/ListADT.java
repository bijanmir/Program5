public interface ListADT<E> {
    /** THE STUDENT MUST WRITE THE METHOD HEADERS. THE FIRST ONE IS DONE FOR YOU **/

    /**
     * Appends the specified element to the end of this list
     *
     * @param data
     * @return boolean
     */
    boolean add(E data);

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements by adding one to their indices.
     *
     * @param index - index at which the specified element is to be inserted
     * @param data  - element to be inserted
     * @return boolean
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())
     */

    boolean add(int index, E data);


    /**
     * Returns true if this list contains the specified element
     *
     * @param data
     * @return boolean
     */
    boolean contains(E data);

    /**
     * Returns the element at the specified position in this list
     *
     * @param index
     * @return E
     */
    E get(int index);

    /**
     * Returns the index of the first occurrence of the specified element in this list
     * Return, or -1 if this list does not
     * contain the element
     *
     * @param data
     * @return int
     */
    int indexOf(E data);

    /**
     * Returns the index of the last matching of the element in this list
     * Return -1 if no match
     *
     * @param data
     * @return int
     */
    int lastIndexOf(E data);

    /**
     * Returns true if this list contains no elements
     *
     * @return boolean
     */

    boolean isEmpty();

    /**
     * Removes the  element at the specified position in this list.
     * Shifts any subsequent elements by subtracting one from their indices.
     *
     * @param index - index of the element to be removed
     * @return E - the element that was removed from the list
     * IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
     */
    E remove(int index);

    /**
     * Trims the capacity of this Vector instance to be the list's current size. An application
     * can use this operation to minimize the storage of a Vector instance.
     * <p>
     * This is test
     * <p>
     * This is another test
     */

    E trimToSize(int size);

    /**
     * Returns the number of elements in this list
     *
     * @return int
     */
    int size();
}