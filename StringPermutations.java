package rayjc.app;

import java.util.*;

public class StringPermutations {

    public List<String> permute(String s) {
        List<String> temp = new LinkedList<>();
        permuteHelper(s, "", temp);
        return temp;
    }

    private void permuteHelper(String s, String prefix, List<String> result) {
        // System.out.println( s + " " + prefix );
        // base case
        if (s.length() == 0) {
            return;
        }
        if (s.length() == 1) {
            // Add the path to leaf node to list
            // ie. prefix + last letter
            result.add(prefix + s);
        }

        // Allocate a boolean array of size 52 (a-z,A-Z)
        // to keep track for duplicate char used
        boolean[] repeatedChars = new boolean[52]; // initialize to false

        for (int i = 0; i < s.length(); i++) {
            int charIndex = (
                Character.isLowerCase(s.charAt(i)) ?
                (s.charAt(i) - (int) 'a') : (s.charAt(i) - (int) 'A' + 26)
            );
            if (!repeatedChars[charIndex]) {
                permuteHelper(s.substring(0, i) + s.substring(i + 1, s.length()),
                                prefix + s.charAt(i), result);
                repeatedChars[charIndex] = true;
            }
        }
    }

    public void printPermutations(String s){
        System.out.println(permute(s));
    }

    public static void main(String[] args) {
        StringPermutations stringPerm = new StringPermutations();
        stringPerm.printPermutations("abc");
    }

}
