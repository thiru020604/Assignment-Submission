import java.util.Scanner;
public class EvenOddDetector 
{
	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter a number: ");
        	int num = scanner.nextInt();        
        	String result = checkEvenOdd(num);
        	System.out.println("The number " + num + " is " + result + ".");        
        	scanner.close();
    	}
    	public static String checkEvenOdd(int number) 
	{
        	if (number % 2 == 0) 
		{
            		return "Even";
        	} 
		else 
		{
            		return "Odd";
        	}
    	}
}
