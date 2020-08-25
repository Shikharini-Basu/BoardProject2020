import java.util.Scanner;
public class menu_driven1
{   Scanner sc=new Scanner(System.in);
    void genMenu()
    {    System.out.println(" What would you like to do?");
        System.out.println("1. calculate volume of cylinder");
           System.out.println("2. calculate volume of cone");
        System.out.println("3. calculate volume of sphere");
            System.out.println("enter any no. except 1/2/3 to exit");
        }
    void calcCylinder()
    {    System.out.println("enter value of radius");
        int r=sc.nextInt();
        System.out.println("enter value of height");
        int h=sc.nextInt();
        double vol=3.14*r*r*h;
        System.out.println("volume of cylinder="+vol);
    }
    void calcCone()
    {   System.out.println("enter value of radius");
        int r=sc.nextInt();
        System.out.println("enter value of height");
        int h=sc.nextInt();
        double vol=(1.0/3.0)*3.14*r*r*h;
        System.out.println("volume of cone="+vol);
    }
    void calcSphere()
    {   System.out.println("enter value of radius");
        int r=sc.nextInt();
        double vol=(4.0/3.0)*3.14*r*r*r;
        System.out.println("volume of sphere="+vol);
    }
    public static void main()
    { 
       Scanner sc=new Scanner(System.in); 
     menu_driven1 obj= new  menu_driven1();
     int opt;char choice;
     do{ 
         obj.genMenu();
         System.out.println("enter selection 1/2/3");
         opt=sc.nextInt();
         if(opt==1)
         { obj.calcCylinder();
            }
            else if(opt==2)
            { obj.calcCylinder();
            }
            else if(opt==3)
            { obj.calcSphere();
            }
            else 
            { return;}//1. used to exit method,2. returns value to caller
            System.out.println("would you like to continue? if yes, enter y or if no, enter n");
             choice=sc.next().charAt(0);// do not use next.readLine() 
             //bcoz the enter key would get read and "StringIndexOutOfBoundsException" would be raised/displayed.
        }while(choice=='y');
    }
}
    