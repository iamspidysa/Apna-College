package Java;

import java.util.Scanner;

public class ArrayAssignment {
    public static boolean repeatingValueCheck(int arr[]) {
        // boolean a = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Question number 2 - find Target
    public static int question2(int arr[], int target) {
        /*
         * WRONG METHOD
         * for (int i = 0; i < arr.length; i++) {
         * if(target == arr[i]){
         * return i;
         * }
         * }
         * return -1;
         */

        return 0;
    }

    public static void main(String[] args) {
        // int array[] = { 1, 0, 3, 4, 1 };
        // System.out.println(repeatingValueCheck(array));

        /*
         * WRONG METHOD
         * Scanner sc = new Scanner(System.in);
         * int num[] = { 0, 1, 2, 4, 5, 6, 7 };
         * System.out.print("Please Enter the pivot ");
         * int kPivot = sc.nextInt();
         * System.out.println("Enter the target Value");
         * int target = sc.nextInt();
         * int helpingArray[] = new int[num.length];
         * for (int i = 0; i < num.length; i++) {
         * if (kPivot == num.length) {
         * kPivot = 0;
         * }
         * helpingArray[i] = num[kPivot];
         * kPivot++;
         * }
         * System.out.println(question2(helpingArray, target));
         */

         
    }
}
