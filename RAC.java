class RAC
{
	public static void main(String[] args) 
	{
		System.out.println("Usage: java RectangleAreaCalculator <length> <width>");
		int l, w;
		l = Integer.parseInt(args[0]);
		w = Integer.parseInt(args[1]);
		int area = l * w;
		System.out.println("The area of the rectangle is: " + area);
	}
}