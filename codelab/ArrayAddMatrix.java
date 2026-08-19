package codelab;
//import the java utility for creating input
import java.util.Scanner;
public class ArrayAddMatrix {
    public static void main(String[] args) {
        int m, n, c, d;

        //create a new Scanner object to read user input.
        Scanner in = new Scanner (System.in);

        //prompt the user to input the number of rows for the matrix.
        System.out.println("Input number of rows of the matrix");
        m = in.nextInt();

        //prompt the user to input the number of columns for the matrix
        System.out.println("Input the number of columns of the matrix");
        n = in.nextInt();

        //create two-dimensional arrays to store the matrix data
        int array1 [] [] = new int [m] [n];
        int array2 [] [] = new int [m] [n];
        int sum [] [] = new int [m] [n]; 

        //prompt the user to input elements of the first matrix. 
        System.out.println("Input elements of the first matrix");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                array1[c] [d] = in.nextInt();
            }
        }

        //prompt the user to input elements of the second matrix.
        System.out.println("Input elements of the second matrix");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                array2[c][d] = in.nextInt();
            }
        }
        
        //calculate the sum of the matrices.
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                System.out.print(sum[c] [d] + "\t");
            }
            System.out.println();
        }
    }
}
