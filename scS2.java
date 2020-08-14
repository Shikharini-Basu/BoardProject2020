// s= 1-2+3-4...n

import java.util.Scanner;
public class scS2
{
    int n;
    Scanner sc= new Scanner(System.in);
    void getdata()
    {
    System.out.println("enter no. of terms");
    n=sc.nextInt();
}
     void calc()
     {
         int s=0;
         for(int i=1; i<=n; i++)
         {
             if(i%2==0)
             {
                 s=s-i;
                }
                else
                { s=s+i;
                }
            }
                
               System.out.println("sum="+s);
            
        }
        public static void main()
    { scS2 obj = new scS2();
        obj.getdata();
        obj.calc();
    }
}
        