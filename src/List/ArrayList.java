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
            throw new IndexOutOfBoundsException(("Invalid index ") + i);
        }

        return data[i];
    }

    @Override
    public void insert(int i, int v) {
        // Check the index first
        if (i < 0 || i > this.length) {
            throw new IndexOutOfBoundsException(("Invalid index: ") +i);
        }

        // check the new array size first: if within default size, then ok. Otherwise, allocate more.
        int len = ++this.length;
        if (len > DEFAULT_ARRAY_SIZE)
        {
            // allocate more space
            ArrayList tmp = new ArrayList(len);
            for (int n= 0; n < len-1; n++) {
                tmp.data[n]= this.data[n];
            }

            // new array size
            this.data = new int[++len];
            for (int m= 0; m< len-1; m++) {
                this.data[m]= tmp.data[m];
            }
        }

        // move the data to the later elements
        for (int j = len -1; j > i; j--) {
            data[j] = data [j-1];
        }

        // assign the value
        data[i] = v;
        // throw new NotImplementedException();
    }

    @Override
    public int replace(int i, int v) {
        // Check the index first
        if (i < 0 || i>= this.length) {
            throw new IndexOutOfBoundsException(("Invalid index: ") +i);
        }

        int old_value = data[i];
        data[i] = v;

        return old_value;
        // throw new NotImplementedException();
    }

    @Override
    public void addEnd(int v) {
        int len = ++this.length;

        if(len > DEFAULT_ARRAY_SIZE) {
            // copy the data over to the tmp
            ArrayList tmp = new ArrayList(len);
            for(int i=0; i < len-1; i++) {
                tmp.data[i] = this.data[i];
            }
            // resize the current List
            this.data = new int[len];
            for(int i=0; i<len; i++) {
                this.data[i] = tmp.data[i];
            }
        }
        data[len-1] = v;
        // throw new NotImplementedException();
    }

    @Override
    public int removeEnd() {
        if (this.length == 0) {
            throw new IllegalStateException();
        }

        int end_value = data[this.length-1];
        this.length--;

        return end_value;
        // throw new NotImplementedException();
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.length; i++) {
            data[i] = 0;
        }
        this.length = 0;
        // throw new NotImplementedException();
    }

    @Override
    public int getLength() {
        return this.length;
    }
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
