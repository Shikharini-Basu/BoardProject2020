class simple_interest
{
    double p,r,t,si;
    void init(double time,double principal,double rate)
    {
        p=principal;r=rate;t=time;
    }
    double calc()
    {
        si=(p*r*t)/100.0;
        return si;
    }
    public static void main ()
    {
        simple_interest obj=new simple_interest();
        obj.init(5.0,2000.0,2.5);
        double si= obj.calc();
        System.out.println(" simple interest="+si);
    }
}
 