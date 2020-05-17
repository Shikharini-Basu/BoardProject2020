/** Write a program with an “Employee” class having two variables one for the name of
employee(String) and other for base salary (float).Create a function that calculates the total
salary by adding 50% HRA to the salary and returns.Create an object of this class in main
function and set the name of the employee, call the salary function and print the calculated
salary returned by the function with name of the employee.*/

public class employee
{
    String n;float s;
    void init(String name, float salary)
    { n=name; s=salary;
    }
    double calc()
    {
        double hra=(50*s)/100;
        double payment=s+hra;
        System.out.println("Name of employee="+n);
        System.out.println("salary="+s);
        System.out.println("HRA="+hra);
        System.out.println("total salary returned=");return payment;
        
    }
    public static void main()
    {
        employee obj= new employee();
        obj.init ("Shikharini Basu", 100000f);
        double display = obj.calc();
        System.out.println(display);
    }
}
    
    
        
    