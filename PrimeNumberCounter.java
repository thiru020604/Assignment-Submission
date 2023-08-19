public class PrimeNumberCounter 
{
    	public static boolean isPrime(int num) 
	{
        	if (num <= 1) 
		{
            		return false;
        	}
        	if (num <= 3) 
		{
            		return true;
        	}
        	if (num % 2 == 0 || num % 3 == 0) 
		{
            		return false;
        	}
        	int i = 5;
        	while (i * i <= num) 
		{
            		if (num % i == 0 || num % (i + 2) == 0) 
			{
                		return false;
            		}
            		i += 6;
        	}
        	return true;
    	}
   	public static int countPrimesInArray(int[] arr) 
	{
        	int count = 0;
        	for (int num : arr) 
		{
            		if (isPrime(num)) 
			{
                		count++;
            		}
        	}
        	return count;
    	}
    	public static void main(String[] args) 
	{
        	int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        	int result = countPrimesInArray(arr);
        	System.out.println("The number of prime numbers in the array is: " + result);
    	}
}
