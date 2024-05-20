package org.example.Refex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SImpleRegex {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("hello");
        String statement="Hello     there hello hello hi voila hello" +
                "helo";
        Matcher j = p.matcher(statement);
        while(j.find())
        {
            System.out.println("Pattern found from "+ j.start() + " to"+ (j.end()-1));
        }
    }
}
