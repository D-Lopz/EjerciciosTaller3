package src;

public class MaximoMatriz {

    public static void main(String[] args) {

        int[][] matriz = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int max = matriz[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        System.out.println("El número máximo dentro de la matriz es; " + max);
    }
}
