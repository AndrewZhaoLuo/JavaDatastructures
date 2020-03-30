package List;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ArrayList implements List{
    public static final int DEFAULT_ARRAY_SIZE = 10;
    private int length;
    private int[] data;

    public ArrayList() {
        // This invokes `public ArrayList(int buffer)` using DEFAULT_ARRAY_SIZE
        // allowing to reuse the code below.
        this(DEFAULT_ARRAY_SIZE);
    }

    public ArrayList(int buffer) {
        // Create an initial array with some buffer size.
        // The "this" keyword means the variables changed are the class variables.
        this.data = new int[buffer];
        this.length = 0;
    }

    @Override
    public int get(int i) {
        // An example of throwing an exception.
        if (i < 0 || i >= this.length)  {
            throw new IndexOutOfBoundsException("Invalid index " + i);
        }

        return data[i];
    }

    @Override
    public void insert(int i, int v) {
        throw new NotImplementedException();
    }

    @Override
    public int replace(int i, int v) {
        throw new NotImplementedException();
    }

    @Override
    public void addEnd(int v) {
        throw new NotImplementedException();
    }

    @Override
    public int removeEnd() {
        throw new NotImplementedException();
    }

    @Override
    public void clear() {
        throw new NotImplementedException();
    }

    @Override
    public int getLength() {
        return this.length;
    }
}
