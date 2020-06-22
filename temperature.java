class temperature
{
    double temp;double celsius;// instance vars
    temperature(double temp)//taking temp in fahrenheit
    {this.temp= temp;
     }
    void calc()// converting to celsius
    {
       double c=(5.0*(temp-32))/9.0;
       celsius=c;
    }
    void display()
    { System.out.println("temp in Fahrenheit="+temp);
        System.out.println("temp in celsius="+ celsius);
    }
    public static void main(String args[])
    {
        temperature obj= new temperature(90.0);
        obj.calc();
        obj.display();
    }
}
