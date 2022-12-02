import java.util.*;

public class PerkalianMatrix {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Baris Matrix A = ");
        int a = in.nextInt();
        System.out.print("Kolom Matrix A = ");
        int b = in.nextInt();
        int[][] mat = matrix(a,b);
        gambar(mat);

        System.out.println();

        System.out.print("Baris Matrix B = ");
        int c = in.nextInt();
        System.out.print("Kolom Matrix B = ");
        int d = in.nextInt();
        int[][] mat1 = matrix(c,d);
        gambar(mat1);

        System.out.println();

        System.out.print("Hasil Perkalian Matrix : ");
        gambar(perkalian(mat,mat1));
    }

    public static int [][] matrix(int a, int b){
        int[][] matrix = new int[a][b];

        Scanner in = new Scanner(System.in);

        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.printf("Masukan angka pada baris ke %d dan kolom ke %d : ",i+1,j+1);
                matrix[i][j] = in.nextInt();
            }
        }return matrix;
    }

    public static void gambar(int[][] matrix){

        for(int i=0; i<matrix.length; i++){
            System.out.println();
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + "      ");
            }
        }
        System.out.println();
    }

    public static int[][] perkalian(int[][] a, int[][] b){

        int[][] temp = new int [a.length][b[0].length];

        if(a[0].length == b.length){
            for(int i=0; i<a.length; i++){
                for(int j=0; j<b[0].length; j++){
                    temp[i][j] = 0;
                    for(int k=0; k<a[0].length; k++){
                        temp[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }else{
            System.out.println("Matrix yang anda masukan tidak memenuhi syarat perkalian matrix");
        }
        return temp;
    }


}

