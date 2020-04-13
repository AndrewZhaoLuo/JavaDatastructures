package Map;
import java.util.ArrayList;
import javafx.util.Pair;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Assignment:
 * 1. Fill out class using chained hashing:
 * https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-006-introduction-to-algorithms-fall-2011/lecture-videos/MIT6_006F11_lec08.pdf
 * 2. Write tests
 * 3. Benchmark your hashmap class
 */
public class HashMap implements Map {
    public static final int DEFAULT_ARRAY_SIZE = 10;
    private int length;

    ArrayList<Pair<Integer, Integer>>[] buckets;

    public HashMap() {
        this(DEFAULT_ARRAY_SIZE);
    }

    public HashMap(int bufferSize) {
        buckets = new ArrayList[bufferSize];
        for(int i = 0; i < bufferSize; i++){
            buckets[i] = new ArrayList<>();
        }
        length = 0;
    }

    @Override
    public void put(int key, int value) {
        throw new NotImplementedException();
    }

    @Override
    public Integer get(int key) {
        throw new NotImplementedException();
    }

    @Override
    public boolean containsKey(int key) {
        throw new NotImplementedException();
    }

    @Override
    public void clear() {
        throw new NotImplementedException();
    }

    @Override
    public int getLength() {
        throw new NotImplementedException();
    }

    public static int hashInt(int integer) {
        // Use this hash function for now
        return (integer ^ (integer >>> 16)) * 31;
    }
}
