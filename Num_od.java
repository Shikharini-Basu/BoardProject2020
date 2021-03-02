
public class Num_od
{ int f; int count=0;int sum=0;
    void Number(int num, int d)
    { while(num!=0)
        { f=num%10;
            if(d==f)
            count++;
            num/=10;
        }
        System.out.println(count);
    }
        void Number(int n1)
        { while(n1!=0)
            { f=n1%10;
            if(f%2==0)
            sum=sum+f;
            n1/=10;
        }
        System.out.println(sum);
      }
      public static void main()
      { Num_od obj= new Num_od();
          obj.Number(525,5);/* or int num=sc.nextInt() and int d=sc.nextInt();
                                 obj.Number(num,d);
                                 then we dont need to declare them in instance vars
                                 same with next*/
                                 obj.Number(2345);
        }
    }