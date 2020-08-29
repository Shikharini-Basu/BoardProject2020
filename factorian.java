import java.util.Scanner;
public class factorian
{ Scanner sc=new Scanner(System.in);
    int n; int sum=0;int rem;int len;
    
    void getData()
    {  System.out.println("enter no. to be converted to decimal");
         n=sc.nextInt();
    }
    int fact(int m)
    { int prod=1;
        for(int i=1;i<=m;i++)
        { prod=prod*i;}
        return prod;
    }
    void calc()
    { int T1=n;
        while(T1>0)
        { rem=T1%10;
            sum=sum+fact(rem);
            T1=T1/10;
        }
        System.out.println(sum);
        if(sum==n)
        { System.out.println("factorian no.");}
        else{ System.out.println("not factorian no.");
        }
    }
    public static void main()
    { Scanner sc=new Scanner(System.in);
        factorian obj= new factorian();
    obj.getData();
    obj.calc();
    }
}
