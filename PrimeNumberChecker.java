import java.util.Scanner;
public class PrimeNumberChecker 
{
    	public static boolean isPrime(int number) 
	{
        	if (number <= 1) 
		{
            		return false;
        	} 
		else if (number <= 3) 
		{
            		return true;
        	} 
		else if (number % 2 == 0 || number % 3 == 0) 
		{
            		return false;
        	}
        	int i = 5;
        	while (i * i <= number) 
		{
            		if (number % i == 0 || number % (i + 2) == 0) 
			{
                		return false;
            		}
            		i += 6;
        	}
        	return true;
    	}
    	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
        	try 
		{
            		System.out.print("Enter a number: ");
            		int num = scanner.nextInt();
            		if (isPrime(num)) 	
			{
                		System.out.println(num + " is a prime number.");
            		} 
			else 
			{
                		System.out.println(num + " is not a prime number.");
            		}
        	} 
		catch (java.util.InputMismatchException e) 
		{
            		System.out.println("Invalid input. Please enter a valid integer.");
        	}
    	}
}
