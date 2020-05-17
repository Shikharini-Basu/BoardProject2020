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

public class student
{
    public static void main(String name,double math,double sci,double eng,double hindi,double hcg,int rno)
    {
        System.out.println("Name of the student="+ name+"\nroll no.="+rno);
         System.out.println("math="+math+"\nscience="+sci+"\nenglish="+eng+"\nhindi"+hindi+"\nhistory,civics and geography="+hcg);
        double total= math+sci+eng+hindi+hcg;
        double avg=total/5.0;
        double percentage=(total/500.0)*100;//assuming marks out of hundred
         System.out.println("percentage="+percentage);
        if( percentage>=90)
        {  System.out.println("science with computers");
        }
            else if( percentage>=70 &&  percentage<=79)
            {  System.out.println("commerce with maths");
        } 
           else if( percentage>=60 &&  percentage<=69)
            {  System.out.println("commerce without maths");
        } 
               
             else if( percentage>=80 &&  percentage<=89)
                {System.out.println(" science without computers");
                }
            }
        }
        