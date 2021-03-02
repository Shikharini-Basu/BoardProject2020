import java.util.Scanner;
class ArrSumPosition
{ 
     int[] arr;
    ArrSumPosition()
    { arr=new int[10];}
    void init()
    { 
       Scanner sc= new Scanner( System.in);
        System.out.println(" enter 10  nos.");
        for(int i=0; i<=arr.length-1; i++)
        { arr[i]=sc.nextInt();
        }
    }
    void display()
    {  int sum1=0, sum2=0;
        for(int i=0; i<=arr.length-1; i++)
        { if(i%2==0)
            { sum1=sum1+arr[i];}
            else
            sum2=sum2+arr[i];
    } 
    System.out.println("sum of nos. in even position=" +sum1);
    System.out.println("sum of nos. in odd position=" +sum2);
    if(sum1>sum2)
    System.out.println("difference between sum of nos. from even position and odd positions="+ (sum1-sum2));
    else
    System.out.println("difference between sum of nos. from even position and odd positions="+ (sum2-sum1));
}
    public static void main()
    { ArrSumPosition obj= new ArrSumPosition();
        obj.init();
        obj.display();
    }
}