package src;

public class transponerMatriz {
    public static int[][] transponerMatriz(int[][] matriz){
        int[][] transposed = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposed[j][i] = matriz[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        int[][] transposed = transponerMatriz(matriz);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
