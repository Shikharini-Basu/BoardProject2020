import java.util.Scanner;
class Arr1
{ 
    int[] arr= new int[5];
    void init()
    { 
        Scanner sc= new Scanner( System.in);
        System.out.println(" enter 5 nos.");
        for(int i=0; i<=arr.length-1; i++)
        { arr[i]=sc.nextInt();
        }
    }
    void display()
    { int sum=0; double avg;
        for(int i=0; i<=arr.length-1; i++)
         {  sum=sum+arr[i];}
             
             avg=sum/5.0;
              System.out.println(sum+"\n"+avg);
        }
    public static void main()
    { Arr1 obj= new Arr1();
        obj.init();
        obj.display();
    }
}


 