/**Write a program to calculate and print the sum of each of the following series:
(b)Sum = x/2 + x/5 + x/8 + x/11 + .....+ x/20 (x to be input by user)*/

public class series2_bp
{
    public static void main(double x)
    {
     double sum=0;
     for(int i=2;i<=20; i+=3)
     {
         sum=sum+ (x/i);
        }
        System.out.println(sum);
    }
}

         
         
         
         
       
    