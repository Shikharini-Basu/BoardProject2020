public class max_min
{ public static void main(int a,int b,int c)
    { int d= Math.max(Math.max(a,b),c);
        System.out.println(d);
        int e=(a>b && a>c)?a:(b>a && b>c)?b:c;
        System.out.println(e);
    }
}