import java.util.*;
class ArrayEveOdd
{
	public static void main (String arg[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++)
		{
			array[i] = scanner.nextInt();
		}
		int evenCount = 0;
		int oddCount = 0;
		for (int number : array) 
		{
			if (number % 2 == 0) 
			{
				evenCount++;
			} 
			else 
			{
				oddCount++;
			}
		}
		System.out.println("Number of even numbers: " + evenCount);
		System.out.println("Number of odd numbers: " + oddCount);
	}
}