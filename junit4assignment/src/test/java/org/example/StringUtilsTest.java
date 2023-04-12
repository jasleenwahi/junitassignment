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
    public void testReverse_The_String_With_NonEmpty_String_Should_Return_Reversed_String()
    {
        String reversedString = stringUtils.reverse_The_String("hello");
        assertEquals("olleh", reversedString);
    }

    // testing reverse method with empty string.
    @Test
    public void testReverse_The_String_With_Empty_String_Should_Return_Invalid_Input()
    {
        String reversedString = stringUtils.reverse_The_String("");
        assertEquals("Invalid input", reversedString);
    }

    // testing isEmpty method with non empty string.
    @Test
    public void testCheck_If_String_Is_Empty_With_NonEmpty_String_Should_Return_False(){
        Boolean emptyString = stringUtils.check_If_String_Is_Empty("hello");
        assertEquals(false, emptyString);
    }

    // testing isEmpty method with empty string.
    @Test
    public void testCheck_If_Empty_With_Empty_String_Should_Return_True(){
        Boolean emptyString = stringUtils.check_If_String_Is_Empty("");
        assertEquals(true, emptyString);
    }

    // testing isPalindrome method with palindrome string.
    @Test
    public void testIs_Palindrome_With_Palindrome_String_Should_Return_True(){
        Boolean isPalindromeOrNot = stringUtils.check_if_String_Is_Palindrome("maam");
        assertEquals(true, isPalindromeOrNot);
    }

    // testing isPalindrome method with non-palindrome string.
    @Test
    public void testIsPalindrome_With_Non_Palindrome_String_Should_Return_False(){
        Boolean isPalindromeOrNot = stringUtils.check_if_String_Is_Palindrome("jasleen");
        assertEquals(false, isPalindromeOrNot);
    }

    // testing isPalindrome method with empty strings.
    @Test
    public void testIsPalindrome_Wirh_Empty_String_Should_Return_False(){
        Boolean isPalindromeOrNot = stringUtils.check_if_String_Is_Palindrome("");
        assertEquals(false, isPalindromeOrNot);
    }
    @After
    public void tearDown(){
        System.out.println("called after every test");
    }
}
