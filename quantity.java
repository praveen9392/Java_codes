class quantity
{
    public static void main(String args[])
    {
    String name="box1";
    int code=001;
    double price=300;
    int  quantity=4;
    double total=price*quantity;
    double discount;
    double gst;
    double payable;
    System.out.println(total);
    if (total>0 && total<500)
    {
        discount=0.05;
        gst=0.05;
    }
    else if(total>500 && total<1000)
    {
        discount=0.10;
        gst=0.7;
    }
    else if(total>1000 && total<1500)
    {
        discount=0.15;
        gst=0.9;
    }
    else if(total>1500 && total<2000)
    {
        discount=0.20;
        gst=0.10;
    }
    else 
    {
        discount=0.30;
        gst=0.15;
    }
    gst=price*gst;
    discount=total*discount;
    payable=total+gst-discount;
    System.out.println("payable ammout is = "+payable);

    }

}