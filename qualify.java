class qualify
{
    public static void main(String args[])
    {
        String b1="btech",b2="Mtech",b3="Mca";
        double percentage=60;
        int yop1=2023,yop2=2024;
        String  skill ="basic programming";
        int fee=25000;
        int discount;
        if(b1=="btech" || b2=="Mtech" || b3=="Mca" || percentage>=60 || yop1==2023 ||yop2==2024 || skill=="basic programming" )
        {
            discount=20000;
            fee=fee-discount;
            System.out.println("payable fee="+fee);
        }
        else
        {
            System.out.println("payable fee="+fee);
        } 
        

    }
}