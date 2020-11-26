//board paper 2005
public class employee2
{
    double basic;double da,hra,pf,net_pay,gross_pay;
    employee2(double basic_pay)
    {
       basic=basic_pay; 
    }
    void calc()
    {
    da=(25*basic)/100.0;
   hra = (15*basic)/100.0;
   pf=(8.33*basic)/100.0;
   net_pay= basic+da+hra;
   gross_pay= net_pay- pf;
}
void display()
{ System.out.println("gross pay="+ gross_pay);
}
public static void main(String args[])
{
    employee2 obj= new employee2(100000.0);
    obj.calc();
    obj.display();
}
}
