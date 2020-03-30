package List;

public interface List {
    /*
     A list is an ordered collection of elements.

     A list has a length and each element has an index (0-based).

     For now, each element is an integer.
     */

    /**
     * Returns the current value at the given list index.
     *
     * @throws IndexOutOfBoundsException if i < 0 or i >= length
     * @param i The index to get.
     * @return The value in the list at index i.
     */
    int get(int i);

    /**
     * Inserts the value v into the given index.
     *
     * @throws IndexOutOfBoundsException if i < 0 or i >= length
     * @param i The index to insert into.
     * @param v The value to insert into the list.
     */
    void insert(int i, int v);

    /**
     * Replaces the value v into the given index and return the old value.
     *
     * @throws IndexOutOfBoundsException if i < 0 or i >= length
     * @param i The index to replace in the list.
     * @param v The value to replace in the list.
     * @return The value in the list that was replaced
     */
    int replace(int i, int v);

    /**
     * Insert a new element at the end of the list, increasing it's length.
     *
     * @param v The value to insert into the list.
     */
    void addEnd(int v);

    /**
     * Removes the element at the end of the list and returns it.
     *
     * @throws IllegalStateException if the list is empty.
     * @return The element removed from the end of the list.
     */
    int removeEnd();

    /**
     * Clears the contents of the list, setting the length to 0.
     */
    void clear();

    /**
     * @return The current number of elements in the list.
     */
    int getLength();
}
