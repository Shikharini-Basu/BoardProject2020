import java.util.Scanner;
public class pattern2
{  Scanner sc=new Scanner(System.in);
    int n;
    void getData()
    { System.out.println("enter no. of rows you want to print");
        n=sc.nextInt();
    }
    void calc()
    { int count=1;//x=0
for(int i=1;i<=n;i++)
{
    int c=count;// x=1
    for(int j=1;j<=i;j++)
    {
        System.out.print(c+" ");// SOP(" "+(x++));
        c++;
    }
    count++;// not there if using x
    System.out.println();
}
        }
    public static void main()
    { pattern2 obj=new pattern2();
        obj.getData();
        obj.calc();
    }
}
