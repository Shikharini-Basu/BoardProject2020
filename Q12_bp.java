import java.util.Scanner;
class Q12_bp
{ String[] arr; int i;
    Q12_bp()
    { arr=new String[20];
    }
    void init()
    { Scanner sc=new Scanner(System.in);
        System.out.println(" enter the alphabets");
        for( i=0;i<=arr.length-1;i++)
        arr[i]=sc.nextLine();
    }
    void display()
    { 
        for(int i=0;i<=arr.length-1;i++)
        { System.out.print(" "+arr[i]+" ");}
        System.out.println();
    }
    void arrange()
    {  String temp;
        for(int i=0; i<=arr.length-2; i++)
        {
        for(int j=0; j<=arr.length-2; j++)
        { 
            if(arr[j].compareTo(arr[j+1])<0)
            { temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
         
    }   display();
   }
    public static void main()
    { Q12_bp obj= new Q12_bp();
        obj.init();
        obj.arrange();
    }
}
        