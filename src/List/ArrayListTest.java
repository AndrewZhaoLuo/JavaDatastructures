package List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    @Test
    void get() {
        ArrayList testList = new ArrayList();

        int run = ArrayList.DEFAULT_ARRAY_SIZE * 2;
        for (int i = 0; i < run; i++) {
            testList.addEnd(i);
            assertEquals(i + 1, testList.getLength());
        }
        for (int i = 0; i < run; i++) {
            assertEquals(i, testList.get(i));
        }

        assertThrows(IndexOutOfBoundsException.class, () -> testList.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> testList.get(run));
    }

    @Test
    void insert() {
        ArrayList testList = new ArrayList();

        int run = ArrayList.DEFAULT_ARRAY_SIZE * 2;
        testList.addEnd(0);
        for (int i = 1; i < run; i++) {
            testList.insert(0, i);
            assertEquals(i + 1, testList.getLength());
        }
        for (int i = 0; i < run; i++) {
            assertEquals(run - i - 1, testList.get(i));
        }

        assertThrows(IndexOutOfBoundsException.class, () -> testList.insert(-1, -1));
        // assertThrows(IndexOutOfBoundsException.class, () -> testList.insert(run, run));
    }

    @Test
    void replace() {
        ArrayList testList = new ArrayList();

        int run = ArrayList.DEFAULT_ARRAY_SIZE * 2;
        for (int i = 0; i < run; i++) {
            testList.addEnd(i);
            assertEquals(i + 1, testList.getLength());
        }

        int shift = run + 1;
        for (int i = 0; i < run; i++) {
            assertEquals(i, testList.replace(i, i + shift));
        }
        for (int i = 0; i < run; i++) {
            assertEquals(i + shift, testList.get(i));
        }

        assertThrows(IndexOutOfBoundsException.class, () -> testList.replace(-1, -1));
        assertThrows(IndexOutOfBoundsException.class, () -> testList.replace(run, run));
    }

    @Test
    void addEnd() {
        ArrayList testList = new ArrayList();
        testList.addEnd(1000);
        assertEquals(1000, testList.get(0));
        assertEquals(1, testList.getLength());
    }

    @Test
    void removeEnd() {
        ArrayList testList = new ArrayList();
        assertThrows(IllegalStateException.class, testList::removeEnd);

        int run = ArrayList.DEFAULT_ARRAY_SIZE * 2;
        for (int i = 0; i < run; i++) {
            testList.addEnd(i);
            assertEquals(i + 1, testList.getLength());
        }

        assertEquals(run - 1, testList.removeEnd());
    }

    @Test
    void clear() {
        ArrayList testList = new ArrayList();
        int run = ArrayList.DEFAULT_ARRAY_SIZE * 2;
        for (int i = 0; i < run; i++) {
            testList.addEnd(i);
        }

        testList.clear();
        assertEquals(0, testList.getLength());
        assertThrows(IllegalStateException.class, testList::removeEnd);
    }

    @Test
    void getLength() {
        ArrayList testList = new ArrayList();
        testList.addEnd(1);
        assertEquals(1, testList.getLength());
        testList.removeEnd();
        assertEquals(0, testList.getLength());
    }
}
