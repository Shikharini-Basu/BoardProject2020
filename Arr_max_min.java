import java.util.Scanner;
class Arr_max_min
{ 
     int[] arr= new int[5];
    void init()
    { 
       Scanner sc= new Scanner( System.in);
        System.out.println(" enter 5 nos.");
        for(int i=0; i<=arr.length-1; i++)
        { arr[i]=sc.nextInt();
        }
    }
    void display()
    {  int max=arr[0]; int min=arr[0]; int fmax=0,fmin=0;
        for(int i=0; i<=arr.length-1; i++)
       {
            fmax= Math.max(max,arr[i]);
            max=fmax;
            fmin= Math.min(min,arr[i]);
            min=fmin;
        }
        System.out.println(fmax+" max"+"\n"+fmin+"min");
    }

    public static void main()
    { Arr_max_min obj= new Arr_max_min();
        obj.init();
        obj.display();
    }
}