
public class date_cons// program to demonstarte constructor usage
{   
    int dd,mm,yy;
    date_cons(int date,int month,int year)
    {
        dd= date; mm= month; yy= year;
    }
    void display()
    { System.out.println("date="+dd+"/"+mm+"/"+yy);
    }
    public static void main(String args[])
    {
       date_cons obj= new date_cons(02,12,2019);
       obj.display();
    }
}
 