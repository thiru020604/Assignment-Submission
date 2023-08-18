public class MaxDifference 
{
    	public static void main(String[] args) 
	{
        	int[] arr = {7, 9, 5, 6, 3, 2};
        	int result = maxDifference(arr);
        	System.out.println("The difference between the two largest elements is: " + result);
    	}
   	public static int maxDifference(int[] arr) 
	{
        	if (arr.length < 2) 
		{
            		return -1; // Not enough elements to calculate a difference
        	} 
        	int maxDiff = Integer.MIN_VALUE;
        	int maxElement = Math.max(arr[0], arr[1]);
        	int minElement = Math.min(arr[0], arr[1]);    
        	for (int i = 2; i < arr.length; i++) 
		{
            		if (arr[i] > maxElement) 
			{
                		maxDiff = Math.max(maxDiff, maxElement - minElement);
                		maxElement = arr[i];
            		} 	
			else if (arr[i] < minElement) 
			{
                		minElement = arr[i];
            		}
        	}     
        	maxDiff = Math.max(maxDiff, maxElement - minElement);        
        	return maxDiff;
    	}
}
