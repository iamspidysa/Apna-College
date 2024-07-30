package Array2D;

public class diagonalMatrix {
    public static int dMatrix(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // For Standard Diagonal
            sum = sum + arr[i][i];
            // For Secondary diagonal
            if (i != arr.length - 1 - i)
                sum = sum + arr[i][arr.length - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                           { 4, 5, 6 },
                           { 7, 8, 9 }
        };
        System.out.println(dMatrix(matrix));
    }
}
