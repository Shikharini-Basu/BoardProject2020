import java.util.Scanner;
class offline
{ 
    int[] arr;
    offline(int size)
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
    { 
        int temp; 
        for(int i=0; i<=arr.length-1; i++)
       {
           if(i%2==0)
           { temp=arr[i];
               arr[i]=arr[i+1];
               arr[i+1]=temp;
        }
        System.out.println(arr[i]);
    }
    }
    public static void main()
    { offline obj= new offline(10);
        obj.init();
        obj.display();
    }
}