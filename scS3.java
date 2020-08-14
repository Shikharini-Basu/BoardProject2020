// s=2+5+10+17...n terms

import java.util.Scanner;
public class scS3
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
         double s=0.0;
         for(int i=1; i<=n; i++)
         {
             s+=1;
             s+=Math.pow(i,2);
             }
                 System.out.println("sum="+s);
           }
        public static void main()
    { scS3 obj = new scS3();
        obj.getdata();
        obj.calc();
    }
}
        