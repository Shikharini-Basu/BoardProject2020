import java.util.Scanner;
public class s
{ int abc=0,i;
    Scanner sc= new Scanner(System.in);
    int fact(int m)
    { for(int j=1;j<=i;j++)
       abc=j+10;
       return abc;
    }
    public static void main()
    { int sum=0;
        for( i=2;i<=20;i+=2)
        { if(i%4==0)
            { sum=sum-i;}
            else{sum=sum+i;}
        }
        System.out.println(sum);
        int n=sc.nextInt();
        for( i=1;i<=n;i++)
        System.out.println(fact(j));
        
    }
}