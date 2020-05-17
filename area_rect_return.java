public class area_rect_return
{
    int l1,b1,prod;
    void init(int l,int b)//parametrized method,multiple method,interactive method//formal parameters
    {
        l1=l;b1=b;//body of method
       } 
    int calc()//return statement
    {
        prod=l1*b1;
        return prod;
    }
    public static void main()
    {
        area_rect_return obj= new area_rect_return() ;
        obj.init(5,2);//actual arguments/parameters which are passed at time of invocation
        int prod=obj.calc();//caller
        System.out.println(prod);//obj.dispaly();
    }
}
    