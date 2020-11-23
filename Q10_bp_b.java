/* print the pattern:  5 4 3 2 1
                       5 4 3 2
                       5 4 3
                       5 4
                       5
 */
public class Q10_bp_b
{
int rows; int c=5;
void init(int n)
{
rows=n;
}
void calc()
{ 
    for( int i=1;i<=rows;i++)// no. of rows
{
    for(int j=0; j<=(rows-i); j++)// columns
{
     System.out.print((int)(c-j)+" ");// printing after calculating
    }
      System.out.println();
    }
}
public static void main(String args[])
{
 Q10_bp_b obj= new Q10_bp_b();
 obj.init(5);
 obj.calc();
}
}
            