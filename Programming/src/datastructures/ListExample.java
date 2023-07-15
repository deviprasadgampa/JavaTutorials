package datastructures;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

   static String[] strArr = new String[10];

    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();

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

    }

}
