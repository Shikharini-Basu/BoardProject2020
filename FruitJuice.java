public class FruitJuice
{
    int product_code,pack_size,product_price; String flavour, pack_type;
    FruitJuice()
    {  product_code=0;pack_size=0;product_price=0;  flavour=" "; pack_type=" ";
    }
    void input( int ProdCode, int PackSize, int ProdPrice, String Flavour, String PackType)
    { product_code=ProdCode;
        pack_size= PackSize;
        product_price=  ProdPrice;
        flavour= Flavour;
        pack_type= PackType;
    }
    void discount()
    { product_price-=10;
    }
    void display()
    { System.out.println(" product code="+ product_code+ "\n type of pack="+ pack_type+ "\n pack size in ml="+ pack_size);
        System.out.println(" Flavour="+ flavour+"\n price of product="+ product_price);
    }
    public static void main(String args[])
    {
        FruitJuice obj= new FruitJuice();
        obj.input( 56784, 500, 30, "orange", "PET bottle");
        obj.discount();
        obj.display();
    }
}
        