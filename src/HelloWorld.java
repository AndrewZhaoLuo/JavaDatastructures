import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(0);
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(0);
        list.add(6);
        list.add(0);
        list.add(8);
        list.add(0);
        list.add(10);
        list.add(0);
        list.add(12);
        list.add(0);
        list.add(14);
        list.add(0);
        list.add(16);
        System.out.println(list);

        removeInRange(list, 0, 5, 13);
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(3);
        list1.add(8);
        list1.add(92);
        list1.add(4);
        list1.add(2);
        list1.add(17);
        list1.add(9);

        minToFront(list1);
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("a");
        list2.add("b");
        list2.add("c");

        mirror(list2);
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(4);
        list3.add(7);
        list3.add(9);
        list3.add(2);
        list3.add(7);
        list3.add(7);
        list3.add(5);
        list3.add(3);
        list3.add(5);
        list3.add(1);
        list3.add(7);
        list3.add(8);
        list3.add(6);
        list3.add(7);


        filterRange(list3, 5, 7);
        System.out.println(list3);
    }


    public static void removeInRange(ArrayList<Integer> alist, int value, int startind, int endind) {
        int len = alist.size();
        // Boundary checks
        // check the list
        if (len == 0) {
            throw new NullPointerException("Empty ArrayList");
        }

        // check the index
        if (startind < 0 || endind >= len) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if ((startind == endind) && (alist.get(startind) == value) ){
            alist.remove(startind);
        }
        else {
            for (int i = startind; i < endind; i++) {
                if ((alist.get(i)) == value) {
                    alist.remove(i--);
                    endind--;
                }
            }
        }
    }

    public static void minToFront(ArrayList<Integer> list){
        int len = list.size();
        // Boundary checks
        // check the list
        if (len <= 0 ) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        int min = list.get(0);
        for(int i=0; i<len; i++){
            if(min > list.get(i)){
                min=list.get(i);
            }
        }

        list.remove(list.indexOf(min));
        list.add(0, min);
    }

    public static void mirror(ArrayList<String> slist){
        int len = slist.size();
        // Boundary checks
        // check the list
        if (len <= 0 ) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        for(int i = len-1; i >= 0; i--){
            slist.add(slist.get(i));
        }
    }

    public static void filterRange(ArrayList<Integer> ilist, int min, int max){
        int len = ilist.size();
        // Boundary checks
        // check the list
        if (len < 0 ) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        int tmp;
        for (int i= 0; i < len; i++){
            tmp = ilist.get(i);
            if(tmp >= min && tmp <= max){
                ilist.remove(i--);
                len--;
            }
        }

    }

}

