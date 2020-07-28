public class weekly_wage
{   
    double W; int H,R;
    void init(int hour,int rate)
    { 
        H=hour; R=rate;
    }
    void calc()
    { if(H>=0 && H<=35)
       {
         W= R*H;
        }
        else if(H>35 && H<=60)
        {
            W= R*35 + 1.5*R*(H-35);
        }
        else if(H>60 && H<=70) 
        {
            W= R*35 + 1.5*R*25+ 2*R*(H-70);
        }
        else 
        { W= R*35 + 1.5*R*25+ 2*R*10;
    }
}
    void printAns()
    { System.out.println("hours worked="+ H+"\n hourly rate="+R+"\n total wage="+W);
        if(H>70)
        { System.out.println("not allowed to work for more than 70 hours and hence payment for only 70 hours is given");
        }
    }
    public static void main()
    { weekly_wage obj=new  weekly_wage();
        obj.init( 75,60);
        obj.calc();
        obj.printAns();
    }
}