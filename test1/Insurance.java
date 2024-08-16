class Insurance {
    public static void main(String args[]) {
        int age = 25, policy_amount = 150000;
        String sex = "male", location = "city", health = "excellent";
        if ((age >= 25 && age <= 35) && health=="excellent" && sex=="male" && location=="city" && policy_amount <= 200000) 
        {
            System.out.println("Insured ");
            System.out.println("Rs. 4 per thousand ");
        } 
  	else if ((age >= 25 && age <= 35) && health=="excellent" && sex=="female" && location=="city" && policy_amount <= 100000) 
	{
            System.out.println("Insured ");
            System.out.println("Rs. 3 per thousand ");
        }
        else if ((age >= 25 && age <= 35) && health=="poor" && sex=="male" && location=="village" && policy_amount <= 10000) 
	{
            System.out.println("Insured ");
            System.out.println("Rs. 6 per thousand");
        } 
	else 
        {
            System.out.println("not insured");
        }
    }
}
