package datastructures;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

   static String[] strArr = new String[10];

    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();

        List<String>otherList = new LinkedList<>();

        strArr[0] = "5";
        strList.add("5");

        strArr[1] = "7";
        strList.add("7");

        strArr[2] = "9";
        strList.add("9");

        strList.add("5");


        //System.out.println(strList);

        //Arrays.stream(strArr).forEach(System.out::print);

        System.out.println(strList.get(0));

        System.out.println(strList.contains("23"));

        try {
            System.out.println(strList.get(25));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Some Message: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Other Exceptions: "+e.getMessage());
        }

        System.out.println(strList.isEmpty());


        List<Float> floatList = new ArrayList<>();
        floatList.add(5.5f);
        floatList.add(5f);


        List<List<String>> listOfStudentsInAllClasses = new ArrayList<>();

        List<String> class0 = new ArrayList<>();
        class0.add("Siri");
        class0.add("Advitha");

        List<String> class1 = new ArrayList<>();
        class1.add("Devi");
        class1.add("Sivaram");

        List<String> class2 = new ArrayList<>();
        class2.add("Ajay");
        class2.add("Devika");

        List<String> class3 = new ArrayList<>();

        List<String> class4 = new ArrayList<>();
        class4.add("Vijay");
        class4.add("Varun");

        listOfStudentsInAllClasses.add(class0);

        listOfStudentsInAllClasses.add(class1);

        listOfStudentsInAllClasses.add(class2);

        listOfStudentsInAllClasses.add(class3);

        listOfStudentsInAllClasses.add(class4);



        System.out.println(listOfStudentsInAllClasses.get(4));






    }

}
