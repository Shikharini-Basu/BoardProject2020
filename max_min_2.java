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
    {   int fmax=0;int fmin=0;int a=Integer.MAX_VALUE;
        for(int i=0; i<=arr.length-1; i++)
         {  
             if(arr[i]% x==0)
             { fmin=Math.min(arr[i],a);
                 a=fmin;
                }
            }
          int b=Integer.MIN_VALUE;
          for(int i=0; i<=arr.length-1; i++)
         {  
             if(arr[i]% x==0)
             { fmax=Math.max(arr[i],b);
                }
            } 
        System.out.println(fmax+"\n"+fmin);}
    
    public static void main()
    { max_min_2 obj= new max_min_2();
        obj.init();
        obj.display();
    }}