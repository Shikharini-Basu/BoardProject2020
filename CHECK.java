public class CHECK
{ public static void main()
    { String s1="RISTORANT";
        String s2="VENEZUELA";
        char c1= s2.charAt(s1.indexOf('T'));
        int n1= s1.indexOf(s2.charAt(8));
        System.out.println(c1+"\n"+n1);
    }
}    