import java.util.Scanner;
public class ISBN_num
{
    long  n; 
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. ");// taking num to check
        n=sc.nextLong();
    }
    void calc()
    { 
        long sum=0; long i=1,rem;
        for(int j=1; j<=10; j++)// calculation
        { rem=n%10;
            sum=sum+ rem*i;
            i++;
            n=n/10;}
            if(sum%11==0)
            System.out.println(" ISBN  no.");// checking if n is ISBN no. or no
            else
            System.out.println(" not ISBN  no.");}// print statement
    public static void main (String args[])
    {
        ISBN_num obj= new ISBN_num();
        obj.init();
        obj.calc();
    }
}
