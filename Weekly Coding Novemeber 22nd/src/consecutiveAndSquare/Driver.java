package consecutiveAndSquare;

import java.util.Arrays;

public class Driver {
	
	public static void main(String[] args)
	{
		String example1 = "232425";
		String example2 = "23324256";
		String example3 = "444445";
	    System.out.println("String: " + example1);
	    int start = isConsecutive(example1);
	    if (start != -1)
	        System.out.println("Yes \n" + start);
	    else
	        System.out.println("No");
	 
	    
	    System.out.println("\nString: " + example2);
	    start = isConsecutive(example2);
	    if (start != -1)
	        System.out.println("Yes \n" + start);
	    else
	        System.out.println("No");
	    
	    System.out.println("\nString: " + example3);
	    start = isConsecutive(example3);
	    if (start != -1)
	        System.out.println("Yes \n" + start);
	    else
	        System.out.println("No");
	    
	    
	    
	    int num4 = 5;
	    int num5 = 3;
	    int num6 = 1;
	    int num7 = 0;
	    squareNumbers(num4);
		squareNumbers(num5);
		squareNumbers(num6);
		squareNumbers(num7);
	    
	    
	    
	}

	private static int isConsecutive(String str) {
		int start;
		 
		 int length = str.length();
		 
		 for (int i = 0; i < length / 2; i++)
		    {
		 
		        String new_str = str.substring(0, i + 1);
		 
		        int num = Integer.parseInt(new_str);
		 
		        start = num;
		 
		        while (new_str.length() < length)
		        {
		            
		            num++;
		 
		            new_str = new_str + String.valueOf(num);
		        }
		 
		       
		        if (new_str.equals(str))
		        return start;
		    }
		return -1;
	}
	
	public static void squareNumbers(int num) {
		if (num == 0) {
			System.out.println("\n");
			System.out.println("[]");
		}
	
		else {
			int[][] square = new int[num][num];
	
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					square[i][j] = num;
				}
			}
			System.out.println("\n");
	
			for (int k = 0; k < square.length; k++) {
				System.out.println(Arrays.toString(square[k]));
			}
			
			
		}
	
	}
}

	

