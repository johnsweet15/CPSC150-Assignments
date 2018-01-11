import java.util.Scanner;

public class QuizClass {

	public static void main(String [] args)
	{
		
		
		int sum = 0;
		int i = 0;
		Scanner in = new Scanner(System.in);

		while( i < 3)
		{
			System.out.print("Enter an Integer: ");
			int x = in.nextInt();
			while(x != 0)
			{
				if (x < 0)
				{
					System.out.println("NEGATIVE DETECTED, ENTER POSITIVE");
					continue;
				}
				if(x > 0)
				{
					sum = sum + x;
					i++;
					continue;
				}
				break;
			}
			



		}
		System.out.println("Sum is " + sum);

		while ( sum % 2 == 0){
			System.out.print("Even");
			break;
		}
		while ( sum % 2 == 1){
			System.out.print("Odd");
			break;
		}
			
	}
}




/*
The CS150 quiz tomorrow will be to write a short program that has the following elements:

final int NUM_INPUTS=3;

inputting the specified NUM_INPUTS of integers (make sure your program works if I  
change NUM_INPUTS to a large number (but use small integer values so sum fits in integer) 
and properly calculating the sum of input integers

After the loop you should print the sum and determine if the sum is odd or even

if the user inputs a 0 the loop should terminate early ("break").

if the user inputs a negative number it should print a message and NOT be added to the sum (do this with a 
"continue" statement to skip over sum)

You are not allowed to use an else statement in this program and only 2 if statements. ( use "continue" properly)

No methods or anything new, just loops, final, break, continue, Scanner, if , and System.out that we've been doing for weeks.

 */







