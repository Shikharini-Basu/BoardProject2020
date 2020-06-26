public class account
{  
   double balance;//instance vars
   account()
        { 
            balance=0;
        }
      void startAccount(double amt)
      { balance=amt;
        }
        void deposit(double amt)
        {
            balance+=amt;
        }
       void withdraw(double amt)
        {
            if(amt<=balance)
            {
            balance-=amt;
             System.out.println("withdrawal amt= "+ amt);
        }
        else
        {
            System.out.println("not enough balance to withdraw "+ amt);
        }}
        double getBalance()
        { return balance;}
        
        public static void main(String name, long acc_no, String type)
        {
             System.out.println("name="+ name +"\n account no.="+ acc_no+"\ntype of account="+type);
            account my_acc = new account();//creating an empty and new account
            my_acc.startAccount(1000.0);
             my_acc.deposit(250.0);// depositing savings
              System.out.println("current balance="+my_acc.getBalance());
               my_acc.withdraw(50.0);
               System.out.println("rem balance after withdraw="+my_acc.getBalance());
            }
        }
    

  