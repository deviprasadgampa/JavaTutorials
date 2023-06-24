public class Main {
    
    
    public static void main(String[] args) {
        
        
        System.out.println("Hello world Ajay!");
        
        arrayOfDataTypes();
    }

    private static void arrayOfDataTypes() {

        int a = 10;
        float b = 20;

        // New Keyword is always used to create a memory space.
        int[] intArray = new int[6];

        String[] strArray = new String[8];

        int[] array2 = {1,2,3,4};
//
//        System.out.println(a);
//        System.out.println(array2);
//
//        System.out.println(array2[0]);
//        System.out.println(array2[1]);
//        System.out.println(array2[2]);
//        System.out.println(array2[3]);

//        for(int sNo =0; sNo < array2.length; sNo = sNo + 2){
//            System.out.println(array2[sNo]);
//        }


        int newVar = 0;

//        while(newVar < array2.length){
//            System.out.println(array2[newVar]);
//            newVar++;
//        }

        String abc = "2";
        int num = Integer.parseInt(abc);
        System.out.println(num);

        float f = 0.8f;

        int intNum = new Float(f).intValue();
        System.out.println(intNum);


//        do {
//            System.out.println(array2[newVar]);
//            newVar++;
//        } while(newVar < 0);
//
//
    }


}