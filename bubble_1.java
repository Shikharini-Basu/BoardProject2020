import java.util.Scanner;
class bubble_1
{ 
    int[] arr= new int[5];
    void init()
    { 
        Scanner sc= new Scanner( System.in);
        System.out.println(" enter 5 nos.");
        for(int i=0; i<=arr.length-2; i++)
        { arr[i]=sc.nextInt();
        }
    }
    void display()
    { int temp; int j=0;
        for(int i=0; i<=arr.length-2;j++)
        { for( j=0; j<=arr.length-2;j++)
            { if(arr[j]>arr[j+i])
                { temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }}}
                System.out.println("Pass/Iteration:"+(j+1)+"=>"+ arr[j]);
               
                
      }
    public static void main()
    { bubble_1 obj= new bubble_1();
        obj.init();
        obj.display();
    }
}


 