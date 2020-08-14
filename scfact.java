/* s=x/1!+ x^2/2!+ ....x^n/n! */

import java.util.Scanner;
public class scfact
{
   int n,x; 
void getData()
{
Scanner sc= new Scanner(System.in);
System.out.println(" enter value of x");
x=sc.nextInt();
System.out.println(" enter value of n");
n=sc.nextInt();
}
int fact(int n)
{
    int prod=1;
    for(int i=1;i<=n;i++)
    { prod=prod*i;}
        return prod;
}
    void sum()
    {
        double sum=0.0;
        for(int i=1;i<=n;i++)
        { sum=sum+Math.pow(x,i)/fact(i);
        }
        System.out.println("sum="+sum);
    }
    public static void main()
    {
        scfact obj=new scfact();
        obj.getData();
        int f=obj.fact(3);
       
        obj.sum();
    }
}
