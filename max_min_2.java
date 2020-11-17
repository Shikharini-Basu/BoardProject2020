import java.util.Scanner;
class max_min_2
{ 
    int[] arr= new int[5]; int x;
    void init()
    { 
        Scanner sc= new Scanner( System.in);
        System.out.println(" enter 5 nos.");
        for(int i=0; i<=arr.length-1; i++)
        { arr[i]=sc.nextInt();
        }
        System.out.println(" enter X");
         x=sc.nextInt();
    }
    void display()
    {   int fmax=0; int max=0,min=0;int  fmin=0;
        for(int i=0; i<=arr.length-1; i++)
         {  
             if(arr[i]% x==0)
             { fmax=arr[i];
                 fmin=arr[i];}
                 if(fmax>max)
                 max=fmax;
                
        }
        System.out.println(fmax);}
    public static void main()
    { max_min_2 obj= new max_min_2();
        obj.init();
        obj.display();
    }}