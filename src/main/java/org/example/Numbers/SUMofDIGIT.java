package org.example.Numbers;

public class SUMofDIGIT {
    public static void main(String[] args) {
        int[][] arr ;
        for (int i = 0; i < 5; i++)
        {
            //for (int j = 0; j < 5 - i; j++)
        {
            System.out.print(" ");
        }
            for (int k = 0; k <= i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        int num = 456;
        int sum =0;
        while(num!=0)
        {
            int dig = num % 10;
            sum = sum + dig;
            num /= 10 ;
        }
        System.out.println(sum);
    }
}

