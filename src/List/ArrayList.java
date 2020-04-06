package List;

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

    // returns whether the index is valid 0 < i < length, if not, throws an exception
    private void checkIndex(int i) {
        if (i < 0 || i >= this.length) {
            throw new IndexOutOfBoundsException("Invalid index " + i);
        }
    }

    // resizes and copies over the underlying buffer with newBufferSize
    private void resize(int newBufferSize) {
        if (newBufferSize <= data.length) {
            String errorMsg = "Requested buffer of " + newBufferSize + " but current buffer size is " + data.length;
            throw new IllegalArgumentException(errorMsg);
        }

        int[] newData = new int[newBufferSize];
        if (length >= 0) System.arraycopy(data, 0, newData, 0, length);

        data = newData;
    }

    @Override
    public int get(int i) {
        checkIndex(i);
        return data[i];
    }

    @Override
    public void insert(int i, int v) {
        checkIndex(i);

        // append to end of array, possibly resizing
        int oldLength = length;
        addEnd(0);

        // now underlying data is the correct size
        if (oldLength - 1 - i >= 0) System.arraycopy(data, i, data, i + 1, oldLength - 1 - i);
        data[i] = v;
    }

    @Override
    public int replace(int i, int v) {
        checkIndex(i);
        int old = data[i];
        data[i] = v;
        return old;
    }

    @Override
    public void addEnd(int v) {
        if (length == data.length) {
            resize(data.length * 2);
        }

        data[length] = v;
        length++;
    }

    @Override
    public int removeEnd() {
        if (length == 0) {
            throw new IllegalStateException("List is empty!");
        }

        return data[--length];
    }

    @Override
    public void clear() {
        length = 0;
    }

    @Override
    public int getLength() {
        return this.length;
    }
}
