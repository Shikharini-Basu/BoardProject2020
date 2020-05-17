class AreaOverloading
{
    double pi=3.14;
    void printarea(int a)
    {
        int square=a*a;
        System.out.println("side of square="+a+"\narea of square="+square);
    }
    void printarea(double l,double b)
    {
        double rect=l*b;
         System.out.println("sides of rectangle="+l+"\tand\t"+b+"\narea of rectangle="+rect);
        }
    void printarea(double r)
    {
        double circle=pi*r*r;
        System.out.println("radius of circle="+r+"\narea of circle="+circle);
    }
    public static void main ()
    {
        AreaOverloading obj=new AreaOverloading();
        obj.printarea(5);
        obj.printarea(6.0,4.0);
         obj.printarea(4.0);
        }
    }
    