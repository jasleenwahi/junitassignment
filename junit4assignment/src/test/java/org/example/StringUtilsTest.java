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
    public void testReverseShouldReturnReverse_test1()
    {
        String reversedString = stringUtils.reverse("hello");
        assertEquals("olleh", reversedString);
    }

    // testing reverse method with empty string.
    @Test
    public void testReverseShouldReturnReverse_test2()
    {
        String reversedString = stringUtils.reverse("");
        assertEquals("Invalid input", reversedString);
    }

    // testing isEmpty method with non empty method.
    @Test
    public void testEmptyShouldReturnTrueOrFalse_test1(){
        Boolean emptyString = stringUtils.isEmpty1("hello");
        assertEquals(false, emptyString);
    }

    // testing isEmpty method with empty method.
    @Test
    public void testEmptyShouldReturnTrueOrFalse_test2(){
        Boolean emptyString = stringUtils.isEmpty1("");
        assertEquals(true, emptyString);
    }

    // testing isPalindrome method with palindrome string.
    @Test
    public void testIsPalindromeShouldReturnTrueOrFalse_test1(){
        Boolean isPalindromeOrNot = stringUtils.isPalindrome("maam");
        assertEquals(true, isPalindromeOrNot);
    }

    // testing isPalindrome method with non-palindrome string.
    @Test
    public void testIsPalindromeShouldReturnTrueOrFalse_test2(){
        Boolean isPalindromeOrNot = stringUtils.isPalindrome("jasleen");
        assertEquals(false, isPalindromeOrNot);
    }

    // testing isPalindrome method with empty strings.
    @Test
    public void testIsPalindromeShouldReturnTrueOrFalse_test3(){
        Boolean isPalindromeOrNot = stringUtils.isPalindrome("");
        assertEquals(false, isPalindromeOrNot);
    }
    @After
    public void tearDown(){
        System.out.println("called after every test");
    }
}
