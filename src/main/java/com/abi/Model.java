package com.abi;

public class Model {
    float[][] matrix = new float[1002][1002];

    public Model() {
        for (int i = 0; i<= 1001; i++) {
            matrix[0][i] = i;
            matrix[1001][i] = 1001 - i;
        }
        for (int j = 1; j <= 1000; j++) {
            matrix[j][0] = j;
            matrix[j][1001] = 1001 - j;
            for (int i = 1; i <= 1000; i++) {
                matrix[j][i] = 0;
            }
        }
    }

    public static void main(String[] args) {

    }
}
