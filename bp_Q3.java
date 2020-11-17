public class bp_Q3
{
  void compute()
   { Scanner in = new Scanner(System.in);
  System.out.println("Enter lower range");
  int minimum=in.nextInt();
  
  System.out.println("Enter upper range");
  int maximum=in.nextInt();
  
  int randomNum = minimum + (int)(Math.random() * maximum);
  
  System.out.println("Random Number= "+randomNum);}}}