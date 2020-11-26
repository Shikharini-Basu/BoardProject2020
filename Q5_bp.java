import java.util.Scanner;
public class Q5_bp
{   Scanner sc=new Scanner(System.in); int n;
    void genMenu()
    {    System.out.println(" What would you like to do?");
        System.out.println("1. erect triangle pattern");
           System.out.println("2. inverted triangle pattern");
            System.out.println("enter any no. except 1/2 to exit");
        }
    void init()
    {  System.out.println("enter no. of rows");
        n=sc.nextInt();}
    void calc1()
    {
      for(int i=1; i<=n; i++)
        {
         for(int j=1; j<=i; j++)
          {
             System.out.print(j+" ");
                       }
         System.out.println();
      }
    }
    void calc2()
    {
        for( int i=1;i<=n;i++)// no. of rows
        {
            for( int j=0; j<=(n-i) ; j++)// row no.
            {
                System.out.print("5 ");
            }
              System.out.println();
            }
        }
    public static void main()
    { 
       Scanner sc=new Scanner(System.in); 
     Q5_bp obj= new  Q5_bp();
     int opt;char choice;
     do{ 
         obj.genMenu();
         System.out.println("enter selection 1/2/3");
         opt=sc.nextInt();
         if(opt==1)
         { obj.init(); obj.calc1();
            }
            else if(opt==2)
            { obj.init(); obj.calc2();
            }
            else 
            { return;}//1. used to exit method,2. returns value to caller
            System.out.println("would you like to continue? if yes, enter y or if no, enter n");
             choice=sc.next().charAt(0);// do not use next.readLine() 
             //bcoz the enter key would get read and "StringIndexOutOfBoundsException" would be raised/displayed.
        }while(choice=='y');
    }
}
    