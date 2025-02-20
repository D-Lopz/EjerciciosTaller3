package src;

public class SumaElementosMatriz {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {7, 8, 9},
                {6, 5, 4}
        };

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += matriz[i][j];
            }
        }
        System.out.println("The sum of all of numbers into the matriz is: " + sum);
    }
}
