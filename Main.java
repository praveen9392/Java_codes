 class Main
{
	public static void main(String[] args) {
		int a=23,b=6,c=21;   //6 21 23
        a=(b-b)+b;
        b=(c+c)-c;
        //c=a*4-1;
        c=((a+b+c)%a+b)+2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
	}
}