/* 5
 * 5 4
 * 5 4 3
 * 5 4 3 2
 * 5 4 3 2 1
 */
import java.util.Scanner;
public class pattern1
{  Scanner sc=new Scanner(System.in);
    int n;
    void getData()
    { System.out.println("enter no. of rows you want to print");
        n=sc.nextInt();
    }
    void calc()
    { System.out.println("1"); int count=2;
        for(int i=1;i<=n;i++)
        { 
            for(int j=1;j<=i;j++)
            {  System.out.print(" "+count);
                count++;
            }  
            count++;
             System.out.println();
            }
        }
    public static void main()
    { pattern1 obj=new pattern1();
        obj.getData();
        obj.calc();
    }
}
