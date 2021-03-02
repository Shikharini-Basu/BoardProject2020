import java.util.*;
public class CabService 
{
    String car_type;
    double km, bill;
    Scanner sc = new Scanner(System.in);
    CabService() // constructor to initiliaze variables 
    {
        car_type = "";
        km = 0.0;
        bill = 0.0;
    }
    
    void accept ()
    {
        System.out.println("Enter the type of car: Ac Car or Non AC car");
        car_type = sc.nextLine();
        System.out.println("Enter the number of kilometers travelled");
        km = sc.nextInt();
    }
    
    void calculate()
    {
        if(km<=5)
        {
            if(car_type.equalsIgnoreCase("AC CAR")) //will calculate the bill if km travelled<=5
            bill = 150;
            else 
            bill = 120;
        }
        else 
        {
            if(car_type.equalsIgnoreCase("AC CAR")) ////will calculate the bill if km travelled>5
            bill = 150.0 + (10.0*km);
            else 
            bill = 120.0 + (8.0*km);
        }
    }
    
    void display()
    {
        System.out.println("CAR TYPE: "  + car_type);
        System.out.println("KILOMETER TRAVELLED: " + km);
        System.out.println("TOTAL BILL: " + bill);
    }
    
    public static void main()
    {
        CabService obj = new CabService();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}