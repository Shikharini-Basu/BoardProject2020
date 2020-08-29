import java.util.Scanner;
public class binary_decimal
{
    Scanner sc=new Scanner(System.in);
    int n; double sum=0.0;
    void getData()
    { System.out.println("enter no. to be converted to decimal");
         n=sc.nextInt();
    }
    void calc()
    { int len=0;int rem;int T1=n;
        while(n!=0)
        { n=n/10;
            len=len+1;
        }
        for(int i=0;i<len;i++)
        { rem=T1%10;
           sum=sum+(rem*(Math.pow(2,i)));
           T1=T1/10;
        }
        System.out.println("decimal form="+(int)sum);
    }
    public static void main()
    {  Scanner sc=new Scanner(System.in);
        binary_decimal obj= new binary_decimal();
        obj.getData();
        obj.calc();
    }
}
