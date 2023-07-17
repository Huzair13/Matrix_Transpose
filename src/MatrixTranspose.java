import java.awt.*;
import java.util.Scanner;

public class MatrixTranspose{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows in the array");
        int sizeRow=scanner.nextInt();
        System.out.println("Enter the number of columns in the array");
        int sizeColumn=scanner.nextInt();
        int array[][]=new int[sizeRow][sizeColumn];

        System.out.println("Enter the array elements");
        for(int iterator=0;iterator<sizeRow;iterator++){
            for(int j=0;j<sizeColumn;j++){
                array[iterator][j]=scanner.nextInt();
            }
        }

        int transposeMatrix[][]=matrixTranspose(array,sizeRow,sizeColumn);
        for(int i=0;i<sizeColumn;i++){
            for(int j=0;j<sizeRow;j++){
                System.out.print(transposeMatrix[i][j]+" ");
            }
            System.out.println("");
        }

    }

    private static int[][] matrixTranspose(int[][] array, int sizeRow, int sizeColumn) {
        int transpose[][]=new int[sizeColumn][sizeRow];
        int temp=0;
        for(int i=0;i<sizeColumn;i++){
            for(int j=0;j<sizeRow;j++){
                transpose[i][j]=array[j][i];
            }
        }
        return transpose;
    }
}