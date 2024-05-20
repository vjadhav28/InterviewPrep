package org.example.String;

public class String_1 {
    //Find first non-repeating character of given String

    public static void FirstNonRepeat(String s)
    {

        for (int i = 0; i < s.length(); i++) {

            if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
                System.out.println("First non-repeating character is "+ s.charAt(i));
                break;
            }
        }
    }
    public static void main (String[] args) {
        String s = "geeksforgeeks";
        FirstNonRepeat(s);
    }
}
