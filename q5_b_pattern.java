/** a b c d e
    a b c d
    a b c
    a b
    a
 */
public class q5_b_pattern
{
    int rows; char c='a';
    void init(int n)
    {
        rows=n;
    }
    void calc()
    {
        for( int i=1;i<=rows;i++)
        {
            for( int j=0; j<=(rows-i) ; j++)
            {
                System.out.print((char)(c+j)+" ");// calculating and printing
            }
              System.out.println();
            }
        }
    public static void main (String args[])
    {
        q5_b_pattern obj= new q5_b_pattern();
        obj.init(5);
        obj.calc();
    }
}
