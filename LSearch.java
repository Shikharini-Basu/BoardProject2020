import java.util.Scanner;
class LSearch
{ 
    int[] arr;
    LSearch()
    { arr= new int[10];}
    void init()
    { 
        Scanner sc= new Scanner( System.in);
        System.out.println(" enter 10 nos.");
        for(int i=0; i<=arr.length-1; i++)
        { arr[i]=sc.nextInt();
        }
    }
    void search(int num)
    { int pos=-1;
        for(int i=0; i<=arr.length-1; i++)
        if(arr[i]==num)
        pos=i;
        
        if(pos==-1)
        System.out.println(" num not found");
        else
        System.out.println(" num  found="+arr[pos]+"at "+ pos);
    }
    public static void main()
    { LSearch obj=new LSearch();
        obj.init();
        Scanner sc= new Scanner( System.in);
        System.out.println("enter num");
        int num= sc.nextInt();
        obj.search(num);
    }
}