public class avg_marks_calc
{
int num1,num2,num3;
void init(int n1,int n2,int n3)
    {
        num1=n1; num2=n2; num3=n3;
    }
    double calc()
    {
    double avg= (num1+num2+num3)/3;
    return avg;
}
public static void main(String args[])
{
    avg_marks_calc obj=new avg_marks_calc();
    obj.init(30,40,50);
    double display=obj.calc();
    System.out.println(display);
}
}