//AnnillaNurulHuzna
package Matriks;
public class Nomor3 {
    public static void main(String[] args) {
        int[][] matriks1 = {
                {20, 20, 20},
                {20, 20, 20},
        };
        int[][] matriks2 = {
                {20, 20},
                {20, 20},
                {20, 20}
        };
        if(matriks1[0].length == matriks2.length) {
            int[][] matriks3 = new int[matriks1.length][matriks2[0].length];
            for(int i=0; i <matriks1.length; i++) {
                for(int j=0; j < matriks2[0].length; j++) {
                    matriks3[i][j] = matriks1[i][j] * matriks2[i][j];
                }
            }
            for (int[] x : matriks3 ){
                for (int y : x){
                    System.out.print(y+" ");
                }
                System.out.println();
            }
        }}}

