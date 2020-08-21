public class Series
{
    public double series(double n)
    { double s=0;
        for(double i=1.0;i<=n;i++)
        { s=s+1/i;// 1st series
        }
        return s;
    }
    public double series( double a, double n)
    { double sum=0.0; double b=2.0; double c=1.0;
        for(int i=0;i<=n;i++)
        {
        sum=sum+(c/Math.pow(a,b));// calc 2nd series
        c+=3.0;
        b+=3.0;}
        return sum;
    }
    public static void main()
    {
        Series obj1= new Series();
        double x=obj1.series(4.0);// inputing value for n of 1st series
        System.out.println("sum for 1st series="+x);
        Series obj2= new Series();
         double y=obj2.series(2.0,4.0);// values of a and n respectively
        System.out.println("sum for 2nd series="+y);
        
    }
}
        