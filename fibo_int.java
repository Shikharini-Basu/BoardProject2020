import java.util.Scanner;
public class fibo_int
{   Scanner sc=new Scanner(System.in);
    void genMenu()
    {    System.out.println(" What would you like to do?");
        System.out.println("1. diplay the first 10 terms of fibonacci series ");
           System.out.println("2. calculate the sum of digits of a number");
            System.out.println("enter any no. except 1/2 to exit");
        }
    void calcFibo()
    {int n=3,a=0,b=1,c;
        System.out.println(a+"\n"+b);
    while(n<=10)
    { c=a+b;
       System.out.println(c);
       a=b;
       b=c;
       n++;}
    }
    void calcDigitSum()
    { System.out.println("enter number");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0)
        { int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void main()
    { 
       Scanner sc=new Scanner(System.in); 
     fibo_int obj= new  fibo_int();
     int opt;char choice;
     do{ 
         obj.genMenu();
         System.out.println("enter selection 1/2");
         opt=sc.nextInt();
         if(opt==1)
         { obj.calcFibo();
            }
            else if(opt==2)
            {obj.calcDigitSum();
            }
            else
            {System.out.println("incorrect choice");
            }
        System.out.println("would you like to continue? if yes, enter y or if no, enter n");
             choice=sc.next().charAt(0);
            }while(choice=='y');
        }
    }
        
            