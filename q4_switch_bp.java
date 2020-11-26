public class q4_switch_bp
{   
    public static void main(char ch, double P,double r, int n)
    { int time_in_months;
        switch(ch)
        {
            case 'T':
            double x= (1+(r/100));// interest calculation for first case
            double Amt= P* Math.pow(x,n);
            System.out.println("amount="+ Amt);
            break;
            case 'R':
            time_in_months=n*12;
            double A= P* time_in_months + (P*time_in_months*(time_in_months +  1)/2.0) * ( r/100.0)*(1/12.0);/* interest
            calculation for 2nd case*/
            System.out.println("maturity amount="+ A);
            break;
            default:System.out.println("invalid");
            break;
        }
    }
}
 