/**
 * 
 * 
 * Class contains 2 things
 *  Varibles
 *  Methods
 */
public class MyFirstExample {

static int day_global = 100;   

public static String convertDayToAName(int dayNum) {

String name = "";
    switch (day_global) {
    case 1:
        name = "Monday";
        System.out.println("Monday");
        break;
    case 2:
         name = "Monday";
        System.out.println("Tuesday");
        break;
    default:
         name = "Monday";
        System.out.println("Not a Day");
        break;
    case 3:
         name = "Monday";
        System.out.println("Wednesday");
        break;
    case 4:
         name = "Monday";
        System.out.println("Thursday");
        break;
    case 5:
         name = "Monday";
        System.out.println("Friday");
        break;
    case 6: 
    name = "Monday";
        System.out.println("Saturday");
        break;
    case 7:
         name = "Monday";
        System.out.println("Sunday");
        break;
}
return name;
}


    public static void main(String[] args) {

        System.out.println("My First Code");
        // Numbers, Float points, characters, Strings

        int a = 100;

        short b = 10;

        char c = 'c';

        float d = 9.2f;

        long e = 1000;

        double f = 100.87;

        String s = "abcd";

        System.out.println("My Double :"+f);

 //  || , &&, !
 
        if(a == 100 && d == 9.8f) {
            System.out.println("Yes the number is 100");
        } 
        else if(a >= 100 ) {
             System.out.println("inside else-if");

        }
        else {

        }

    


    if(a%2 == 0) {
        System.out.println("Yes Its an even number");
    }


int day =6;
// came-case
String dayName = convertDayToAName(day);
System.out.println(dayName);


}



}
