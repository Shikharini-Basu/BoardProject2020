import java.util.Scanner;
class Arr_odd_even
{ 
    int[] arr;
    Arr_odd_even(int size)
    {arr= new int[size];}
   
    void init()
    { 
        Scanner sc= new Scanner( System.in);
        System.out.println(" enter 10 nos.");
        for(int i=0; i<=arr.length-1; i++)
        { arr[i]=sc.nextInt();
        }
    }
    void display()
    { for(int i=0; i<=arr.length-1; i++)
       {
           if(arr[i]%2==0)
           System.out.println(arr[i]+" is even");
           else
           System.out.println(arr[i]+" is odd");
        }
    }

    public static void main()
    { Arr_odd_even obj= new Arr_odd_even(10);
        obj.init();
        obj.display();
    }
}