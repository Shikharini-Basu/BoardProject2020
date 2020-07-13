 public class Try1
    {  private static float feet; 
        private static int inches;
        static String convertedTo;
        public Try1()
        { feet=0; inches=0; convertedTo="empty"; }
        public Try1(float f, int i)
        { feet=f; inches=i; convertedTo= "not changed yet";
        }
       public static float convertToFeet(Try1 obj)
       { int y=obj.inches;
           float f=y;
           int fts=y/12;
            int ins=(int)(f-fts*12);
            f=fts;
            f+=(float)ins/10;
            convertedTo="feet"; /* because of call by reference this member will get changed*/
            return f;
        }
        public static int convertToInches(Try1 obj)
        { int i;
            int fts=(int)obj.feet;
            int ins= obj.inches;
            convertedTo="inches";/* coz of call byreferrence this member will get changed*/
            i= fts*12+ ins;
            return i;
        }
        public String Distance()
        { String distance=(int)feet+"\'"+inches+"\'";
            return distance;
        }
        public void TryTest()
        { Try1 objForFeet= new Try1(5,2);
            System.out.println("Distance "+objForFeet.Distance()+"is equal to"+ convertToInches(objForFeet)+" "+ convertedTo);
            Try1 objForInches= new Try1(0,16);
            System.out.println("Distance "+objForInches.Distance()+"is equal to"+ convertToFeet(objForInches)+" "+ convertedTo);
        }
    }


    
