package arrayofarrays;

public class ArrayOfArraysMain {

    int[][] multiplicationTable(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return multiplicationTable;
    }

    public void printArrayOfArrays(int[][] a) {
        for (int i[] : a) {
            for (int j : i) {
               if (j < 10) {
                   System.out.println(" ");
               } else if (j < 100) {
                   System.out.println( " ");
               }
                System.out.println(j);
                System.out.println(" ");
            }
            System.out.println();
        }
    }

    public int[][] triangularMatrix(int size) {
        int [][] triangularMatrix = new int[size][];
        for (int i = 0; i < triangularMatrix.length; i++) {
            triangularMatrix[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangularMatrix[i][j] = i;
            }
        }
        return triangularMatrix;
    }
}


