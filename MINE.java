public class MINE
{
    MINE()
    {
        calculate();
        System.out.println("constructor");
    }
    public void calculate()
    { show();
        System.out.println("calculating");
    }
    public void show()
    {
        System.out.println("i am displaying");
    }
    public static void main(String args[])
    {
        MINE one=new MINE();
    }
}
