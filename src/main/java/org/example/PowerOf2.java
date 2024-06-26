package org.example;

public class PowerOf2 {

    public static boolean powerOfTwo(int num)
    {
        if(num==0)
        {
            return false;
        }
        while(num!=1)
        {
            if(num % 2 != 0)
            {
                return false;
            }
            num >>= 1;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(powerOfTwo(4));

    }
}
