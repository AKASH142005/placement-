import java.util.*;
public class sortmatrix {
    public static void main(String[] args) {
        int[][] m = {
            {5, 4, 7},
            {1, 8, 3},
            {9, 6, 2}
        };    
        int rows = m.length;
        int cols = m[0].length;
        int[] flatArray = new int[rows * cols];
        int index = 0;
        for (int[] r : m) {
            for (int num : r) {
                flatArray[index++] = num;
            }
        }
        Arrays.sort(flatArray);

        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = flatArray[index++];
            }
        }
        for (int[] row : m) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
