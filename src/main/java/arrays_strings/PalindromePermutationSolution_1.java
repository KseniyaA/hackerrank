package arrays_strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase
 * that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need
 * to be limited to just dictionary words.
 *
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat'; "atco eta·; etc.)
 */
public class PalindromePermutationSolution_1 {
    // Полиндром может содежать один символ, которого будет нечетное количество. И не больше одного.
    // Заполнить мапу, которая будет содержать в ключе - символ, в значении - число символов.
    // Надо будет проверить что в мапе все значения четные и есть не больше одного нечетного значения

    public static void main(String[] args) {
        String inputString = "taco cat";

        Map map = buildMap(inputString);

        // проанализировать на наличие 0 или 1 и не больше нечетных значений в мапе
//        analizeMap(map);
    }

    private static Map buildMap(String inputString) {
        Map map = new HashMap<Character, Integer>();
        char[] chars = inputString.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == null) {
                map.put(chars[i], 0);
            } else {
                Integer cnt = (Integer) map.get(chars[i]);
                map.remove(chars[i]);
                map.put(chars[i], cnt++);
            }
        }
        return map;
    }
}
