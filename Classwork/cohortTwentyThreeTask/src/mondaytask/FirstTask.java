package mondaytask;

import java.util.Arrays;

public class FirstTask {

    public static int[] returnList(int[] arr) {
        int temp = 0;
        int next = 0;
        int numbers = arr.length;

        for (int i = 0; i < numbers + 1; i++) {
            for (int j = i+1; j < numbers + 1 ; j++) {
                temp = arr[i];
                next = arr[i+1];
                if(arr[i] != arr[j]) {
                    return new int[]{arr[next]};
                }
            }
        }
       return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnList(new int[]{77,78,80})));
    }
}
