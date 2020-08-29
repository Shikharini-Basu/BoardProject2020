import java.util.Scanner;
public class scCalc
{  
    int n1,n2,n3; char ch;
    void add()
    { n3=n1+n2;
        System.out.println("add="+n3);
    }
    void sub()
    {n3=n1-n2;
        System.out.println("sub="+n3);
    }
    void mul()
    {n3=n1*n2;
        System.out.println("multiplication="+n3);
    }
    void div()
    {
        n3=n1/n2;
        System.out.println("div="+n3);
    }
    void accept()
    {System.out.println("enter n1");
             Scanner sc= new Scanner(System.in);
            n1= sc.nextInt();
            System.out.println("enter n2");
             n2= sc.nextInt();
           System.out.println("enter a ch");
            ch= sc.next().charAt(0);
         
    }
    public static void main()
        {
            scCalc obj= new scCalc();
            obj.accept();
             Scanner sc= new Scanner(System.in);
     if(obj.ch=='+')
        { obj.add();
        }
        else if(obj.ch=='-')
        { obj.sub();
        }
        else if(obj.ch=='*')
        { obj.mul();
        }
        else if(obj.ch=='/')
        { obj.div();
        }
        else
        { System.out.println("invalid char");
        }
    }     
}
