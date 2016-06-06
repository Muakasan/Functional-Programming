//Aidan San
//muakasan@gmail.com
//https://github.com/Muakasan/Functional-Programming

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class LambdaLessonShell 
{
	public static boolean isPrime(int n)
	{
		return true;
	}

	public static void printS(Stream s)
	{
		s.forEach(i -> System.out.print(i + ", "));
		System.out.println();
	}

	public static void main(String[] args)
	{
		Integer[]ar = {60, 36, 20, 8, 43, 75, 15, 42, 87, 48, 68, 4, 82, 41, 44};
		List<Integer> l = Arrays.asList(ar);	
		
		System.out.print("The list where each element is multiplied by 2: ");
		printS(l.stream().map(x -> x*2));

		System.out.print("The list where each element has 1 added to it: ");
		printS(Stream.empty());

		System.out.print("The list with only elements greater than 40: ");
		printS(l.stream().filter(x -> x > 40));

		System.out.print("The list with only even elements: ");
		printS(Stream.empty());

		System.out.print("The sum of the list: ");
		System.out.println(l.stream().reduce(0, (x,y) -> x+y));
		
		System.out.print("The max of the list: ");
		System.out.println(0);

		System.out.print("The first 20 prime numbers: ");
		Stream primes = Stream.empty();
		printS(primes);
	}
		
}
