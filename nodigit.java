// counting no. of digits
import java.util.Scanner;
public class nodigit
{
    Scanner sc= new Scanner(System.in);
    int n; int rem=0, rev=0;
    void getData()
    { System.out.println(" enter your no.");
        n=sc.nextInt();
    }
    void calc()
    { while(n!=0)
        {
            rem=n%10;
            rev=rev+1;
            n=n/10;
        }
      System.out.println("no. of digits="+rev); 
    }
    public static void main()
    { nodigit obj=new nodigit();
        obj.getData();
        obj.calc();
    }
}
 