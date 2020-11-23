import java.util.Scanner;
class Q15_bp
{ 
    int[] arr;
    Q15_bp()
    { arr= new int[8];}
    void init()
    { 
        Scanner sc= new Scanner( System.in);
        System.out.println(" enter 8 numbers");
        for(int i=0; i<=arr.length-1; i++)
        { arr[i]=sc.nextInt();
        }
    }
    void compute()
    {   System.out.println("nos. ending with 3 are: ");
        for(int k=0;k<=arr.length-1;k++)
        { if(arr[k]%10==3)
            { System.out.println(arr[k]);
            }
        }
    }
    public static void main()
    { Q15_bp obj= new Q15_bp();
        obj.init();
        obj.compute();
    }
}