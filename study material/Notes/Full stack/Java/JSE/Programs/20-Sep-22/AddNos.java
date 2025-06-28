class AddNos
{
	public static void main(String [] args)
	{
		System.out.println(args.length);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a+b;
		System.out.println("Sum is "+c);
	}
}