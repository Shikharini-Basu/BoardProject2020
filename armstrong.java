import java.util.Scanner;
public class armstrong
{
    Scanner sc= new Scanner(System.in);
    int n; int sum;
    void getData()
    { System.out.println(" enter your no.");
        n=sc.nextInt();
    }
    void calc()
    {
       int rem; int T2=n;
        while(T2!=0)
        {
            rem=T2%10;
            sum=sum+rem*rem*rem;
            T2=T2/10;
        }
   
        System.out.println(sum);
    }
    void check()
    {
        if(sum==n)
        { System.out.println("armstrong no.");
        }
        else
        {  System.out.println(" not armstrong no.");
        }
    }
    public static void main()
    {   armstrong obj=new armstrong();
        obj.getData();
        obj.calc();
        obj.check();
    }
}
            
            