import java.util.Arrays;

public class Capgemini {

    public static void main(String[] args) {
        //Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;
        //
        // Output: 12, 3, 9
        //
        // Explanation: There is a triplet (12, 3 and 9) present
        //
        // in the array whose sum is 24.

        int[] array = {12, 3, 4, 1, 6, 9};
                int sum = 24;
                triplet(array,sum);
    }

    static void triplet (int[] array, int sum){
        int[] res = new int[2];
        for(int i =0 ; i < array.length-1 ; i++)
        {
            for(int j =1 ; j < array.length-1 ; j++) {
                int temp = 0;
                int temp1 ;

                while(temp <= sum) {
                    temp = array[i] + array[j];

                    for(int k = 2 ; k < array.length-1 ; k++) {
                        temp1 = temp + array[k];
                                if(temp1 == sum)
                                {
                                    res[0] = array[i];
                                    res[1] = array[j];
                                    res[2] = array[k];
                                    System.out.println("Triplet are: "+ Arrays.toString(res));
                                }
                                else break;
                    }
                }
            }
        }
    }
}
