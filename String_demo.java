 public class String_demo
 { 
    public static void main()
    { String str="ABCDEFG";
        int len= str.length();
        int i1=str.indexOf('A');
       String str1= "ABCDABCD";
       int i2=str1.indexOf('A', 2);
       int i3=str1.indexOf("AB");
       int i4=str1.indexOf("AB",0);
       int i5=str1.indexOf("DE",0);
       String i6= str.substring(2,6);
       String i7= str.substring(2);
       String i8= str.toLowerCase();
       String str2=" AbcDE";
       String i9= str.toUpperCase();
       System.out.println(len); System.out.println(i1); System.out.println(i2); System.out.println(i3); System.out.println(i4);System.out.println(i5);
       System.out.println(i6);System.out.println(i7);System.out.println(i8);System.out.println(i9);
        
       System.out.println(str1.charAt(2));
        System.out.println(str1.concat(str2));
         System.out.println(str1.endsWith("DE"));
          System.out.println(str1.replace('A','Z'));
           System.out.println(str1.lastIndexOf('A'));
           
           String str3= "     abds     jghfg         ";
            System.out.println(str3.trim());
            
        
            String str4="Dog"; String str5="dog";
             System.out.println(str4.compareTo(str5));
              System.out.println(str4.equals(str5));
               System.out.println(str4.equalsIgnoreCase(str5));
               
               double d=2.13;
               System.out.println(str1.valueOf(d));
}
  }
    
