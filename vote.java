class vote
{
public static void main(String args[])
{
 int a=20;
 int Voter_card=1;

 if (a>18)
 {
   if(Voter_card==1)
   {
    System.out.println("Eligible for vote");
   }
   else
   {
      System.out.println("Not Eligible for vote because no voter card");
   }
 }
 else
 {
 System.out.println("Not Eligible for vote,beause under Age ");
 }
}
}
