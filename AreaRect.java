public class AreaRect
{
    int l1,b1,prod;
    void init(int l,int b)//parametrized method,multiple method,interactive method
    {
        l1=l;b1=b;//body of method
       
    }
    void calc()
    {
        prod=l1*b1;
    }
    void display()
    {
        System.out.println("the area of rectangle is="+ prod);
    }
    public static void main()
    {
        AreaRect obj=new AreaRect();//object creation
        obj.init(4,6);//caller
        obj.calc();
        obj.display();//every time ans will come 24
    }
}