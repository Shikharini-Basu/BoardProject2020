public class TriangleArea
{
    double base,height,side1,side2,side3;
    void area(double b,double h)
    { 
        double Area1= (1/2.0)*b*h;
        System.out.println("area1 i.e. base and height are input="+ Area1);
        
    }
    void area( double s1,double s2,double s3)
    {
        
       double s= (s1+s2+s3)/2.0;
      double Area2= Math.sqrt(( s*(s-s1)*(s-s2)*(s-s3)));
      System.out.println("area2 i.e. 3 sides are input="+ Area2);
    }
    
    public static void main(String args[])
    {
        TriangleArea obj= new TriangleArea();
        obj.area( 5.0,10.0);
        obj.area(12.0,14.0,3.0);
       
    }
}
        
  
    