class arm
{
  public static void main(String[] args)
  {
    int a = 153;
    arm obj = new arm();
    obj.armstrong(a);
    System.out.println(obj.armstrong1());
    int b=obj.armstrong2(a);
    if(b==1)
       System.out.println("Armstrong");
    else
       System.out.println("Not");

  }

  void armstrong(int num)
  {
    int n = num, count = 0, sum = 0, temp = n;
    while (n > 0)
    {
      count++;
      n = n / 10;
    }
    n = temp;
    while (n > 0)
    {
      int rem = n % 10;
      int pow = (int) Math.pow(rem, count);
      sum = sum + pow;
      n = n / 10;
    }
    if (sum == temp)
      System.out.println(num + " is an Armstrong number");
    else
      System.out.println(num + " is not an Armstrong number");
  }

  String armstrong1()
  {
    int n = 153, count = 0, sum = 0, temp = n;
    while (n > 0)
    {
      count++;
      n = n / 10;
    }
    n = temp;
    while (n > 0)
    {
      int rem = n % 10;
      int pow = (int) Math.pow(rem, count);
      sum = sum + pow;
      n = n / 10;
    }
    if (sum == temp)
      return "Armstrong number";
    else
      return "Not an Armstrong number";
  }

  int armstrong2(int num)
  {
    int n = num, count = 0, sum = 0, temp = n;
    while (n > 0)
    {
      count++;
      n = n / 10;
    }
    n = temp;
    while (n > 0)
    {
      int rem = n % 10;
      int pow = (int) Math.pow(rem, count);
      sum = sum + pow;
      n = n / 10;
    }
    if (sum == temp)
      return 1; 
    else
      return 0; 
  }
}