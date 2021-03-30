//AnnillaNurulHuzna
package Matriks;
public class Nomor4 {
    public static void main(String[] args) {
        int matriks7[][] = {
                {2, 1, -5},
                {3, 4, 2}
        };

        int trans[][] = new int[3][2];

        for (int i = 0; i < matriks7.length; i++) {
            for (int j = 0; j < matriks7[0].length; j++) {
                System.out.print(matriks7[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Hasil Transpose");
        for (int i = 0; i < matriks7.length; i++) {
            for (int j = 0; j < matriks7[0].length; j++) {
                trans[j][i] = matriks7[i][j];
            }
        }
        for (int i = 0; i < matriks7[0].length; i++) {
            for (int j = 0; j < matriks7.length; j++) {
                System.out.print(trans[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
