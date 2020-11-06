import java.util.Scanner;
class Arr1
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
         System.out.println(arr[i]*2);
        }
    public static void main()
    { Arr1 obj= new Arr1();
        obj.init();
        obj.display();
    }
}


 