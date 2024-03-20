package week9;

import java.util.List;

public class Pair_Programming {

    // Write and test a static method that uses a ListIterator to remove all negative elements from a list of integers.
    // The method should return the modified list.

    public static List<Integer> createList(int length) {
        List<Integer> largeList = new ArrayList<>();
        //List<Integer> largeList = new LinkedList<>();
        for (int i = 0; i < length; i++){
            largeList.add((int) (length * Math.random() - length + 5));
        }
        return largeList;
    }

    public static List<Integer> removeNegatives(List<Integer> list) {
        listIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 0) {
                iterator.remove();
            }
        }
        return list;
    }

    
    public static void main(String[] args) {


    }




}
