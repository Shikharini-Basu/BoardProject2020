public class floyds_triangle
{
    int count=0, x;
    void init(int n)//no. of rows
    {
        x=n;
    }
    void floyd()
    {
        int value=1;//starting value
        for (int a=1;a<=x;a++)
        {
            for(int b=1;b<=a;b++)// loops for series
            {
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        floyds_triangle obj= new floyds_triangle();
        obj.init(4);
        obj.floyd();
    }
}
