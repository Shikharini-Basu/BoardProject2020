import java.util.Scanner;
class srp1
{ double[] arr; int i;
    srp1()
    { arr=new double[5];
    }
    void init()
    { Scanner sc=new Scanner(System.in);
        System.out.println(" enter the percentage");
        for( i=0;i<=arr.length-1;i++)
        arr[i]=sc.nextInt();
    }
    void compute()
    { for( i=0;i<=arr.length-1;i++)
        { arr[i]=15+arr[i];
           System.out.println(arr[i]);
    }  
   }
    public static void main()
    { srp1 obj= new srp1();
        obj.init();
        obj.compute();
    }
}
        