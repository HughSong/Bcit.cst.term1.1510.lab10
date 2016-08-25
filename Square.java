
// ***************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//
// ***************************************************************
import java.util.Scanner;

public class Square {
    int[][] square;
    private int sumCol = 0;
    private int sumRow = 0;
    private int sumMainDiag = 0;
    private int sumOtherDiag = 0;
    // --------------------------------------
    // create new square of given size
    // --------------------------------------
    public Square(int size) {
        square = new int[size][size];
        
    }

    // --------------------------------------
    // return the sum of the values in the given row
    // --------------------------------------
    public int sumRow(int row) {
        int sumRow1 = 0;
        for (int col = 0; col < square.length; col++){
            sumRow1 +=square[row][col];
        }
        sumRow = sumRow1;
        return sumRow1;
    }

    // --------------------------------------
    // return the sum of the values in the given column
    // --------------------------------------
    public int sumCol(int col) {
        int sumCol1 = 0;
        for (int row = 0; row < square.length; row++) {
            sumCol1 += square[row][col];
        }
        sumCol = sumCol1;
        return sumCol1;
    }

    // --------------------------------------
    // return the sum of the values in the main diagonal
    // --------------------------------------
    public int sumMainDiag() {
        for (int i =0; i < square.length; i++) {
            sumMainDiag += square[i][i];
        }
        return sumMainDiag;
    }

    // --------------------------------------
    // return the sum of the values in the other ("reverse") diagonal
    // --------------------------------------
    public int sumOtherDiag() {
        for(int i = 0; i < square.length; i++) {
            sumOtherDiag += square[i][square.length - 1 - i];
        }
        return sumOtherDiag;
    }

    // --------------------------------------
    // return true if the square is magic (all rows, cols, and diags have
    // same sum), false otherwise
    // --------------------------------------
    public boolean magic() {
        if(sumOtherDiag == sumMainDiag && sumOtherDiag == sumRow && sumOtherDiag == sumCol) {
            return true;
        } else {
            return false;
        }
    }

    // --------------------------------------
    // read info into the square from the input stream associated with the
    // Scanner parameter
    // --------------------------------------
    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++)
            for (int col = 0; col < square.length; col++)
                square[row][col] = scan.nextInt();
    }

    // ----------------------------------------
    // print the contents of the square, neatly formatted
    // ----------------------------------------
    public void printSquare() {
        for (int row = 0; row < square.length; row++){
            for (int col = 0; col < square.length; col++) {
                System.out.print(square[row][col] + " ");
            }
            System.out.println();
        }
        
    }
}