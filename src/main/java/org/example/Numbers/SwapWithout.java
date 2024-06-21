package org.example.Numbers;

public class SwapWithout {
    public static void main(String[] args) {
        int x = 5;
        int y= 10;

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x=" + x +"\n"+"y="+y);

    }
}
