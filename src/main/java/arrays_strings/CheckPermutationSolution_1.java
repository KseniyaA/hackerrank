package arrays_strings;


import java.util.Arrays;

/**
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the
 * other.
 */
public class CheckPermutationSolution_1 {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cba";
        // check length
        if (s1.length() != s2.length()) {
            return;
        }
        // sort strings
        getSortedString(s1);
        getSortedString(s2);
        // compare sorted strings
        System.out.println("result = " + s1.equals(s2));
    }

    public static String getSortedString(String inputString) {
        char[] inputCharArray = inputString.toCharArray();
        Arrays.sort(inputCharArray);
        return new String(inputCharArray);
    }
}
