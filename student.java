/**A class, namely Student, has three data members viz. Name. Roll No. and
Marks of five subjects. The stream is assigned which is based on the following
criteria:
Average Marks Stream
90% or above Science with Computers
80% — 89% Science without Computers
70% — 79% Commerce with Maths
60% — 69% Commerce without Maths
Write a program to declare the class, ‘Student’, and define the method of
allotment of subjects*/

import java.util.Scanner;
public class student
{   String name;double math;double sci;double eng;double hindi;double hcg;int rno;
    void init()
    { Scanner sc=new Scanner(System.in);
        System.out.println("Name of the student=");
        name=sc.nextLine();
        System.out.println("roll no.=");
        rno=sc.nextInt();
        System.out.println("enter marks of 5 subjects");
        math=sc.nextInt();
        sci=sc.nextInt();
        eng=sc.nextInt();
        hindi=sc.nextInt();
        hcg=sc.nextInt();
    }
    void compute()
    {    double total= math+ sci+ eng+ hindi+ hcg;
        double avg=total/5.0;//assuming marks out of hundred
        System.out.println(avg);
        if(avg>=90)
        {  System.out.println("science with computers");
        }
            else if( avg>=70 && avg<=79)
            {  System.out.println("commerce with maths");
        } 
           else if( avg>=60 &&  avg<=69)
            {  System.out.println("commerce without maths");
        } 
               
             else if( avg>=80 && avg<=89)
                {System.out.println(" science without computers");
                }
                else
                return;
    }
    public static void main()
    {
        student obj=new student();
        obj.init();
        obj.compute();
         
            }
        }
        