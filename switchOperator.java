class switchOperator
{
  public static void main(String[] args) 
   {
        int a=5,b=6;
        String c="%";
        
        switch(c)
        {
        case "+":
                 System.out.println(a+b);
                 break;
        case "-":
       		System.out.println(a-b);
                break;
        case "/":
	        System.out.println(a/b);
                break;
        case "%":
                System.out.println(a%b);
                break;
        default:
                System.out.println("invalid input");
	}

    }
}
