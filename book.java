public class book
{
    String getTitle( String title)
    {
       return title;
       }
String getCode( String code)
{
return code;
}
double getPrice( double price)
{ return price;
}
public static void main(String args[])
{
book obj= new book();
System.out.println("name="+ (obj.getTitle("The fault in our stars")));
System.out.println("code="+(obj.getCode("fiction:1234")));
System.out.println("price="+(obj.getPrice(275.0)));
}
}
 