import java.util.Arrays;

public class FindAnagram {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "dog";
       str1= str1.toLowerCase();
        str2=str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Both Strings r not an Anagram");
        } else {

            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);
            if (Arrays.equals(s1, s2) == true) {
                System.out.println("Both Strings are Anagram");
            } else {
                System.out.println("Both Strings are not Anagram");

            }
        }
    }
    }

