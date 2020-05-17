 class demo
{
    int num1,num2,ans;//instance variable
    void init()//non-parameterized method,void,called,header prototype,multiple methods,non-interactive method'non-static method
    {
         num1=5;//body of method
         num2=6;// local variable
    }
    void calc()
    {
        ans=num1+num2;
    }
    void display()
    {
        System.out.println("The result is=" + ans + "\t Rs");
    }
}

 //static methods are invoked directly from a class
 //non-static methods are invoked by creating object of a class and then calling