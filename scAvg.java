// average of digits
import java.util.Scanner;
public class scAvg
{
    Scanner sc= new Scanner(System.in);
    int n; int rem=0; double rev=0.0;double sum=0.0; double avg;
    void getData()
    { System.out.println(" enter your no.");
        n=sc.nextInt();
    }
    void calc()
    { while(n!=0)
        {
            rem=n%10;
            rev=rev+1;
            sum=sum+rem;
            n=n/10;
        }
        avg= sum/rev;
      System.out.println("average of digits="+avg); 
    }
    public static void main()
    { scAvg obj=new scAvg();
        obj.getData();
        obj.calc();
    }
}
