import java.util.Scanner;
public class digit_check
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
        System.out.println(rem2 +"\n"+ rem1);
    }   
public static void main()
{ digit_check obj= new digit_check();
    obj.getdata();
    obj.calc();
    
}
}
    