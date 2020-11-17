/** Design a class Park, described as below:
Data members:
EntryFee(double), Age(int), Discount(double), Amount(double)
Member methods:
(i) Park() –Constructor to initialize data members to null.
(ii) Input() – To input values for member data,Entry Fee,Age,Discount
(iii) Calculate()- To calculate the amount payable by giving discount as per the
following chart:
Age(in years) Discount on Entry Fee
&lt;=12 45%
&gt;= 50 50%
Otherwise 10%
(iv) Display() – to display the member data
Write a main() method to create an object of class Park and call the above methods */

import java.util.Scanner;
public class Park
{   double EntryFee, Discount, Amount ; int Age;
    Park()
    { EntryFee=0.0; Discount=0.0; Amount=0.0; 
    }
    void Input()
    { Scanner sc=new Scanner(System.in);
        System.out.println(" enter entry fee ");
        EntryFee= sc.nextDouble();
        System.out.println(" enter age ");
        Age=sc.nextInt();
    }
    void Calculate()
    { if(Age<=12)
        { Discount= (45.0/100.0)*EntryFee;
            Amount=EntryFee-Discount;
        }
        else if( Age>=50)
        { Discount= (50.0/100.0)*EntryFee;
            Amount=EntryFee-Discount;}
            else
            { Discount=(10.0/100.0)*EntryFee;
            Amount=EntryFee-Discount;}
        }
    void Display()
    { System.out.println("entry fee="+ EntryFee);
        System.out.println("Age="+ Age);
        System.out.println("discount="+ Discount);
        System.out.println("amount="+ Amount);}
        public static void main()
        { Park obj= new Park();
            obj.Input();
            obj.Calculate();
            obj.Display();
        }
    }
            
        