package arrays_strings;


/**
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the
 * other.
 */
public class CheckPermutationSolution_2 {

    public static void main(String[] args) {
        String s1 = "abcaa";
        String s2 = "bcaas";

        // check length
        // ask about case sensitive
        // ask about whitespaces

        // define array
        int[] letters = new int[128];

        // walk throw input string array and fill letter array
        for (char c: s1.toCharArray()) {
            letters[c]++;
        }

        // check second string
        for (char c: s2.toCharArray()) {
            int index = (int) c; // не обязательно пристваивать к инту
            letters[index]--;
            if (letters[index] < 0) {
                return;
            }
        }
    }

}
