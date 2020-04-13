package Map;

public interface Map {

    /**
     * Associates the given key with the given value in the map, replacing the existing key value pair if it exists.
     *
     * @param key The key to insert into the map
     * @param value The value to insert into the map
     */
    void put(int key, int value);

    /**
     * Returns the value associated with the given key in the map, returning null if the key is not in the map.
     *
     * @param key The key whose value to get
     * @return The value associated with the given key.
     */
    Integer get(int key);

    /**
     * Returns whether the associated key is in the map.
     *
     * @param key The key to check whether it is in the map
     * @return
     */
    boolean containsKey(int key);

    /**
     * Clears the contents of the map, setting the length to 0.
     */
    void clear();

    /**
     * @return The current number of key value pairs in the map.
     */
    int getLength();
}
