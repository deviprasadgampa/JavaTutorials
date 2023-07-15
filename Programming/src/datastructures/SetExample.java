package datastructures;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static Set<Integer> createSet() { //throws InputMismatchException {
        Set<Integer> set = new HashSet<>();

        set.add(5);
        set.add(15);
        set.add(25);
        boolean noDuplicate = set.add(5);

        if(! noDuplicate) {
            System.out.println("Item is duplicated");
           // throw new InputMismatchException("Found Duplicate");
        }

        set.stream().forEach(System.out::println);
        return set;
    }

    public static void main(String[] args) {

        Set<Integer> set = null;
        try {
            set = createSet();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }


        System.out.println("System did not stop");


    }
}
