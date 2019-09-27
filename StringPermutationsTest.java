package rayjc.app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class StringPermutationsTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testEmptyString() {
        StringPermutations strPerm = new StringPermutations();
        assertTrue( strPerm.permute("").isEmpty() );
    }

    @Test
    public void testOneCharStr() {
        StringPermutations strPerm = new StringPermutations();
        // test length of list
        List<String> result = strPerm.permute("a");
        assertTrue( result.size() == 1 );
        // test content of list
        assertTrue( "a".equals( result.get(0) ) );
    }

    @Test
    public void testTwoDistinctCharStr() {
        StringPermutations strPerm = new StringPermutations();
        // test length of list
        List<String> result = strPerm.permute("ab");
        assertTrue(result.size() == 2);
        // test content of list
        assertTrue(result.contains("ab") && result.contains("ba"));
    }

    @Test
    public void testTwoDuplicateCharStr() {
        StringPermutations strPerm = new StringPermutations();
        // test length of list
        List<String> result = strPerm.permute("AA");
        assertTrue(result.size() == 1);     // expect only one string
        // test content of list
        assertTrue(result.contains("AA"));
    }

    @Test
    public void testThreeDistinctCharStr() {
        StringPermutations strPerm = new StringPermutations();
        // test length of list
        List<String> result = strPerm.permute("abc");
        assertTrue(result.size() == 6);     // expect 3! of strings
        // test content of list
        assertArrayEquals(
            new String[]{ "abc", "acb", "bac", "bca", "cab", "cba" },
            result.stream().toArray(String[]::new)
        );
        
    }

    @Test
    public void testThreeCharWithDuplicateStr() {
        StringPermutations strPerm = new StringPermutations();
        // test length of list
        List<String> result = strPerm.permute("aaB");
        assertTrue(result.size() == 3);     // expect 3 strings
        // test content of list
        assertArrayEquals(
            new String[]{ "aaB", "aBa", "Baa" },
            result.stream().toArray(String[]::new)
        );
        
    }
}
