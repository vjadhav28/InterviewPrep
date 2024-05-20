package org.example.Numbers;

public class Factorial {
    public static int firstFactorial(int num) {
        int fact = 1;
        for(int i = 1 ; i<=num ; i++)
        {
            fact *=i  ;
        }
        return fact;
    }

    public static void main (String[] args) {
        // keep this function call here
        int fact = firstFactorial(8);
        System.out.println(fact);
    }

}
