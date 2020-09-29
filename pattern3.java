/**
 * A
 * b b
 * C C C
 * d d d d
 */
import java.util.Scanner;
public class pattern3
{  Scanner sc=new Scanner(System.in);
    int n;
    void getData()
    { System.out.println("enter no. of rows you want to print");
        n=sc.nextInt();
    }
    void calc()
    { char ch=64;
        for(int i=1; i<=n;i++)
        { ch++;
            if(i%2!=0)
            for(int j=1;j<=i;j++)
                { System.out.print(" "+ch);}
                else
                for(int j=1;j<=i;j++)
                System.out.print(" "+Character.toLowerCase(ch));
                System.out.println();
            
        }
    }
    public static void main()
    { pattern3 obj=new pattern3();
        obj.getData();
        obj.calc();
    }
}
