package datastructures;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map<String, List<String>> studentRecordsByClass = new HashMap<>();

        List<String> class0 = new ArrayList<>();
        class0.add("Siri");
        class0.add("Advitha");

        List<String> class1 = new ArrayList<>();
        class1.add("Devi");
        class1.add("Sivaram");

        List<String> class2 = new ArrayList<>();
        class2.add("Ajay");
        class2.add("Devika");


        List<String> class4 = new ArrayList<>();
        class4.add("Vijay");
        class4.add("Varun");


        studentRecordsByClass.put("class0", class0);
        studentRecordsByClass.put("class1", class1);
        studentRecordsByClass.put("class2", class2);
        studentRecordsByClass.put("class4", class4);


        System.out.println( studentRecordsByClass.get("class4"));



        Map<Integer, String> rollNumbers = new HashMap<>();
        rollNumbers.put(1, "Ajay");
        rollNumbers.put(2, "Baby");
        rollNumbers.put(3, "Bhaskar");
        rollNumbers.put(1, "Ajay Sadhu");


        System.out.println(rollNumbers.get(1));


        System.out.println( rollNumbers.keySet() );

        System.out.print( rollNumbers.values());


        // Method 1 to print all elements in Map
        for(Integer rollNo: rollNumbers.keySet()) {
            System.out.println("Key is: "+ rollNo+" value is : "+ rollNumbers.get(rollNo) );
        }


        // Method 2 to print all elements in Map
        for(Map.Entry<Integer, String> entry: rollNumbers.entrySet()) {

            System.out.println(entry.getKey() + " ---- "+ entry.getValue());

        }
    }
}
