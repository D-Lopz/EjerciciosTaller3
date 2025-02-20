package src;

public class ContarNumerosPares {
    public static void main(String[] args) {

        int[][] matriz = {
                {45, 64, 56},
                {65, 4, 98},
                {12, 35, 6}
        };

        int par = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j] % 2 == 0) {
                    par ++;
                }
            }
        }
        System.out.println("In the matriz are/is: " + par + " par numbers.");
    }

}
