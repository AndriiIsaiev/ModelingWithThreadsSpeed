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
        Model m = new Model();
        System.out.println(m.matrix[0][0] + " " + m.matrix[0][1001] + " " + m.matrix[1001][1001] + " " + m.matrix[1001][0]);
        for (int n = 1; n <= 100 ; n++) {
            for (int j = 1; j <= 1000; j++) {
                for (int i = 1; i <= 1000; i++) {
                    m.matrix[j][i] = (m.matrix[j - 1][i] + m.matrix[j + 1][i] + m.matrix[j][i - 1] + m.matrix[j][i + 1]) /4;
                }

            }
        }
        System.out.println(m.matrix[100][100] + " " + m.matrix[500][500] + " " + m.matrix[100][900] + " " + m.matrix[900][500]);
    }
}
