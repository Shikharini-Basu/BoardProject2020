// board project question
import java.util.Scanner;
public class Array5D_bp
    {    public static void main()
        { Scanner sc=new Scanner(System.in);
            System.out.println(" enter no. of students");
            int n=sc.nextInt();
            String name[]= new String[n];
            int roll[]= new int[n];
            int m1[]= new int[n];
            int m2[]= new int[n];
            int m3[]= new int[n];
            for(int i=0; i<n;i++)
            { 
          
                System.out.println("enter name");
                name[i]=sc.next();
                System.out.println(" enter roll no.");
                roll[i]=sc.nextInt();
                System.out.println(" enetr marks of 3 subjects");
                m1[i]=sc.nextInt();
                  m2[i]=sc.nextInt();
                    m3[i]=sc.nextInt();
                
               
                double avg= (m1[i]+m2[i]+m3[i])/3.0;
                   if(avg<=100.0 && avg>=85.0)
                   { System.out.println("EXCELLENT");
                    }
                    else if(avg<=84.0 && avg>=75.0)
                   { System.out.println("DISTINCTION");
                    }
                   else if(avg<=74.0 && avg>=60.0)
                   { System.out.println("FIRST CLASS");
                    }
                    else if(avg<=59.0 && avg>=40.0)
                   { System.out.println("PASS");
                    }
                    else{System.out.println("POOR");
                    }
                }
            }
        }
        