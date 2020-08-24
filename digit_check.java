import java.util.Scanner;
public class digit_check
{ Scanner sc= new Scanner(System.in);
    int n;
    void getdata()
    {System.out.println(" enter your no.");
        n=sc.nextInt();
    }
    static int firstdigit( int n) 
    {  while(n>=10)
        {
            n /= 10; }
      // return the first digit 
        return n; 
    } 
  
    // Find the last digit 
    public static int lastdigit(int n) 
    { 
        // return the last digit 
        return (n % 10); 
    } 
      
    // driver function 
    public static void main(String args[]) 
    { 
        digit_check obj= new digit_check();
        int f=obj.firstdigit(digit_check.n);
        int g=obj.lastdigit(digit_check.n);
        System.out.println(f+ " "+g); 
    } 
} 