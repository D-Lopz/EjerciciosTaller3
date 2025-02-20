package src;

public class SumaMatriz {

    public static void main(String[] args) {
        int[][] matrizA = {
                {1, 2},
                {3, 3}
        };

        int[][] matrizB = {
                {4, 5},
                {5, 7}
        };

        int[][] suma = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("La matriz resultante es:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(suma[i][j] + " ");

            }
            System.out.println();
        }

    }
}
