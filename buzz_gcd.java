import java.util.Scanner;
public class buzz_gcd
{   Scanner sc=new Scanner(System.in);
    void genMenu()
    {       System.out.println(" What would you like to do?");
            System.out.println("1.check if a no. is a buzz no.");
           System.out.println("2. calculate the GCD of 2 nos.");
            System.out.println("enter any no. except 1/2 to exit");
        }
    void buzz()
    {    System.out.println("enter no. you want to check");
        int n=sc.nextInt();
        int rem=n%10;
        if(n/7==0 || rem==7)
        {  System.out.println(n+" is a buzz no.");
        }
        else {System.out.println(n+" is not a buzz no.");}
         
    }
    void GCD()
    {   
        int gcd=0;
        System.out.println("enter 1st no.");
        int a=sc.nextInt();
        System.out.println("enter 2nd no.");
        int b=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
        if(a%i==0 && b%i==0)
        {gcd=i;}
    }
            System.out.println(gcd+" is the GCD of the 2 nos.");
        
        int lcm=(a*b)/gcd;//additional for info
        System.out.println(lcm+" is the LCM of the 2 nos.");
    
}
    public static void main()
    { 
       Scanner sc=new Scanner(System.in); 
     buzz_gcd obj= new  buzz_gcd();
     int opt;char choice;
     do{ 
         obj.genMenu();
         System.out.println("enter selection 1/2");
         opt=sc.nextInt();
         if(opt==1)
         { obj.buzz();
            }
            else if(opt==2)
            { obj.GCD();
            }
            else 
            { return;}//1. used to exit method,2. returns value to caller
            System.out.println("would you like to continue? if yes, enter y or if no, enter n");
             choice=sc.next().charAt(0);// do not use next.readLine() 
             //bcoz the enter key would get read and "StringIndexOutOfBoundsException" would be raised/displayed.
        }while(choice=='y');
    }
}
    