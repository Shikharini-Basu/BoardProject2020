import java.util.Scanner;
public class D1D2
{ Scanner sc= new Scanner(System.in);
    int n;  int rem1,rem2;
    void getdata()
    {  System.out.println(" enter your no.");
        n=sc.nextInt();
    }
     void calc()
    {
        rem1=n%10;
        while(n>0)
        {
            rem2=n%10;
            n=n/10;
        }
        System.out.println(rem2 + rem1);
    }   
public static void main()
{ D1D2 obj= new D1D2();
    obj.getdata();
    obj.calc();
    
}
}
    