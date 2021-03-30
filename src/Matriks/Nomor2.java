//AnnillaNurulHuzna
package Matriks;
public class Nomor2 {
        public static void main (String[] args){
            int [] [] matrix1 = {
                    {15 , 15},
                    {15 , 15},
                    {15 , 15}
            };
            int [][] matrix2 = {
                    {16 , 16},
                    {16 , 16},
                    {16 , 16},
            };
            int [][] jumlah_pengurangan = new int[matrix1.length][matrix1[0].length];
            if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
                for (int i=0 ; i < matrix1.length ; i++){
                    for (int j=0 ; j < matrix1[0].length ; j++){
                        jumlah_pengurangan [i][j] = matrix1[i][j] - matrix2 [i][j];
                        System.out.print (jumlah_pengurangan [i][j] + " ");
                    }
                    System.out.println();
                }
            }
            else{
                System.out.print("ukurannya tidak sama");
            }
        }
    }

