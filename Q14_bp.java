import java.util.Scanner;
class Q14_bp
{ double[] arr; int i,k;
    Q14_bp()
    { arr=new double[10];
    }
    void init()
    { Scanner sc=new Scanner(System.in);
        System.out.println(" enter the nos.");
        for( i=0;i<=arr.length-1;i++)
        arr[i]=sc.nextDouble();
    }
    void arrange()
    {  
        double sum=0.0;
        for( k=0;k<=arr.length-1;k++)
        {
          sum=sum+arr[k];}
          double avg=sum/10.0;
         for( int j=0;j<=arr.length-1;j++) 
          {if(arr[j]>avg)
            { System.out.println(arr[j]);
            }
        }
        }
        
          
    

    public static void main()
    { Q14_bp obj= new Q14_bp();
        obj.init();
        obj.arrange();
    }
}
        