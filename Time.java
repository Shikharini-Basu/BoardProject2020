public class Time
{
    private long hr,min,sec,seconds;
    void ACCEPT( long hour, long minute, long second)
    {
        hr=hour;min=minute; sec=second;
    }
    void Convert()
    {
        seconds= (hr*3600)+(min*60)+sec;
    }
    void showResult()
    { System.out.println("time="+hr+":"+min+":"+sec+"\ntime in seconds="+seconds);
    }
    public static void main(String args[])
    { Time obj= new Time();
        obj.ACCEPT( 13,30,40);
        obj.Convert();
        obj.showResult();
    }
}
        