/*
 * Groupwork by:
 * Castrol
 * Ian
 * Eugene
 */
public class Group2Assig1 {
    public static void main(String[] args) {
        //!NOTE: Avoid hard-coding values whenever you can.
        //       Hard-coding values can make your program
        //       in-extensible. See Group1Assig1.java
        int[][] a = {{1, 2}, {3, 4}}; //matrix A
        int[][] b = {{5, 6}, {7, 8}}; //matrix B

        int[][] c= add(a, b); // calls the add method
        System.out.println("The sum of A and B is");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) { {
                    //!NOTE: For single-line for loops, there's no need
                    //       for curly brace. The same goes for the
                    //       other single-line for loops.
                    System.out.print(c[i][j] + " "); // prints the results from the add method
                }

            }
            System.out.println(); //prints out a new line
        }
        int[][] d = multiply(a, b); // calls the multiply method
        System.out.println("The product of A and B is");
        for (int x = 0; x < d.length; x++) {
            for (int y = 0; y < d[0].length; y++) {
                System.out.print(d[x][y] + " "); // prints the results from the multiply method
            }
            System.out.println(); // prints out a new line
        }
    }
    public static int[][] add(int[][] a,int[][] b){
        //!NOTE: Avoid hard-coding values whenever you can
        int rowsInA = 2;
        int columnsInA = 2; // same as rows in B
        int columnsInB = 2;
        int[][] c = new int[rowsInA][columnsInB];//The for loops traverse array A and B
        for (int i = 0; i < rowsInA; i++) {
            for (int j = 0; j < columnsInB; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    public static int[][] multiply(int[][] a, int[][] b) {
        //!NOTE: Avoid hard-coding values whenever you can
        int rowsInA = 2;
        int columnsInA = 2; // same as rows in B for matrix compatibility
        int columnsInB = 2;
        int[][] c = new int[rowsInA][columnsInB];// for loops are for traversing the arrays
        for (int i = 0; i < rowsInA; i++) {
            for (int j = 0; j < columnsInB; j++) {
                for (int k = 0; k < columnsInA; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
