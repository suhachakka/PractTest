
public class coding {
    public static void main(String[] args) {
        String str1 = "Replace all vowels with consonants";
        str1= str1.replaceAll("[AaEeIiOoUu]","");
       System.out.println(str1.split(" p",1));
        System.out.println(str1);
        String s1 = "Welcome to Javatpoint";
        char[] ch = s1.toCharArray();
//        int len = ch.length;
        System.out.println("Char Array length: " + ch.length);
        System.out.println("Char Array elements: ");
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        int arr[]= new int[]{50,60,70,80,8};
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        int a[]= new int[]{33,3,4,5};//declaration, instantiation and initialization
//printing array
        for(int k=0;k<a.length;k++)//length is the property of array
            System.out.println(a[k]);
    }
}


























