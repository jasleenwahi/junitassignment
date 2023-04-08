package org.example;

public class StringUtils {

    // function used to reverse the strings.
    public String reverse(String stringToReverse)
    {
        if(stringToReverse == null || stringToReverse == "")
            return "Invalid input";

        char[] arrayOfStringToReverse = stringToReverse.toCharArray();
        String reversedString= "";
        for(Integer index = arrayOfStringToReverse.length-1; index>=0; index--)
            reversedString = reversedString+arrayOfStringToReverse[index];

        return reversedString;
    }

    // function used to check if string is empty or not.
    public Boolean isEmpty1(String stringToCheck)
    {
        char[] arrayOfStringToCheck = stringToCheck.toCharArray();
        Integer counter = 0;
        for(Integer index=0; index<arrayOfStringToCheck.length; index++)
            counter++;

        if(counter == 0)
            return true;
        else
            return false;
    }

    // function used to check if string is palindrome or not.
    public Boolean isPalindrome(String stringToCheck)
    {
        if(stringToCheck == "" || stringToCheck == null)
            return false;

        String reversedString= reverse(stringToCheck);

        if(stringToCheck.equals(reversedString))
            return true;
        else
            return false;
    }



    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        String reversedString = stringUtils.reverse("Hello");
        System.out.println(reversedString);
        System.out.println(stringUtils.isEmpty1(""));
        System.out.println(stringUtils.isPalindrome("maam"));
    }
}