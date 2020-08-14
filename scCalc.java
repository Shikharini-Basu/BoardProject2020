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
        public static void main()
        {
            scCalc obj= new scCalc();
            System.out.println("enter n1");
             Scanner scCalc= new Scanner(System.in);
            obj.n1= scCalc.nextInt();
            System.out.println("enter n2");
             obj.n2= scCalc.nextInt();
           System.out.println("enter a ch");
            char ch= scCalc.next().charAt(0);
            
    if(ch=='+')
        { obj.add();
        }
        else if(ch=='-')
        { obj.sub();
        }
        else if(ch=='*')
        { obj.mul();
        }
        else if(ch=='/')
        { obj.div();
        }
        else
        { System.out.println("invalid char");
        }
}     
}
