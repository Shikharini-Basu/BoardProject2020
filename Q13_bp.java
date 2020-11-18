import java.util.Scanner;
class Q13_bp
{ double[] arr; int i;
    Q13_bp()
    { arr=new double[5];
    }
    void init()
    { Scanner sc=new Scanner(System.in);
        System.out.println(" enter the temperatures of 5 cities");
        for( i=0;i<=arr.length-1;i++)
        arr[i]=sc.nextDouble();
    }
    void display()
    { for(int i=0;i<=arr.length-1;i++)
        { System.out.print(" "+arr[i]+" ");}
        System.out.println();
    }
    void arrange()
    {  double temp;
        for(int i=0; i<=arr.length-2; i++)
        {
        for(int j=0; j<=arr.length-2; j++)
        { if(arr[j]>arr[j+1])
            { temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
         
    } display();
}
    public static void main()
    { Q13_bp obj= new Q13_bp();
        obj.init();
        obj.arrange();
    }
}
        