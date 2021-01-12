import java.util.Scanner;
public class TravelPlan
{  long PlanCode;  
    String Place; 
    int number_of_travellers, Number_of_buses;
 void  NewPlan()
{ 
     Scanner sc= new Scanner(System.in);
System.out.println(“ Enter plan code" );
PlanCode=sc.nextLong;
System.out.println(“Enter place”);
Place=sc.nextLine;
System.out.println(“ Enter no. of travellers”);
Number_of_travellers=sc.nextInt();
if(Number_of_travellers<20)
{ Number_of_buses=1; }
else if(Number_of_travellers>=20 && Number_of_buses<40)
{ Number_of_buses=2;}
else 
{Number_of_buses=3;}
}

void ShowPlan()
{ 
    System.out.println(“ Plan Code=”+PlanCode);
  System.out.println(“Place =”+Place);
  System.out.println(“ No. of travellers =”+Number_of_travellers);
  System.out.println(“ No. of buses=”+Number_of_buses);
}

public static void main()
{  
TravelPlan obj2= new TravelPlan();
obj2.NewPlan();
obj2.ShowPlan ();
}
}