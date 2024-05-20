package org.example.Numbers;

public class ReverseDigit {
    public static void main(String[] args) {
        int num = 1897;
        int rev =0;

        System.out.println(num);
        while(num!=0)
        {
            int dig = num % 10;
            rev = rev * 10 + dig;
            num /= 10 ;
        }
        System.out.println(rev);
    }
}


