package src;
import java.util.Scanner;

public class MultiplicacionEscalar {

    public static void main(String[] args) {
        Scanner dL = new Scanner(System.in);

        int[][] matriz = {
                {2, 2},
                {6, 5}
        };

        System.out.println("Write the number to multiply the matriz: ");
        int escalar = dL.nextInt();

        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matriz[i][j] * escalar;
            }
        }

        System.out.println("The resultant matriz is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        dL.close();
    }
}
