
class method_overloading_addnum
{ 
    int n1;double n2,ans;
    void printnum(int a)
    {
        n1=a;
        System.out.println("num1="+a);
    }
    void printnum(double b)
    {
         n2=b;
        System.out.println("num2=" +b);
    }
    double calc()
    {
          ans= n1+n2;
        return ans;
    }
    public static void main()
    {
     method_overloading_addnum obj= new method_overloading_addnum ();
     obj.printnum(4);
     obj.printnum(6.0);
     double display = obj.calc();
     System.out.println(display);
    }
    }
    
        