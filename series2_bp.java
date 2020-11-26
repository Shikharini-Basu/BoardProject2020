/**Write a program to calculate and print the sum of each of the following series:
(b)Sum = x/2 + x/5 + x/8 + x/11 + .....+ x/20 (x to be input by user)*/


import java.util.Scanner;
public class series2_bp
{   int x;
    series2_bp()
    {Scanner sc= new Scanner(System.in);
    System.out.println(" enter x for 2nd series");
     x=sc.nextInt();}
    void calc1()
    {
        int sum=0;
        for(int i=2;i<=20; i+=2)
        {
            if(i%4==0)
            {
                sum=sum-i;
            }
            else
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    void calc2()
    {
     double sum=0;
     for(int i=2;i<=20; i+=3)
     {
         sum=sum+ (x/i);
        }
        System.out.println(sum);
    }
    public static void main()
    { series2_bp obj = new series2_bp();
        obj.calc1();
        obj.calc2();
    }
}

         
         
         
         
       
    