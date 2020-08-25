import java.util.Scanner;
public class automorphic
{ Scanner sc= new Scanner(System.in);
    int n;  int rem1,rem2; int a;
    void getdata()
    {  System.out.println(" enter your no.");
        n=sc.nextInt();
    }
    void calc()
    { int a= n*n;
        rem1= a%10;
          if(n==rem1)
        { System.out.println("n is automorphic no.");
        }
        else
        {
            System.out.println("n is not automorphic no.");
        }
    }
    public static void main()
{ automorphic obj= new automorphic();
    obj.getdata();
    obj.calc();
    
}
}