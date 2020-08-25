import java.util.Scanner;
public class perfect_no
{ Scanner sc= new Scanner(System.in);
    int n;  int rem; int sum;
    void getdata()
    {  System.out.println(" enter your no.");
        n=sc.nextInt();
    }
    void calc()
    { for(int i=1;i<n;i++)
        {
        if(n%i==0)
        { 
            sum=sum+i;
        }
    }   System.out.println(sum);
       if(n==sum)
    {   System.out.println("perfect no.");
       }
       else
       { System.out.println(" not perfect no.");
        }
    }
    public static void main()
 {  perfect_no obj= new perfect_no();
    obj.getdata();
    obj.calc();
    
}
}