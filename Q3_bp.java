public class Q3_bp
{ void genNum()
    { for(int i=1;i<=20;i++)
        { double x= Math.random();
            int a= (int)(x*100);
            if(a>=1 && a<=100)
            System.out.println(a);
        }
    }
    public static void main()
    { Q3_bp obj= new Q3_bp();
        obj.genNum();
}
}