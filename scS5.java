// s=1+2/1*2 +.....(1+2+..n/1*2..n)

import java.util.Scanner;
public class scS5
{
   int n; 
void getData()
{
Scanner sc= new Scanner(System.in);
System.out.println(" enter value of n");
n=sc.nextInt();
}
int seqSum(int m)
{
    int s=0;
    for(int i=1;i<=m; i++)
    s=s+i;
    return s;
}
int fact(int m)
{ int prod=1;
    for(int i=1; i<=m; i++)
    prod=prod*i;
    return prod;
}
void sum()
{ double sum=0.0;
    for(int i=1; i<=n; i++)
    sum=sum+(double)seqSum(i+1)/fact(i+1);
    System.out.println("sum="+sum);
}
public static void main()
{
    scS5 obj= new scS5();
    obj.getData();
    obj.sum();
}
}
