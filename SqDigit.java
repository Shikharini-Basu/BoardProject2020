// sum of square  of digits
import java.util.Scanner;
public class SqDigit
{
    Scanner sc= new Scanner(System.in);
    int n; int rem;double sum=0.0; 
    void getData()
    { System.out.println(" enter your no.");
        n=sc.nextInt();
    }
    void calc()
    { while(n!=0)
        {
            rem=n%10;
            sum=sum+Math.pow(rem,2);
            n=n/10;
        }
      System.out.println("sum of square of digits="+sum); 
    }
    public static void main()
    {  SqDigit obj=new SqDigit();
        obj.getData();
        obj.calc();
    }
}
