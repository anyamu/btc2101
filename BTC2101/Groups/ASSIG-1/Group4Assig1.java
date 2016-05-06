import java.util.Scanner;
//!NOTE: This work looks unfinished!
//       See what your classmates have done
//       in Group1Assig1.java and Group2Assig1.java
public class Group4Assig1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int m,n, g,z, d, l;
        int sum=0;
        int product=0;
        System.out.println("enter the number of rows and columns for your matrix");
        m=in.nextInt();
        n=in.nextInt();
        int[][]x;
        x=new int[m][n];
    System.out.println("enter elements for x");
    for(g=0;g<m;g++)
    for (z=0;z<n;z++)
         x[g][z]=in.nextInt();
        int[][]y;
        y=new int[m][n];
        System.out.println("enter elements for second matrix");
        for(d=0;d<m;d++)
            for(l=0;l<n;l++)
                y[d][l]=in.nextInt(); 
      
    }
}
    
    

