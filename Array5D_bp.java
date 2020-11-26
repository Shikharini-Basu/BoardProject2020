// board project question
import java.util.Scanner;
public class Array5D_bp
    {  int n;int[] roll; int[] m1; int[] m2; int[] m3; String[] name;
       void init()
        { Scanner sc=new Scanner(System.in);
            System.out.println(" enter no. of students");
             n=sc.nextInt();
             name= new String[n];// creating arrays
             roll= new int[n];
             m1= new int[n];
             m2= new int[n];
             m3= new int[n];
        }
        void compute()
       {   
            for(int i=0; i<n;i++)
            { 
                Scanner sc=new Scanner(System.in);
                System.out.println("enter name");// enetring the inputs
                name[i]=sc.next();
                System.out.println(" enter roll no.");
                roll[i]=sc.nextInt();
                System.out.println(" enter marks of 3 subjects");
                m1[i]=sc.nextInt();
                  m2[i]=sc.nextInt();
                    m3[i]=sc.nextInt();
                
               
                double avg= (m1[i]+m2[i]+m3[i])/3.0;
                   if(avg<=100.0 && avg>=85.0)// checking the grade
                   { System.out.println("EXCELLENT");
                    }
                    else if(avg<=84.0 && avg>=75.0)
                   { System.out.println("DISTINCTION");
                    }
                   else if(avg<=74.0 && avg>=60.0)
                   { System.out.println("FIRST CLASS");
                    }
                    else if(avg<=59.0 && avg>=40.0)
                   { System.out.println("PASS");// print statement
                    }
                    else{System.out.println("POOR");
                    }
                }
            }
            public static void main()
            { Array5D_bp obj= new Array5D_bp();
                obj.init();
                obj.compute();
        }
 }