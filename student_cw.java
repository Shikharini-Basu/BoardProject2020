public class student_cw
{
    String name; int age,m1,m2,m3,maximum;double average;
    
    student_cw( String Name,int Age,int marks1,int marks2,int marks3)
    { 
    }
    student_cw(){}
    void Accept( String Name,int Age,int marks1,int marks2,int marks3)
    { name=Name; age=Age; m1=marks1; m2=marks2; m3=marks3;
    }
    void calc()
    { average= (m1+m2+m3)/3.0;
        maximum= (m1>m2&& m1>m3)?m1:(m2>m1&&m2>m3)? m2:m3;
    }
    void display()
    { System.out.println(" name="+ name);
       System.out.println(" age="+ age);
       System.out.println(" marks1="+ m1);
       System.out.println(" marks2="+ m2);
       System.out.println(" marks3="+ m3);
       System.out.println(" average="+average);
       System.out.println(" max marks="+ maximum);
    }
    public static void main(String args[])
    {
        student_cw obj1= new student_cw(" diya", 14, 70,80,90);
        student_cw obj2= new student_cw();
        obj2.Accept(" diya", 14, 70,80,90);
        obj2.calc();
        obj2.display();
    }
}
        
        
        
        
        
        
        
         