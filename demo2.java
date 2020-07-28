public class demo2
{
    void series(int x, int n)
    { double sum1=0.0;
        for(int i=1; i<=n;i++)
        { sum1= sum1+ Math.pow(x,i);
        }
            System.out.println(" series of x:"+sum1);
        
    }
    void series(int a)
    { double sum2=0.0;
        for(int i=2; i<=a;i++)
        { sum2= sum2+ 1.0/i;
        }
            System.out.println(" series of nos:"+sum2);
        
    }
    public static void main()
    { demo2 obj=new demo2();
      obj.series(2,3);
      obj.series(4);
    }
}

       