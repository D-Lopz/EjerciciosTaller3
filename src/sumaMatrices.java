package src;

public class sumaMatrices {
    public static int[][] sumaMatrices(int[][] matrizA, int[][] matrizB) {

        int[][] sum = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return sum;
    }


    public static void main(String[] args) {

        int[][] matrizA = {
                {7, 5, 3},
                {9, 5, 1},
                {4, 5, 6}
        };

        int[][] matrizB = {
                {9, 5, 1},
                {4, 5, 6},
                {7, 5, 3}
        };

        int[][] result = sumaMatrices(matrizA, matrizB);

        System.out.println("The sum's result's:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
