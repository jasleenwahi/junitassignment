package org.example;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class StringUtilsTest
{
    StringUtils stringUtils;
    @Before
    public void setup()
    {
        stringUtils = new StringUtils();
    }

    // testing reverse method with non empty string.
    @Test
    public void testReverseTheString_WithNonEmptyString_ShouldReturnReversedString()
    {
        String reversedString = stringUtils.reverse_The_String("hello");
        assertEquals("olleh", reversedString);
    }

    // testing reverse method with empty string.
    @Test
    public void testReverseTheString_WithEmptyString_ShouldReturnInvalidInput()
    {
        String reversedString = stringUtils.reverse_The_String("");
        assertEquals("Invalid input", reversedString);
    }

    // testing isEmpty method with non empty string.
    @Test
    public void testCheckIfStringIsEmpty_WithNonEmptyString_ShouldReturnFalse(){
        Boolean emptyString = stringUtils.check_If_String_Is_Empty("hello");
        assertEquals(false, emptyString);
    }

    // testing isEmpty method with empty string.
    @Test
    public void testCheckIfEmpty_WithEmptyString_ShouldReturnTrue(){
        Boolean emptyString = stringUtils.check_If_String_Is_Empty("");
        assertEquals(true, emptyString);
    }

    // testing isPalindrome method with palindrome string.
    @Test
    public void testIsPalindrome_WithPalindromeString_ShouldReturnTrue(){
        Boolean isPalindromeOrNot = stringUtils.check_if_String_Is_Palindrome("maam");
        assertEquals(true, isPalindromeOrNot);
    }

    // testing isPalindrome method with non-palindrome string.
    @Test
    public void testIsPalindrome_WithNonPalindromeString_ShouldReturnFalse(){
        Boolean isPalindromeOrNot = stringUtils.check_if_String_Is_Palindrome("jasleen");
        assertEquals(false, isPalindromeOrNot);
    }

    // testing isPalindrome method with empty strings.
    @Test
    public void testIsPalindrome_WirhEmptyString_ShouldReturnFalse(){
        Boolean isPalindromeOrNot = stringUtils.check_if_String_Is_Palindrome("");
        assertEquals(false, isPalindromeOrNot);
    }
    @After
    public void tearDown(){
        System.out.println("called after every test");
    }
}
