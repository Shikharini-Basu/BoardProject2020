import java.util.Scanner;
public class Q10_bp_2
{  
    void compute()
    { 
        Scanner sc= new Scanner(System.in);
         System.out.print(" enter no. of rows ");
        int n=sc.nextInt(); 
        for(int i=1; i<=n;i++)
        { System.out.print(i);
         for(int j=1;j<=i;j++)
            { if(j%2==0)
        System.out.print(" #");
        else
        System.out.print(" * ");
    }
    
    System.out.println();
}
}
public static void main()
{
    Q10_bp_2 obj= new Q10_bp_2();
    obj.compute();
    
}
}
