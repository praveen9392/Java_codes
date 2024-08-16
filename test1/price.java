class price
{
 public static void main(String args[])
 {
  int cost_price=50,selling_price=60;
  if (selling_price>cost_price)
  {
   System.out.println("Profit");
   int profit=selling_price-cost_price;
   System.out.println(profit);

  }
  else
  {
   System.out.println("Loss");
   int loss=cost_price-selling_price;
   System.out.println(loss);
  }
}
}