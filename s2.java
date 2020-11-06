import java.util.Scanner;
public class s2
{  
    void compute()
    { 
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(); 
        double sum=0.0; double j=2.0;
         for(int i=1; i<=n;i++)
        { 
        sum=sum+(double)(i/j);
        j+=2.0;
    }
    System.out.println(sum);
}
public static void main()
{
    s2 obj= new s2();
    obj.compute();
    
}
}
// 1/2+ 2/4 + 3/6.....n