package src;

public class multiplicarMatrices {
    public static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB){
        int[][] product = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    product[i][j] += matrizA[i][j] * matrizB[i][j];
                }
            }
        }
        return product;
    }

    public static void main(String[] args) {

        int[][] matrizA = {
                {7, 8, 9},
                {6, 5, 4},
                {1, 2 ,3}
        };

        int[][] matrizB = {
                {8, 8, 6},
                {5, 8, 2},
                {1, 5 ,3}
        };

        int[][] result = multiplicarMatrices(matrizA, matrizB);

        System.out.println("The result of the product between the firs matriz and second one is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
