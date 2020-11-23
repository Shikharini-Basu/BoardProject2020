import java.util.Scanner;
public class bp_Q5
{
    int n; 
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows");
        n=sc.nextInt();
    }
    void calc()
    {
        for( int i=1;i<=n;i++)// no. of rows
        {
            for( int j=0; j<=(n-i) ; j++)// row no.
            {
                System.out.print("5 ");
            }
              System.out.println();
            }
        }
    public static void main (String args[])
    {
        bp_Q5 obj= new bp_Q5();
        obj.init();
        obj.calc();
    }
}
