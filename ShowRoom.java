public class ShowRoom
{ 
    String name;long mobno; double cost,dis,amount;
    public ShowRoom()
    { name=" "; mobno=0; cost=0.0;
    }
    void input(String Name, long Mobile_no,double Cost)
    { name=Name;
        mobno=Mobile_no;
        cost=Cost;
    }
    void calculate()
    { if(cost<= 10000)
        { dis=(5*cost)/100.0;
            amount= cost-dis;
        }
       else if(cost>10000 && cost<=20000)
        { dis=(10*cost)/100.0;
            amount= cost-dis;
        }
        else if(cost>20000 && cost<=35000)
        { dis=(15*cost)/100.0;
            amount= cost-dis;
        }
        else if(cost>35000)
        { dis=(20*cost)/100.0;
            amount= cost-dis;
        }
    }
    void display()
    { System.out.println("name="+ name);
       System.out.println("mobile no.="+ mobno);
       System.out.println("total amount="+ amount);
    }
    public static void main()
    { ShowRoom obj= new ShowRoom();
        obj.input("diya",1954218990,25000.0);
        obj.calculate();
        obj.display();
    }
    }

         
            
    