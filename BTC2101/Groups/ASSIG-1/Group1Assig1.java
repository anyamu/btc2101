import java.util.Scanner;
public class Group1Assig1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=s.nextInt();
        System.out.println("Enter number of columns");
        int columns=s.nextInt();
        //!NOTE: You should check whether the matrices produced
        // are conformable for multiplication also
        int[][]a=new int[rows][columns];
        int[][]b=new int[rows][columns];
        //!NOTE: You could have moved the lines below into their
        // own method to avoid repetition and to make your work
        // look "clean". See Group2Assig1.java
        // ========== EnterMatrixValues() ==========
        System.out.println("Enter the first matrix");
        for(int x=0;x<rows;x++){
            for(int y=0;y<columns;y++){
                a[x][y]=s.nextInt();
            }
        }
        System.out.println("Enter the second matrix");
        for(int x=0;x<rows;x++){
            for(int y=0;y<columns;y++){
                b[x][y]=s.nextInt();
            }
        }
        // ========================================
        // ========== Add(Matrix A, Matrix B) =====
        int[][]c=new int[rows][columns];
        for(int x=0;x<rows;x++){
            for(int y=0;y<columns;y++){
                c[x][y]=a[x][y]+b[x][y];
            }
        }
        System.out.println("The sum of the two matrices is:");
        for(int x=0;x<rows;x++){
            for(int y=0;y<columns;y++){
                System.out.println(c[x][y]+" ");
            }
            System.out.println();
        }
        // ========================================
        // =========== Multiply(Matrix A, Matrix B)
        int[][]d=new int[rows][columns];
        for(int x=0;x<rows;x++){
            for(int y=0;y<columns;y++){
                d[x][y]=a[x][y]*b[x][y];
            }
        }
        System.out.println("The product of the two matrices is:");
        for(int x=0;x<rows;x++){
            for(int y=0;y<columns;y++){
                System.out.println(d[x][y]+" ");
            }
            System.out.println();
        }
        // ========================================
    }
}
