/**question 5 of board paper 
 1
 1 2
 1 2 3...
 */
public class ques5a_bp_pattern
{
    int rows;
    void init(int n)// no. of rows is n
    {
      rows=n;
    }
void calc()
{
for(int i=1; i<=rows; i++)
{
for(int j=1; j<=i; j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
public static void main(String args[])
{
    ques5a_bp_pattern obj = new ques5a_bp_pattern();
    obj.init(6);
    obj.calc();
}
}
  