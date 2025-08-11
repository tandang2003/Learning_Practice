package LongestSubstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringTest {


    @Test
    public void testExample1() {
        assertEquals(3, LongestSubstring.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void testExample2() {
        assertEquals(1, LongestSubstring.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void testExample3() {
        assertEquals(3, LongestSubstring.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, LongestSubstring.lengthOfLongestSubstring(""));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals(1, LongestSubstring.lengthOfLongestSubstring("a"));
    }

    @Test
    public void testNoRepeats() {
        assertEquals(6, LongestSubstring.lengthOfLongestSubstring("abcdef"));
    }


}