// s= 1+(1+2)+(1+2+3.....n)

import java.util.Scanner;
public class scS1
{
    int  n;
    Scanner sc= new Scanner(System.in);
    void getData()
    {
        System.out.println("enter no. of terms");
        n=sc.nextInt();
    }
    void calc()
    {
        int s=0; int p=0;
        for(int i=1; i<=n; i++)
        {
            p=p+i;
            s=s+p;
        }
        System.out.println("sum="+s);
    }
    public static void main()
    { scS1 obj = new scS1();
        obj.getData();
        obj.calc();
    }
}
