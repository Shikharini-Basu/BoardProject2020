public class addTime
{
    int hrs,min;
    void input(int h,int m)
    { hrs=h; min=m;
    }
    void addTime( addTime obj1,addTime obj2)
    { int totalmins= obj1.hrs*60+ obj1.min+ obj2.hrs*60+ obj2.min;
        hrs=totalmins/60;
        min= totalmins%60;
    }
    void display()
    {System.out.println("total time="+ hrs+"hrs"+min+"mins");
    }
    public static void main()
    { addTime t1= new addTime();
        addTime t2= new addTime();
        addTime t3= new addTime();
        t1.input(2,50);//obj1 can also be used
        t2.input(3,50);
        t3.addTime(t1,t2);
        t3.display();
    }
}
        