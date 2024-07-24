package Array2D;

import java.util.Scanner;

public class twoDarrays {

    public static boolean searchIn2DArray(int arr[][], int key){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[1].length; j++){
                if(arr[i][j] == key){
                    System.out.println("Key found at index "+i+","+j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int r = 3;
        int c = 3;
        int array[][] = new int[r][c];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++){
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        searchIn2DArray(array, 5);
    }
}
