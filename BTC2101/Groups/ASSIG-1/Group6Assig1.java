//!NOTE: This code doesn't work! Fix it!
import java.util.Scanner;

public class Group6Assig1 {

    public static void main(String[] args) {


        Scanner s=new Scanner(System.in);

        System.out.println(&quot;No. of rows?&quot;);

        int R=s.nextInt();

        System.out.println(&quot;No. of columns?&quot;);

        int C=s.nextInt();

        int[][]x=new int[R][C];

        int[][]y=new int[R][C];

        System.out.println(&quot;1st matrix?&quot;);

        for(int w=0;w&lt;R;w++){

            for(int z=0;z&lt;C;z++){

                x[w][z]=s.nextInt();

            }

        }

        System.out.println(&quot;2nd matrix?&quot;);

        for(int w=0;w&lt;R;w++){

            for(int z=0;z&lt;C;z++){

                y[w][z]=s.nextInt();

            }

        }

        int[][]a=new int[R][C];

        for(int w=0;w&lt;R;w++){

            for(int z=0;z&lt;C;z++){

                a[w][z]=x[w][z]+y[w][z];

            }

        }





        System.out.println(&quot;Sum of matrices is:&quot;);

        for(int w=0;w&lt;R;w++){

            for(int z=0;z&lt;C;z++){

                System.out.println(a[w][z]+&quot;&quot;);

            }

        }

        int[][]b=new int[R][C];

        for(int w=0;w&lt;R;w++){

            for(int z=0;z&lt;C;z++){

                b[w][z]=x[w][z]*y[w][z];

            }

        }

        System.out.println(&quot;Product of matrices is:&quot;);

        for(int w=0;w&lt;R;w++){

            for(int z=0;z&lt;C;z++){

                System.out.println(b[w][z]+&quot;&quot;);

            }

        }

    }

}
