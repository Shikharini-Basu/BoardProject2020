import java.util.Scanner;
public class scTry
{
    public static void main(String args[])
    { 
        System.out.println("enter num1");
        Scanner scTry= new Scanner(System.in);
        int num1=scTry.nextInt();
         System.out.println("enter num2");
         int num2=scTry.nextInt();
         int num3=num1+num2;
         System.out.println("num1="+num1+"\nnum2="+num2+"\nadd of both="+num3);
        }
    }
    