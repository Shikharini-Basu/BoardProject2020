// sum of digits
import java.util.Scanner;
public class sumdigit
{
    Scanner sc= new Scanner(System.in);
    int n; int rem=0, rev=0;int sum;
    void getData()
    { System.out.println(" enter your no.");
        n=sc.nextInt();
    }
    void calc()
    { while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
      System.out.println("sum of digits="+sum); 
    }
    public static void main()
    { sumdigit obj=new sumdigit();
        obj.getData();
        obj.calc();
    }
}
