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

        // set to keep track for duplicate char used
        Set<Character> charUsed = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (!charUsed.contains( s.charAt(i) )) {
                permuteHelper(s.substring(0, i) + s.substring(i + 1, s.length()),
                                prefix + s.charAt(i), result);
                charUsed.add(s.charAt(i));
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
