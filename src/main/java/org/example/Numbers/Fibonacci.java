package org.example.Numbers;

public class Fibonacci {
        public static void printFibonacci(int val_1, int val_2, int num){
            if(num == 0)
                return;

            System.out.print( val_1 + val_2 + " ");

            //Recursively calling for printing Fibonacci for remaining length
            printFibonacci(val_2, val_1+val_2, --num);
        }
        public static void main(String[] args) {
            System.out.println(" *** Fibonacci Series *** ");

            System.out.print("0 1 ");

            //Calling Method to print the fibonacci for length 10
            printFibonacci(0, 1, 0);

    }
}
