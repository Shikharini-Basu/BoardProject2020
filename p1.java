import java.util.Scanner;
public class p1
{  Scanner sc=new Scanner(System.in);
    int n;
    void getData()
    { System.out.println("enter no. of rows you want to print");
        n=sc.nextInt();
    }
    void calc()
    { int k=1;
        for(int i=1;i<=n;i++)
        { 
            for(int j=1;j<=((2*i)-1);j++)
            {  
                if(j%2==0)
                System.out.print("*");
                else
                System.out.print((k++)+" ");
                
            }
            System.out.println(" ");
        }
    }
    public static void main()
    { p1 obj=new p1();
        obj.getData();
        obj.calc();
    }
}