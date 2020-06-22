
public class date_cons// program to demonstarte constructor overloading
{   
    int dd,mm,yy;
    date_cons(int dd,int mm,int yy)
    {
        this.dd= dd; this.mm= mm; this.yy= yy;
    }
    void display()
    { System.out.println("date="+dd+"/"+mm+"/"+yy);
    }
    public static void main(String args[])
    {
       date_cons obj= new date_cons(2,12,2019);
       obj.display();
    }
}
 