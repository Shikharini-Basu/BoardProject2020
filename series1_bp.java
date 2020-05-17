/**Write a program to calculate and print the sum of each of the following series:
(a) Sum = 2-4+6-8+10......-20*/

public class series1_bp
{
    public static void main(String args[])//sum=2-4+6....
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
}


