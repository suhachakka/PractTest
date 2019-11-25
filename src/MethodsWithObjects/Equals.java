package MethodsWithObjects;

public class Equals {
    public static void main (String args[]){
        String s1 = new String("Hello");
        String s2 = new String("hello");
        System.out.println("String object compares: "+s1 == s2);
        System.out.println(s2.equals(s2));
// == operator for compatible data
// types
        // integer-type
        System.out.println("compatibale data types with '==' ");
        System.out.println("====================================");


        System.out.println(10 == 20);

        // char-type
        System.out.println('a' == 'b');

        // char and double type
        System.out.println('a' == 97.0);

        // boolean type
        System.out.println(true == true);

        // == operator for incompatible data types
        System.out.println("Incompatibale data types with '==' ");
        System.out.println("====================================");


        Thread t = new Thread();
        Object o = new Object();
        String s = new String("GEEKS");

        System.out.println(t == o);
        System.out.println(o == s);

        // Uncomment to see error
       // System.out.println(t==s);


        //equals() compares the  data or content of 2 fields and below strings
        System.out.println("equals() comparison for data/content in the fields/objects");

        System.out.println("==========================================================");

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;

        String str1 = new String("GEEKS");
        String str2 = new String("GEEKS");

        System.out.println(t1 == t3);
        System.out.println(t1 == t2);

        System.out.println(t1.equals(t2));
        System.out.println("String data comparison:" +str1.equals(str2));
    }
}


