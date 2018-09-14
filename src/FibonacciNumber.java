
public class FibonacciNumber {

	public static void main(String[] args) {
		int fibCount=10;
		int []fib = new int[fibCount];
		fib[0] = 0;
		fib[1] = 1;
		int i = 2;
		do
		{
			fib[i] = fib[i-1] + fib[i-2];
			i++;
		}while(i<fibCount);
		System.out.println("List of 10 fibonacci numbers :\n");
		int j = 0;
		do
		{
			System.out.print(fib[j]+ " ");
			j++;
		}while(j<fibCount);

	}

}

