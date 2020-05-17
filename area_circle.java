public class area_circle
{
    double radius,pi=3.14;
    void init (double r)
    { radius=r;
    }
    double calc()
    {
        double ans = pi*radius*radius;
        return ans;
    }
    public static void main()
    {
        area_circle obj = new area_circle();
        obj.init(10.5);
        double ans=obj.calc();
        System.out.println("area="+ans);
    }
}
        
       
  