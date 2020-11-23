public class q4_switch_bp
{
    public static void main(char ch, double P,double r, int n,double mp,double rd_rate, int time_in_months)
    {
        switch(ch)
        {
            case 'T':
            double x= (1+(r/100));// interest calculation for first case
            double Amt= P* Math.pow(x,n);
            System.out.println("amount="+ Amt);
            break;
            case 'R':
            double A= mp* time_in_months + (mp*time_in_months*(time_in_months +  1)/2.0) * ( rd_rate/100.0)*(1/12.0);/* interest
            calculation for 2nd case*/
            System.out.println("maturity amount="+ A);
            break;
            default:System.out.println("invalid");
            break;
        }
    }
}
 