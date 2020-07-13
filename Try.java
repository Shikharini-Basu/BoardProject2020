class ToAscii
{
    public void dispASCII()
    {
        char chA='A',chZ='Z', cha='a', chz='z';
        int ascA,ascZ,asca,ascz;
        ascA=(int)chA;
        ascZ=(int)chZ;
        asca=(int)cha;
        ascz=(int)chz;
        System.out.println("The ASCII value of A is=" + ascA);
        System.out.println("The ASCII value of Z is=" + ascZ);
        System.out.println("The ASCII value of a is=" + asca);
        System.out.println("The ASCII value of z is=" + ascz);
    }
}
public class Try1
public static void main(String args[])
{
    ToAscii object1;
    object1=new ToAscii();
    object1.dispASCII();
}
}

        