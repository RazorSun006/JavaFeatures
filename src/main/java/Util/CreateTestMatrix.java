package Util;

import java.util.Random;

public class CreateTestMatrix {
    public CreateTestMatrix() {

    }

    public int[][] create(int row, int column) {
        int[][] matrix = new int[row][column];
        Random random = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = random.nextInt(3);
            }
        }
        return matrix;
    }
}
