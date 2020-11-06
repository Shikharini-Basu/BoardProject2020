import java.util.Scanner;
class Arr2
{ 
    int[] arr= new int[10];
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
       { int count=0;
           for(int j=2; j<arr[i]; j++)
           { if(arr[i]%j==0)
               count++;}
               if(count==0)
           System.out.println(arr[i]+" is prime no.");
        }
    }

    public static void main()
    { Arr2 obj= new Arr2();
        obj.init();
        obj.display();
    }
}