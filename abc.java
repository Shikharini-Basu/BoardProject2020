import java.util.Scanner;
class abc
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter name");
        String n= sc.nextLine();
        System.out.println("enter age");
        int a = sc.nextInt();
        System.out.println(n+"\n"+a);
    }
}