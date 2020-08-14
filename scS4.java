// s= 2!-4!+6!-8!....n

import java.util.Scanner;
public class scS4
{
    int n;
    Scanner sc= new Scanner(System.in);
    void getdata()
    {
    System.out.println("enter no. of terms");
    n=sc.nextInt();
}
     int fact(int m)
     {
         int prod=1;
         for(int i=1;i<=m;i++)
         { prod=prod*i;
            }
            return prod;
        }
        void computeSum()
        {
            int sum=0;
            for(int i=1;i<=n;i++)
            { if(i%2==0)
                { sum=sum- fact(2*i);}
                else{ sum= sum+ fact(2*i);}
            }
            System.out.println("sum="+sum);
        }
        public static void main()
        { scS4 obj= new scS4();
            obj.getdata();
            obj.computeSum();
        }
    }
        