import java.util.Scanner;


public class Number
{
	public static void main(String[] args)
	{
		int sum, sum1;
		
		Scanner kb = new Scanner(System.in);
		int random1 =  (int)(Math.random()*14) + 1;
		int random2 =  (int)(Math.random()*14) + 1;
		System.out.println("Enter the sum of "+random1+" and "+random2);
		sum = kb.nextInt(); 
		sum1 = random1 + random2;
		
		if(sum == random1 + random2){
		 System.out.print("Correct! The sum is "+sum);
        }
		else{
		 System.out.print("Incorrect! The sum is "+sum1);
	    }	
	}
}